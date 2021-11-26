package com.example.blogproject.services;

import com.example.blogproject.config.reaction.ErrorMessage;
import com.example.blogproject.config.reaction.ResponseMessage;
import com.example.blogproject.config.reaction.SuccessMessage;
import com.example.blogproject.model.Role;
import com.example.blogproject.repository.IRoleRepo;
import com.example.blogproject.repository.IValidateEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleService implements IValidateEntity<Role>{

    IRoleRepo iRoleRepo;

    public RoleService(IRoleRepo iRoleRepo){
        this.iRoleRepo = iRoleRepo;
    }

    public List<Role> list(){
        return iRoleRepo.findAll();
    }

    // MANDATORY: Transaction must be created before.
    @Transactional(propagation = Propagation.MANDATORY)
    public ResponseMessage saveOrEditRole(Role role){
        if(role.getId()  == null)
        {
            role = iRoleRepo.save(role);
            return new SuccessMessage().message("Successfully, Role Created.");
        }
        return new ErrorMessage().message("Failed, Role is not saved.");
    }

    @Override
    public ResponseMessage validate(Role role){

        return new SuccessMessage(){{
            setMessage("Success!");
        }};
    }
}
