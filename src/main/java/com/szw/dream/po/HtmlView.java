package com.szw.dream.po;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import lombok.Data;

/**
 * html_view
 * @author 
 */
@Data
public class HtmlView implements Serializable {
    private Long id;

    /**
     * HTML页面code
     */
    private Integer htmlCode;

    /**
     * HTML页面
     */
    private Map<String,Object> htmlView;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}