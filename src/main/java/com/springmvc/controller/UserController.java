package com.springmvc.controller;

import com.alibaba.fastjson.JSONObject;
import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhaizhiyang
 * @date 2018/8/2
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/query" )
    @ResponseBody
    public String query(@RequestParam(value = "username") String username, @RequestParam(value = "password")String password) {
        User user = userService.findByUsernameAndPwd(username, password);
        if (user == null) {
            return "用户信息不存在";
        }
        return JSONObject.toJSON(user).toString();
    }
}