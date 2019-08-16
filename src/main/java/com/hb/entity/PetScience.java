
package com.hb.entity;

import com.hb.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ********************************************************
 *
 * @author 用lcy改进版的代码自动生成器
 * @ClassName: PetScience
 * @Description: 宠物科普表
 * @date 2018-09-12 上午 11:49:54
 * ******************************************************
 */
@Entity
@Table(name = "pet_science")
public class PetScience extends BaseEntity {

    private Long classifyId;        //分类ID
    private String petName;        //宠物名称
    private String petDesc;        //宠物描述
    private String petLifetime;        //宠物寿命
    private String petWoolLength;        //宠物毛长
    private String petAlias;        //宠物别名
    private String petSource;        //宠物原产地
    private String petPrice;        //宠物价格
    private String petBodily;        //宠物体型
    private String petForm;        //形态特征
    private String petCharacter;        //性格特点
    private String petFeed;        //喂食要点
    private String petEnv;        //生活环境
    private String status;        //状态
    private String petImage;        //图片


    @Column(name = "CLASSIFY_ID")
    public Long getClassifyId() {
        return this.classifyId;
    }

    public void setClassifyId(Long classifyId) {
        this.classifyId = classifyId;
    }

    @Column(name = "PET_NAME", length = 20)
    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Column(name = "PET_DESC", length = 500)
    public String getPetDesc() {
        return this.petDesc;
    }

    public void setPetDesc(String petDesc) {
        this.petDesc = petDesc;
    }

    @Column(name = "PET_LIFETIME", length = 10)
    public String getPetLifetime() {
        return this.petLifetime;
    }

    public void setPetLifetime(String petLifetime) {
        this.petLifetime = petLifetime;
    }

    @Column(name = "PET_WOOL_LENGTH", length = 10)
    public String getPetWoolLength() {
        return this.petWoolLength;
    }

    public void setPetWoolLength(String petWoolLength) {
        this.petWoolLength = petWoolLength;
    }

    @Column(name = "PET_ALIAS", length = 20)
    public String getPetAlias() {
        return this.petAlias;
    }

    public void setPetAlias(String petAlias) {
        this.petAlias = petAlias;
    }

    @Column(name = "PET_SOURCE", length = 10)
    public String getPetSource() {
        return this.petSource;
    }

    public void setPetSource(String petSource) {
        this.petSource = petSource;
    }

    @Column(name = "PET_PRICE", length = 10)
    public String getPetPrice() {
        return this.petPrice;
    }

    public void setPetPrice(String petPrice) {
        this.petPrice = petPrice;
    }

    @Column(name = "PET_BODILY", length = 10)
    public String getPetBodily() {
        return this.petBodily;
    }

    public void setPetBodily(String petBodily) {
        this.petBodily = petBodily;
    }

    @Column(name = "PET_FORM", length = 500)
    public String getPetForm() {
        return this.petForm;
    }

    public void setPetForm(String petForm) {
        this.petForm = petForm;
    }

    @Column(name = "PET_CHARACTER", length = 500)
    public String getPetCharacter() {
        return this.petCharacter;
    }

    public void setPetCharacter(String petCharacter) {
        this.petCharacter = petCharacter;
    }

    @Column(name = "PET_FEED", length = 500)
    public String getPetFeed() {
        return this.petFeed;
    }

    public void setPetFeed(String petFeed) {
        this.petFeed = petFeed;
    }

    @Column(name = "PET_ENV", length = 500)
    public String getPetEnv() {
        return this.petEnv;
    }

    public void setPetEnv(String petEnv) {
        this.petEnv = petEnv;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "PET_IMAGE", length = 255)
    public String getPetImage() {
        return petImage;
    }

    public void setPetImage(String petImage) {
        this.petImage = petImage;
    }
}

