package com.snow.common.Mapper;

import java.util.List;

/**
 * 基础mapper
 * @param <T>
 */
public interface BaseMapper<T> {
    int deleteByPrimaryKey(String id);

    int insert(T t);

    T selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);

    T selectByColumnName(T t);
}
