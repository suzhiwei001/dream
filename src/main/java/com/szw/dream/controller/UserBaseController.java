package com.szw.dream.controller;

import com.szw.dream.po.UserBase;
import com.szw.dream.service.UserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserBaseController {
    @Autowired
    private UserBaseService userBaseService;
    @RequestMapping("queryUserBaseUid")
    public UserBase queryUserBaseUid(@RequestBody UserBase userBase){
        System.out.println("--------------------");
        return userBaseService.queryUserBaseByUid(userBase.getUid());
    }
}
