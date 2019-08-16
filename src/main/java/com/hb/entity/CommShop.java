
package com.hb.entity;

import com.hb.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ********************************************************
 *
 * @author 用lcy改进版的代码自动生成器
 * @ClassName: CommShop
 * @Description: 店铺表
 * @date 2018-09-12 上午 11:49:02
 * ******************************************************
 */
@Entity
@Table(name = "comm_shop")
public class CommShop extends BaseEntity {


    private Long shopId;        //用户编号
    private String shopName;        //用户名称
    private Long loginName;        //手机号
    private String password;        //密码
    private String status;        //状态


    @Column(name = "SHOP_ID")
    public Long getShopId() {
        return this.shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    @Column(name = "SHOP_NAME", length = 10)
    public String getShopName() {
        return this.shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
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

