package com.spring;

import com.springmvc.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.mockito.Mockito.*;
public class Test {

   @org.junit.Test
    public void testMock() {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mvc.xml");
       UserDao userDao = mock(UserDao.class);
       verify(userDao, times(1)).findByUsernameAndPwd("admin","123");
    }
}
