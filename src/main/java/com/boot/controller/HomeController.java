package com.boot.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.boot.model.User;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.time.LocalDateTime;

@Controller
public class HomeController {

    @RequestMapping("/")
    String index(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        return "index";
    }

    @RequestMapping("/index2")
    String index2(Model model) {
        return "index2";
    }

    @RequestMapping("properties")
    @ResponseBody
    java.util.Properties properties() {
        return System.getProperties();
    }

    @RequestMapping("login")
    String login(ModelMap model){
        //User user = new User("admin","admin");
        model.put("user",new User());
        return "login";
    }

    @RequestMapping("doLogin")
    String loginHandler(@Valid @ModelAttribute("user") User user, BindingResult bindingResult){
       // System.out.println(JSONUtils.toJSONString(user));
        if(user == null)
            System.out.println("null");
        else {
            System.out.println(user.getAccount());
            //bindingResult.rejectValue("account", "user.not.exist","用户不存在");
            bindingResult.rejectValue("account", "user.not.exist");
        }
        return "login";
    }

}
