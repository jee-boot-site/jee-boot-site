package com.boot.common;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by Ming on 2016/2/25.
 */
public abstract  class BaseServer<T> {

    @Autowired
    protected Mapper<T> mapper;

    public int save(T entity){
        return mapper.insertSelective(entity);
    }


}
