package com.boot.sys.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.boot.sys.dao.UserMapper;
import com.boot.sys.entity.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class HomeController {

    private   Logger logger = LoggerFactory .getLogger(HomeController.class);

    @Autowired
    UserMapper userMapper;

    //测试 mybatis 查询
    @RequestMapping("/")
    String index(Model model) {
        System.out.println(userMapper.selectAll());
        logger.info(JSON.toJSONString(userMapper.selectAll()));
        model.addAttribute("now", LocalDateTime.now());
        return "index";
    }

    //  分页 demo
    @RequestMapping("getUserListData")
    public @ResponseBody  JSONObject getUserListData(@RequestParam(value="pageNumber",defaultValue="1",required=true)Integer page,
                                                  @RequestParam(value="pageSize",defaultValue="2",required=true)Integer pageSize){
        logger.info("pageNumber "+page +"  pageSize " +pageSize);
        PageHelper.startPage(page, pageSize);

        Example example = new Example(User.class);
        example.selectProperties("loginName","name");
        List<User> result = userMapper.selectByExample(example);

        PageInfo<User> pageResult = new PageInfo<User>(result);

        JSONObject jsonobj = new JSONObject();
        jsonobj.put("total",pageResult.getTotal());
        jsonobj.put("rows", result);

        return jsonobj;
    }

    //  主页
    @RequestMapping("/home")
    String home(Model model) {
        logger.info("登陆成功");
        return "index";
    }


    @RequestMapping("/userProfile")
    public String  userProfile()
    {
        return "userProfile";
    }

    @RequestMapping("userList")
    public String userList(){
        logger.info("getUserList");
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
    }

    @RequestMapping("getUserList")
    public @ResponseBody  JSONObject getUserList(HttpServletRequest request){

        String offset = request.getParameter("offset");
        String limit = request.getParameter("limit");
        String pageNumber = request.getParameter("pageNumber");

        if(StringUtils.isBlank(offset))
            logger.info("offset 为空" );
        else
            logger.info("offset is "+ offset);

        if(StringUtils.isBlank(limit))
            logger.info("limit 为空" );
        else
            logger.info("limit is "+ limit);

        JSONObject jsonobj = new JSONObject();
        jsonobj.put("total",100);

        Example example = new Example(User.class);
        example.selectProperties("loginName","name");

        List<User> result = userMapper.selectByExample(example);

        jsonobj.put("rows", result);

        return jsonobj;
    }

    */

}
