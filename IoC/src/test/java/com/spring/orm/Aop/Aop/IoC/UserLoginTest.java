package com.spring.orm.Aop.Aop.IoC;

import com.spring.orm.Aop.IoC.UserLogin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)            //指定单元测试环境
@ContextConfiguration(locations = {"/beans.xml"})  //配置文件路径
public class UserLoginTest {
    @Autowired
    private UserLogin userLogin;
    @Test
    public void userLogin() throws Exception {
        assertEquals(true,userLogin.UserLogin(userLogin.getUser()));
    }
}