
package com.hb.entity;

import com.hb.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ********************************************************
 *
 * @author 用lcy改进版的代码自动生成器
 * @ClassName: CommUser
 * @Description: 用户表
 * @date 2018-09-12 上午 11:49:24
 * ******************************************************
 */
@Entity
@Table(name = "comm_user")
public class CommUser extends BaseEntity {


    private Long userId;        //用户编号
    private String userName;        //用户名称
    private Long loginName;        //手机号
    private String password;        //密码
    private String status;        //状态


    @Column(name = "USER_ID")
    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "USER_NAME", length = 10)
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "LOGIN_NAME")
    public Long getLoginName() {
        return this.loginName;
    }

    public void setLoginName(Long loginName) {
        this.loginName = loginName;
    }

    @Column(name = "PASSWORD", length = 10)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}

