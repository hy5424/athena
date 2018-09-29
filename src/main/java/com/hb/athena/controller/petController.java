package com.hb.athena.controller;

import com.hb.athena.service.PetScienceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pet")
@CrossOrigin
public class petController {

    private static final Logger logger = LoggerFactory.getLogger(petController.class);

    @Autowired
    PetScienceService petScienceService;

    @RequestMapping("/getPetSci")
    public String getPetScience() {
        logger.info("[获取宠物科普信息]开始......");
        String json = petScienceService.findPetScience();
        logger.info("[获取宠物科普信息]返回信息：" + json);
        return json;
    }

    @RequestMapping("/getPetSciById")
    public String findPetScienceById(String petId) {
        logger.info("[获取宠物科普信息]开始......");
        String json = petScienceService.findPetScienceById(Long.valueOf(petId));
        logger.info("[获取宠物科普信息]返回信息：" + json);
        return json;
    }
}
