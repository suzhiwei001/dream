package com.szw.dream.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserBaseController {
//    @Autowired
//    private UserBaseService userBaseService;

/*    @RequestMapping("queryUserBaseUid")
    public UserBase queryUserBaseUid(@RequestBody UserBase userBase){
        System.out.println("--------------------");
        return userBaseService.queryUserBaseByUid(userBase.getUid());
    }*/

    @RequestMapping("test")
    public String queryUserBaseUid(){
        System.out.println("----------测试----------");
        return "ok";
    }
}
