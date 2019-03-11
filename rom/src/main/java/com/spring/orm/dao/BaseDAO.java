package com.spring.orm.dao;

/**
 * Created by Administrator on 2019/3/11.
 */

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface BaseDAO<T> extends Mapper<T>,MySqlMapper<T>{

}
