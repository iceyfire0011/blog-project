package com.example.blogproject.dto;

import lombok.Data;

import java.time.Instant;

@Data
public abstract class BaseDto{
    private String id;
    private String createdBy;
    private Instant createdDate;
    private String modifiedBy;
    private Instant modifiedDate;
}
