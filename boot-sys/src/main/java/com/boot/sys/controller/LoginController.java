package com.boot.sys.controller;

import com.boot.common.web.BaseController;
import com.boot.sys.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Ming on 2016/2/25.
 */
@Controller
public class LoginController extends BaseController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        logger.info("Test");

        model.put("user", new User());
        return "login";
    }

    /**
     * 登录失败，真正登录的POST请求由Filter完成
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginFail(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        logger.info("+++++++++++");
        model.put("user", new User());
        return "login";
    }
}
