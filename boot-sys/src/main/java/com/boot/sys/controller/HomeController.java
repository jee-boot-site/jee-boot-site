package com.boot.sys.controller;

import com.alibaba.fastjson.JSON;
import com.boot.sys.dao.UserMapper;
import com.boot.sys.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class HomeController {

    private   Logger logger = LoggerFactory .getLogger(HomeController.class);

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/")
    String index(Model model) {
        System.out.println(userMapper.selectAll());
        logger.info(JSON.toJSONString(userMapper.selectAll()));
        model.addAttribute("now", LocalDateTime.now());
        return "index";
    }

    @RequestMapping("getUserList")
    public @ResponseBody  List<User> getUserList(){
        Example example = new Example(User.class);
        example.selectProperties("loginName","name");
        example.createCriteria().andCondition("id=", 10);
        return userMapper.selectByExample(example);
    }

    @RequestMapping("/home")
    String home(Model model) {
        return "index";
    }


    @RequestMapping("/userProfile")
    public String  userProfile(){
        return "userProfile";
    }

    @RequestMapping("userList")
    public String userList(){

        return "userList";
    }
    //-----------------------------------
    @RequestMapping("properties")
    @ResponseBody
    java.util.Properties properties() {
        return System.getProperties();
    }

    /*@RequestMapping("login")
    String login(ModelMap model){
        //User user = new User("admin","admin");
        model.put("user",new User());
        return "login";
    }*/

    /*@RequestMapping("doLogin")
    String loginHandler(@Valid @ModelAttribute("user") User user, BindingResult bindingResult){
        logger.info(JSON.toJSONString(user));
        if(user == null)
            System.out.println("null");
        else {
            logger.error(user.getName());
            //bindingResult.rejectValue("account", "user.not.exist","用户不存在");
            bindingResult.rejectValue("loginName", "user.not.exist");
        }
        return "login";
    }*/

}
