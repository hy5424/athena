package com.hb.athena.service;

import com.alibaba.fastjson.JSON;
import com.hb.athena.repository.PetScienceRepository;
import com.hb.entity.PetScience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PetScienceService {

    @Autowired
    private PetScienceRepository petScienceRepository;

    public String findPetScience() {
        Iterable<PetScience> iterable = petScienceRepository.findAll();
        List<PetScience> petSciences = new ArrayList<>();
        iterable.forEach(single -> {
            petSciences.add(single);
        });

        Map<String, Object> result = new HashMap<>();
        List<Map<String, String>> list1 = new ArrayList<>();
        List<Map<String, String>> list2 = new ArrayList<>();
        List<Map<String, String>> list3 = new ArrayList<>();
        for (PetScience petScience : petSciences) {
            Map<String, String> petScienceMap = new HashMap<>();
            petScienceMap.put("petId", "detail.html?petId=" + String.valueOf(petScience.getId()));
            petScienceMap.put("classifyId", String.valueOf(petScience.getClassifyId()));
            petScienceMap.put("petName", petScience.getPetName());
            petScienceMap.put("imgPath", petScience.getPetImage());

            switch (String.valueOf(petScience.getClassifyId())) {
                case "1":
                    list1.add(petScienceMap);
                    break;
                case "2":
                    list2.add(petScienceMap);
                    break;
                case "3":
                    list3.add(petScienceMap);
                    break;
            }

        }
        result.put("class1", list1);
        result.put("class2", list2);
        result.put("class3", list3);
        return JSON.toJSONString(result);
    }

    public String findPetScienceById(Long petId) {
        Optional<PetScience> optional = petScienceRepository.findById(petId);
        PetScience petScience = optional.get();

        Map<String, String> result = new HashMap<>();

        result.put("petName", petScience.getPetName());
        result.put("petDesc", petScience.getPetDesc());
        result.put("petLifetime", petScience.getPetLifetime());
        result.put("petWoolLength", petScience.getPetWoolLength());
        result.put("petAlias", petScience.getPetAlias());
        result.put("petSource", petScience.getPetSource());
        result.put("petPrice", petScience.getPetPrice());
        result.put("petBodily", petScience.getPetBodily());
        result.put("petForm", petScience.getPetForm());
        result.put("petCharacter", petScience.getPetCharacter());
        result.put("petFeed", petScience.getPetFeed());
        result.put("petEnv", petScience.getPetEnv());
        result.put("imgPath", petScience.getPetImage());

        return JSON.toJSONString(result);
    }
}
