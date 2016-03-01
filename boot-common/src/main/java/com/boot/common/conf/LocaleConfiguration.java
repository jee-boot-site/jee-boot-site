package com.boot.common.conf;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

/**
* Created by Ming on 2016/2/22.
 * 国家化支持配置
*/
@Configuration
public class LocaleConfiguration  extends WebMvcConfigurerAdapter {

   /**
    *  Thymeleaf LocaleResolver
    */
   @Bean(name = "localeResolver")
   public LocaleResolver localeResolver() {
       SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
       sessionLocaleResolver.setDefaultLocale(Locale.CANADA);
       return sessionLocaleResolver;
   }

   @Override
   public void addInterceptors(InterceptorRegistry registry) {
       LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
       localeChangeInterceptor.setParamName("lang");
       registry.addInterceptor(localeChangeInterceptor);
   }

   @Bean
   public MessageSource messageSource() {
       ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
       //messageSource.setBasenames("classpath:/i18n/messages", "classpath:/i18n/application");
       messageSource.setBasenames("classpath:/i18n/messages");
       messageSource.setDefaultEncoding("UTF-8");
       return messageSource;
   }

}