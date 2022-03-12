package com.szw.dream.service;

import com.szw.dream.po.UserBase;

import java.util.List;

public interface UserBaseService {

    UserBase queryUser(Long Uid);

    List<List<String>> selectUserAll();
}
