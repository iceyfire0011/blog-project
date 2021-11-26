package com.example.blogproject.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Entity
public class Role extends BaseEntity{

    @NotEmpty
    private String roleName;
    @OneToMany
    private List<ModulePermission> defaultRoleModules;
}
