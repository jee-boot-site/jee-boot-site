package com.boot.sys.security;

import com.alibaba.fastjson.JSON;
import com.boot.common.utils.Encodes;
import com.boot.sys.entity.User;
import com.boot.sys.service.SystemService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by Ming on 2016/2/25.
 */
@Component
public class SystemAuthorizingRealm extends AuthorizingRealm {

    private Logger logger = LoggerFactory.getLogger(SystemAuthorizingRealm.class);

    @Autowired
    private SystemService systemService;
    /**
     * 授权回调
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;

    }

    /**
     * 身份认证回调函数
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.info(JSON.toJSONString(authenticationToken));
        final UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        final String name = token.getUsername();
        // 校验用户名密码
        User user = systemService.getByLoginName(name);

        if(user == null)
            throw new UnknownAccountException("msg:账号不存在.");


        if ("0".equals(user.getLoginFlag())){
            throw new AuthenticationException("msg:该已帐号禁止登录.");
        }

        logger.info("====================");

        byte[] salt = Encodes.decodeHex(user.getPassword().substring(0, 16));
        return new SimpleAuthenticationInfo(new Principal(user, token.isMobileLogin()),
                user.getPassword().substring(16), ByteSource.Util.bytes(salt), getName());


    }



    /**
     * 授权用户信息
     */
    public static class Principal implements Serializable {

        private static final long serialVersionUID = 1L;

        private String id; // 编号
        private String loginName; // 登录名
        private String name; // 姓名
        private boolean mobileLogin; // 是否手机登录


        public Principal(User user, boolean mobileLogin) {
            this.id = user.getId();
            this.loginName = user.getLoginName();
            this.name = user.getName();
            this.mobileLogin = mobileLogin;
        }

        public String getId() {
            return id;
        }

        public String getLoginName() {
            return loginName;
        }

        public String getName() {
            return name;
        }

        public boolean isMobileLogin() {
            return mobileLogin;
        }

        @Override
        public String toString() {
            return id;
        }

    }
}
