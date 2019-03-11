package com.spring.orm.service.impl;

import com.spring.orm.entity.User;
import com.spring.orm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/3/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring_mybatis.xml"})
public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void insertUser() throws Exception {
        User user=new User();
        user.setAccount("test");
        user.setPassword("888888");
        user.setCredits(999);
        int n=userService.insertUser(user);
        assertEquals(1,n);
    }

    @Test
    public void deleteUser() throws Exception {
        int n=userService.deleteUser(4);
        assertEquals(1,n);
    }

    @Test
    public void updateUser() throws Exception {
        User user=userService.getUser(1);
        user.setPassword("00000");
        user.setCredits(99999);
        int n=userService.updateUser(user);
        assertEquals(1,n);
    }

    @Test
    public void selectUsers() throws Exception {
        List<User> user=userService.selectUsers();
        user.forEach(user1 -> System.out.println(user));
    }

    @Test
    public void getUser() throws Exception {
        User user=userService.getUser(5);
        System.out.println(user);
    }

}