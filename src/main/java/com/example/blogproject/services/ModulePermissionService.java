package com.example.blogproject.services;

import com.example.blogproject.config.reaction.ResponseMessage;
import com.example.blogproject.model.ModulePermission;
import com.example.blogproject.repository.IModulePermissionRepo;
import com.example.blogproject.repository.IValidateEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModulePermissionService implements IValidateEntity<ModulePermission>{

    IModulePermissionRepo iModulePermissionRepo;

    public ModulePermissionService(IModulePermissionRepo iModulePermissionRepo){
        this.iModulePermissionRepo = iModulePermissionRepo;
    }

    public List<ModulePermission> list() {
        return iModulePermissionRepo.findAll();
    }

    @Override
    public ResponseMessage validate(ModulePermission entity){
        return null;
    }
}
