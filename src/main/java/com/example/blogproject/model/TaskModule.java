package com.example.blogproject.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class TaskModule extends BaseEntity{
    private String moduleName;// name to display on user end
    private String url;
    private String taskRef;//controller
    private String parentTaskModule;// applicable for sub-module only

    // ========== Self join start==========
//    @ManyToOne(cascade={CascadeType.ALL})
//    @JoinColumn(name="parentTaskModule_id")
//    private TaskModule parentTaskModule;
//    @OneToMany(mappedBy="parentTaskModule")
//    private Set<TaskModule> subTaskModule = new HashSet<TaskModule>();// applicable for sub-module only
    // ========== Self join end==========
}
