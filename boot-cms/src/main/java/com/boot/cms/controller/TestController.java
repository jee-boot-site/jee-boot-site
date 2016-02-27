package com.boot.cms.controller;

import com.boot.cms.dao.ArticleDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kings on 16/2/27.
 */
@Controller
public class TestController {
    @Autowired
    private ArticleDataMapper articleDataMapper;
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println(articleDataMapper.selectAll());;

        return "1";
    }
}
