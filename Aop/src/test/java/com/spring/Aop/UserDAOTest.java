package com.spring.Aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2019/3/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"/beans.xml"})
public class UserDAOTest {
    @Autowired
    private UserDAO userDAO;
    @Test
    public void insert() throws Exception {
        userDAO.insert();
    }

}