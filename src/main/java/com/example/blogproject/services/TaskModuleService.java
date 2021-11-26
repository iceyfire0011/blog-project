package com.example.blogproject.services;

import com.example.blogproject.config.reaction.ResponseMessage;
import com.example.blogproject.model.Role;
import com.example.blogproject.model.TaskModule;
import com.example.blogproject.repository.ITaskModuleRepo;
import com.example.blogproject.repository.IValidateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskModuleService implements IValidateEntity<TaskModule>{

    ITaskModuleRepo iTaskModuleRepo;

    public TaskModuleService(ITaskModuleRepo iTaskModuleRepo){
        this.iTaskModuleRepo = iTaskModuleRepo;
    }

    public List<TaskModule> list() {
        return iTaskModuleRepo.findAll();
    }


    @Override
    public ResponseMessage validate(TaskModule entity){
        return null;
    }
}
