package com.szw.dream.service.impl;

import com.szw.dream.mapper.UserBaseDao;
import com.szw.dream.po.UserBase;
import com.szw.dream.service.UserBaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserBaseServiceImpl implements UserBaseService {
    @Resource
    private UserBaseDao userBaseDao;
    @Override
    public UserBase queryUserBaseByUid(Integer uid) {
        System.out.println("service");
        return userBaseDao.selectByPrimaryKey(uid);
    }
}
