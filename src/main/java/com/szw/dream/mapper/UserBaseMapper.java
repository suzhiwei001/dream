package com.szw.dream.mapper;

import com.szw.dream.po.UserBase;
import com.szw.dream.po.UserBaseExample;
import java.util.List;

public interface UserBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base
     *
     * @mbg.generated
     */
    int insert(UserBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base
     *
     * @mbg.generated
     */
    int insertSelective(UserBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base
     *
     * @mbg.generated
     */
    List<UserBase> selectByExample(UserBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base
     *
     * @mbg.generated
     */
    UserBase selectByPrimaryKey(Long uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserBase record);
}