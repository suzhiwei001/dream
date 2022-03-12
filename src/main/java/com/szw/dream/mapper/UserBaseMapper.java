package com.szw.dream.mapper;

import com.szw.dream.po.UserBase;
import com.szw.dream.po.UserBaseExample;
import java.util.List;

public interface UserBaseMapper {
    int insert(UserBase record);

    int insertSelective(UserBase record);

    List<UserBase> selectByExample(UserBaseExample example);

    UserBase selectByPrimaryKey(Long uid);

    int updateByPrimaryKeySelective(UserBase record);

    int updateByPrimaryKey(UserBase record);

    List<UserBase> selectUserAll();

}