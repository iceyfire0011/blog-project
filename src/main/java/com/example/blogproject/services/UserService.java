package com.example.blogproject.services;

import com.example.blogproject.config.reaction.ResponseMessage;
import com.example.blogproject.model.User;
import com.example.blogproject.repository.IUserRepo;
import com.example.blogproject.repository.IValidateEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IValidateEntity<User>{

    IUserRepo iUserRepo;

    UserService(IUserRepo iUserRepo){
        this.iUserRepo=iUserRepo;
    }

    public List<User> list() {
        return iUserRepo.findAll();
    }

    @Override
    public ResponseMessage validate(User entity){
        return null;
    }
}
