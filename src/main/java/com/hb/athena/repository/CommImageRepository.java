package com.hb.athena.repository;

import com.hb.entity.CommImage;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier
public interface CommImageRepository extends CrudRepository<CommImage, Long> {

    CommImage findByObjectIdAndType(String objectId, String type);
}
