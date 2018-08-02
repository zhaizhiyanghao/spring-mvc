package com.springmvc.dao.impl;

import com.springmvc.dao.UserDao;
import com.springmvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhaizhiyang
 * @date 2018/8/2
 **/
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByUsernameAndPwd(String username, String password) {
        return userDao.findByUsernameAndPwd(username, password);
    }
}
