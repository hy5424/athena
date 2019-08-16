
package com.hb.entity;

import com.hb.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ********************************************************
 *
 * @author 用lcy改进版的代码自动生成器
 * @ClassName: PetVideo
 * @Description: 宠物视频表
 * @date 2018-09-12 上午 11:50:06
 * ******************************************************
 */
@Entity
@Table(name = "pet_video")
public class PetVideo extends BaseEntity {


    private String name;        //视频名称
    private String path;        //视频路径
    private String type;        //视频分类
    private String objectId;        //关联编号
    private String status;        //状态


    @Column(name = "NAME", length = 20)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "PATH", length = 200)
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Column(name = "TYPE", length = 10)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "OBJECT_ID", length = 10)
    public String getObjectId() {
        return this.objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}

