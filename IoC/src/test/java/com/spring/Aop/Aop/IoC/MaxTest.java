package com.spring.Aop.Aop.IoC;

import com.spring.Aop.IoC.Max;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;
//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//配置文件路径
@ContextConfiguration(locations = {"/beans.xml"})
/**
 * Created by Administrator on 2019/3/4.
 */
public class MaxTest {
    //自动注入
    @Autowired
    private Max max;

    @Test
    public void getMax() throws Exception {
        assertEquals(5,max.getMax());
    }
}