package com.spring.orm.Aop;

import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2019/3/8.
 */
public class BeforeAdvice {
    private static final org.slf4j.Logger logger=  LoggerFactory.getLogger(BeforeAdvice.class);
    public void beforeMethods(){
        logger.info("连接数据库。。。");
    }
}
