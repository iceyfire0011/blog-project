package com.example.blogproject.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable{ // Generate default table properties for entities
    @Id
    private final UUID id = UUID.randomUUID();
    private String createdBy;
    private Instant createdDate = Instant.now();
    private String modifiedBy;
    private Instant modifiedDate;
}
