package com.spring.Aop;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

/**
 * Created by Administrator on 2019/3/8.
 */
public class UserDAOImpl implements UserDAO {
    private static final org.slf4j.Logger logger= LoggerFactory.getLogger(UserDAO.class);
    @Override
    public void insert() {
        logger.info("开始进行插入操作。。。");
    }
}
