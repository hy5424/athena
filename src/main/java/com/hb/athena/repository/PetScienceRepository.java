package com.hb.athena.repository;

import com.hb.entity.PetScience;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier
public interface PetScienceRepository extends CrudRepository<PetScience, Long> {

    List<PetScience> findByClassifyId(Long classifyId);
}
