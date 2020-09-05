package com.szw.dream.controller.study;

import com.szw.dream.config.study.sync.CompletableTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompletableTestController {

    @RequestMapping("completableTest")
    public void completableTest(){
        CompletableTest completableTest = new CompletableTest();
        completableTest.testOne();
    }
}
