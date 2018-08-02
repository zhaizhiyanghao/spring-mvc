package com.springmvc.service;

import com.springmvc.entity.User;

/**
 * @author zhaizhiyang
 * @date 2018/8/2
 **/
public interface UserService {
    User findByUsernameAndPwd(String username, String password);

}
