package com.hb.common.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class BaseIdEntity implements Serializable {
    private static final long serialVersionUID = -3080385890971357332L;
    private Long id;

    @Id
    @GeneratedValue(generator = "IdWorker")
    @GenericGenerator(name = "IdWorker", strategy = "com.hb.common.entity.IdWorker")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
