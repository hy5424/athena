
package com.hb.entity;

import com.hb.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ********************************************************
 *
 * @author 用lcy改进版的代码自动生成器
 * @ClassName: PetClassify
 * @Description: 宠物分类表
 * @date 2018-09-12 上午 11:49:34
 * ******************************************************
 */
@Entity
@Table(name = "pet_classify")
public class PetClassify extends BaseEntity {


    private String classifyName;        //分类名称
    private String status;        //状态


    @Column(name = "CLASSIFY_NAME", length = 10)
    public String getClassifyName() {
        return this.classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}

