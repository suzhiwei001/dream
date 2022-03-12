package com.szw.dream.mapper;

import com.szw.dream.po.HtmlView;

public interface HtmlViewDao {
    int deleteByPrimaryKey(Long id);

    int insert(HtmlView record);

    int insertSelective(HtmlView record);

    HtmlView selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HtmlView record);

    int updateByPrimaryKey(HtmlView record);
}