package com.szw.dream.service;

import com.szw.dream.po.HtmlView;

public interface HtmlViewService {
    void insertHtmlView(HtmlView record);

    HtmlView selectByPrimaryKey(Long id);

}
