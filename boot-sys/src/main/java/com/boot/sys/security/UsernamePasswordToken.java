package com.boot.sys.security;

/**
 * Created by Ming on 2016/2/24.
 */
public class UsernamePasswordToken extends org.apache.shiro.authc.UsernamePasswordToken {

    private static final long serialVersionUID = 1L;

    private String captcha;
    private boolean mobileLogin;

    public UsernamePasswordToken() {
        super();
    }

    public UsernamePasswordToken(String username, char[] password,
                                 boolean rememberMe, String host, String captcha, boolean mobileLogin) {
        super(username, password, rememberMe, host);
        this.captcha = captcha;
        this.mobileLogin = mobileLogin;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public boolean isMobileLogin() {
        return mobileLogin;
    }

}