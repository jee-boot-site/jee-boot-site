package com.boot.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

/**
 * Created by Ming on 2016/2/23.
 */
@Controller
public class TestController {

    @RequestMapping("/test2")
    String index(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        return "index";
    }
}