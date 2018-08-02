package com.springmvc.dao;

import com.springmvc.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhaizhiyang
 * @date 2018/8/2
 **/
public interface UserDao {

    User findByUsernameAndPwd(@Param("username") String username, @Param("password")String password);
}
