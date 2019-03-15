package com.spring.web.dao;

/**
 * Created by Administrator on 2019/3/14.
 */
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用DAO接口
 */
public interface BaseDAO<T> extends Mapper<T>, MySqlMapper<T> {
}