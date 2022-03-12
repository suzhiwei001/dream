package com.szw.dream.controller;

import com.szw.dream.po.HtmlView;
import com.szw.dream.service.HtmlViewService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HtmlViewController {
    @Resource
    private HtmlViewService htmlViewService;
    @RequestMapping("/insertHtmlView")
    public String insertHtmlView(@RequestBody HtmlView record){
        htmlViewService.insertHtmlView(record);
        return "success";
    }

    @RequestMapping("/queryHtmlView")
    public String queryHtmlView(@RequestBody HtmlView record){
        HtmlView htmlView = htmlViewService.selectByPrimaryKey(record.getId());
        Object htmlView1 = htmlView.getHtmlView();
        return "success";
    }
}
