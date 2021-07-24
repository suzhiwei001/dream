package com.szw.dream.po;

import lombok.Data;

import java.io.Serializable;

/**
 * user_base
 * @author 
 */
@Data
public class UserBase implements Serializable {
    /**
     * 主键
     */
    private Integer uid;

    /**
     * 用户角色
     */
    private Integer userRole;

    /**
     * 用戶注冊來源
     */
    private Integer registerSource;

    /**
     * 用戶名
     */
    private String userName;

    /**
     * 用戶昵稱
     */
    private String nickName;

    /**
     * 用戶昵稱
     */
    private Integer gender;

    private static final long serialVersionUID = 1L;
}