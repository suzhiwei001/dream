package com.szw.dream.service.impl;

import com.szw.dream.mapper.UserBaseMapper;
import com.szw.dream.po.UserBase;
import com.szw.dream.service.UserBaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserBaseServiceImpl implements UserBaseService {
    @Resource
    private UserBaseMapper userBaseMapper;
    @Override
    public UserBase queryUser(Long Uid) {
        UserBase userBase = userBaseMapper.selectByPrimaryKey(Uid);
        return userBase;
    }
}
