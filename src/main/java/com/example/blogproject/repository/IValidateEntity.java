package com.example.blogproject.repository;

import com.example.blogproject.config.reaction.ResponseMessage;

public interface IValidateEntity<T>{
    ResponseMessage validate(T entity);
}
