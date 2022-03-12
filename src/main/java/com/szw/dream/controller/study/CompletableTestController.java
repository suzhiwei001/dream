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

    @RequestMapping("test01")
    public String test01(){
        String str = "<body style=\"background-color:yellow;\">\n" +
                "<h2 style=\"background-color:red;\">这是一个标题</h2>\n" +
                "<p style=\"background-color:green;\">这是一个段落。</p>\n" +
                "</body>";
        return str;
    }
}
