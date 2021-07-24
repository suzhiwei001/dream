package com.szw.dream.mapper;

import com.szw.dream.po.UserBase;

public interface UserBaseDao {
    int deleteByPrimaryKey(Integer uid);

    int insert(UserBase record);

    int insertSelective(UserBase record);

    UserBase selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(UserBase record);

    int updateByPrimaryKey(UserBase record);
}