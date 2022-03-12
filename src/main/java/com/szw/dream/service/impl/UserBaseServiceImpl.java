package com.szw.dream.service.impl;

import com.szw.dream.mapper.UserBaseMapper;
import com.szw.dream.po.UserBase;
import com.szw.dream.service.UserBaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserBaseServiceImpl implements UserBaseService {
    @Resource
    private UserBaseMapper userBaseMapper;

    @Override
    public UserBase queryUser(Long Uid) {
        UserBase userBase = userBaseMapper.selectByPrimaryKey(Uid);
        return userBase;
    }

    @Override
    public List<List<String>> selectUserAll() {
        List<List<String>> userList = new ArrayList<>();
        List<String> userOne = new ArrayList<>();
        userOne.add("uid");
        userOne.add("用户角色");
        userOne.add("用户名");
        userOne.add("生日");
        userList.add(userOne);
        List<UserBase> userBases = userBaseMapper.selectUserAll();
        for (UserBase user : userBases) {
            List<String> users = new ArrayList<>();
            users.add(user.getUid().toString());
            users.add(user.getUserRole().toString());
            users.add(user.getUserName());
            users.add("2021-01-01");
            userList.add(users);
        }
        return userList;
    }

}
