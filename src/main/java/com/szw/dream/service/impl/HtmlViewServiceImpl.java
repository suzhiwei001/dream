package com.szw.dream.service.impl;

import com.szw.dream.mapper.HtmlViewDao;
import com.szw.dream.mapper.UserBaseMapper;
import com.szw.dream.po.HtmlView;
import com.szw.dream.service.HtmlViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HtmlViewServiceImpl implements HtmlViewService {
    @Resource
    private HtmlViewDao htmlViewDao;
    @Override
    public void insertHtmlView(HtmlView record) {

        htmlViewDao.insertSelective(record);
    }

    @Override
    public HtmlView selectByPrimaryKey(Long id) {
        return htmlViewDao.selectByPrimaryKey(id);
    }
}
