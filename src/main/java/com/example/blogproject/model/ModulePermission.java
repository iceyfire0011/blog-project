package com.example.blogproject.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
public class ModulePermission extends BaseEntity{
    private boolean viewPermission;
    private boolean modifyPermission;
    private boolean deletePermission;
    @ManyToOne
    private TaskModule taskModule;
}
