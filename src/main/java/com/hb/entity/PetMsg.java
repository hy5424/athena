
package com.hb.entity;

import com.hb.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ********************************************************
 *
 * @author 用lcy改进版的代码自动生成器
 * @ClassName: PetMsg
 * @Description: 宠物信息表
 * @date 2018-09-12 上午 11:49:44
 * ******************************************************
 */
@Entity
@Table(name = "pet_msg")
public class PetMsg extends BaseEntity {

    private Long scienceId;        //宠物信息
    private String petNickname;        //宠物昵称
    private String petColour;        //宠物颜色
    private String petCharacter;        //宠物性格
    private String petTrait;        //宠物特点
    private String petFrom;        //宠物归属方
    private Long petFromId;        //归属方编号
    private String status;        //状态


    @Column(name = "SCIENCE_ID")
    public Long getScienceId() {
        return this.scienceId;
    }

    public void setScienceId(Long scienceId) {
        this.scienceId = scienceId;
    }

    @Column(name = "PET_NICKNAME", length = 10)
    public String getPetNickname() {
        return this.petNickname;
    }

    public void setPetNickname(String petNickname) {
        this.petNickname = petNickname;
    }

    @Column(name = "PET_COLOUR", length = 10)
    public String getPetColour() {
        return this.petColour;
    }

    public void setPetColour(String petColour) {
        this.petColour = petColour;
    }

    @Column(name = "PET_CHARACTER", length = 10)
    public String getPetCharacter() {
        return this.petCharacter;
    }

    public void setPetCharacter(String petCharacter) {
        this.petCharacter = petCharacter;
    }

    @Column(name = "PET_TRAIT", length = 200)
    public String getPetTrait() {
        return this.petTrait;
    }

    public void setPetTrait(String petTrait) {
        this.petTrait = petTrait;
    }

    @Column(name = "PET_FROM", length = 2)
    public String getPetFrom() {
        return this.petFrom;
    }

    public void setPetFrom(String petFrom) {
        this.petFrom = petFrom;
    }

    @Column(name = "PET_FROM_ID")
    public Long getPetFromId() {
        return this.petFromId;
    }

    public void setPetFromId(Long petFromId) {
        this.petFromId = petFromId;
    }

    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}

