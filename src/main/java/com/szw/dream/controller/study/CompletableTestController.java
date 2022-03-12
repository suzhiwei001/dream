package com.szw.dream.controller.study;

import com.szw.dream.config.study.sync.CompletableTest;
import com.szw.dream.mapper.UserBaseMapper;
import com.szw.dream.po.UserBase;
import com.szw.dream.service.UserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CompletableTestController {
    @Autowired
    private UserBaseService userBaseService;


    @RequestMapping("completableTest")
    public void completableTest() {
        CompletableTest completableTest = new CompletableTest();
        completableTest.testOne();
    }

    @RequestMapping("test01")
    public String test01() {
        System.out.println(test());
        return test();
    }

    private String test() {
        StringBuffer buffer = new StringBuffer();
        testBak1(buffer, "!DOCTYPE html");
        testBak1(buffer, "html");
        testBak1(buffer, "head");
        testBak1(buffer, "meta charset=\"utf-8\"");
        testBak1(buffer, "title");
        buffer.append("菜鸟教程");
        testBak2(buffer, "title");
        testBak2(buffer, "head");
        testBak1(buffer, "body style=\"background-color:yellow;\"");
        testBak1(buffer, "h2 style=\"background-color:red;\"");
        buffer.append("这是一个标题");
        testBak2(buffer, "h2");
        testBak1(buffer, "p style=\"background-color:green;\"");
        buffer.append("这是一个段落。");
        testBak2(buffer, "p");

        addTable(buffer);

        testBak2(buffer, "body");
        testBak2(buffer, "html");
        return buffer.toString();
    }

    private void addTable(StringBuffer buffer) {
        List<List<String>> lists = userBaseService.selectUserAll();

        testBak1(buffer, "table border=\"1\"");
        testBak1(buffer, "caption");
        buffer.append("表格");
        testBak2(buffer, "caption");
        tableRowHead(buffer, lists.get(0));
        tableRowValue(buffer, lists);
    }

    private void testBak1(StringBuffer buffer, String htmlText) {
        buffer.append("<");
        buffer.append(htmlText);
        buffer.append(">");
    }

    private void testBak2(StringBuffer buffer, String htmlText) {
        buffer.append("</");
        buffer.append(htmlText);
        buffer.append(">");
    }

    private void tableRowHead(StringBuffer buffer, List<String> headNames) {
        testBak1(buffer, "tr");
        addRowHead(buffer, headNames);
        testBak2(buffer, "tr");
    }

    private void addRowHead(StringBuffer buffer, List<String> headNames) {
        for (String headName : headNames) {
            testBak1(buffer, "th");
            buffer.append(headName);
            testBak2(buffer, "th");
        }
    }

    private void tableRowValue(StringBuffer buffer, List<List<String>> values) {
        for (int i = 0; i < values.size(); i++) {
            if (i == 0) {
                continue;
            }
            testBak1(buffer, "tr");
            addRowValue(buffer, values.get(i));
            testBak2(buffer, "tr");
        }
    }

    private void addRowValue(StringBuffer buffer, List<String> values) {
            for (String value : values) {
                testBak1(buffer, "td");
                buffer.append(value);
                testBak2(buffer, "td");
            }

    }

}
