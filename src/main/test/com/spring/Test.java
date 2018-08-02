package com.spring;

import com.springmvc.dao.UserDao;

import static org.mockito.Mockito.*;
public class Test {

   @org.junit.Test
    public void testMock() {
       UserDao user = mock(UserDao.class);
       user.findByUsernameAndPwd("admin","123");
    }
}
