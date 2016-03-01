package com.boot.sys.conf;

import com.boot.sys.security.FormAuthenticationFilter;
import com.boot.sys.security.SystemAuthorizingRealm;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.cas.CasFilter;
import org.apache.shiro.mgt.RememberMeManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.mgt.ValidatingSessionManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.PassThruAuthenticationFilter;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 * Created by Ming on 2016/2/24.
 */

@Configuration
public class ShiroConfig {

    private static Logger logger = LoggerFactory.getLogger(ShiroConfig.class);

    @Bean
    public ShiroFilterFactoryBean shiroFilter() throws Exception {
        logger.debug("create shiro filter.");

        Map<String, Filter> filters = new HashMap<>();
        filters.put("authc", new FormAuthenticationFilter());
        filters.put("vasFilter", casFilter());
        filters.put("pass",new PassThruAuthenticationFilter());


        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setLoginUrl("/login");
        shiroFilterFactoryBean.setSuccessUrl("/home");
        shiroFilterFactoryBean.setUnauthorizedUrl("/unauthorized");
        shiroFilterFactoryBean.setFilters(filters);
        shiroFilterFactoryBean.setSecurityManager(securityManager());
        PassThruAuthenticationFilter a = new PassThruAuthenticationFilter();


        final LinkedHashMap<String, String> filterChains = new LinkedHashMap<>();
        filterChains.put("/login", "authc");
        filterChains.put("/home","pass");
        filterChains.put("/logout","logout");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChains);
        return shiroFilterFactoryBean;
    }

    @Bean(name = "securityManager")
    public org.apache.shiro.mgt.SecurityManager securityManager() {
        logger.debug("create security manager.");
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setSessionManager(sessionManager());
        securityManager.setRememberMeManager(rememberMeManager());
        securityManager.setCacheManager(cacheManager());
        securityManager.setRealm(realm());
        return securityManager;
    }

    //使用shiro默认的Session dao
    @Bean(name = "sessionManager")
    public ValidatingSessionManager sessionManager() {
        logger.debug("create session manager.");

        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        sessionManager.setGlobalSessionTimeout(1800000);
        //sessionManager.setSessionDAO(new EnterpriseCacheSessionDAO());
        sessionManager.setCacheManager(cacheManager());
        return sessionManager;
    }



    @Bean(name = "realm")
    @DependsOn("lifecycleBeanPostProcessor")
    public AuthorizingRealm realm() {
        SystemAuthorizingRealm realm = new SystemAuthorizingRealm();
        return realm;
    }

    @Bean(name = "shiroCacheManager")
    public CacheManager cacheManager() {
        logger.debug("create cache mamager.");
        EhCacheManager cacheManager = new EhCacheManager();
        //cacheManager.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");

        return cacheManager;
    }

    @Bean(name="asFilter")
    public CasFilter casFilter(){
        CasFilter casFilter = new CasFilter();
        casFilter.setFailureUrl("/login");
        return  casFilter;
    }
    @Bean
    public RememberMeManager rememberMeManager() {
        logger.debug("create remember me manager.");

        SimpleCookie simpleCookie = new SimpleCookie("rememberMe");
        simpleCookie.setHttpOnly(true);
        simpleCookie.setMaxAge(2592000);

        CookieRememberMeManager rememberMeManager = new CookieRememberMeManager();
        rememberMeManager.setCookie(simpleCookie);
        return rememberMeManager;
    }

    @Bean
    public static LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    @DependsOn("lifecycleBeanPostProcessor")
    public static DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }

}
