package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhaizhiyang
 * @date 2018/8/15
 **/
@Controller
public class HomeController {

    @RequestMapping
    public String home() {
        return "home";
    }
}
