package com.example.blogproject.config.reaction;

import org.springframework.beans.factory.annotation.Value;

public class ErrorMessage extends ResponseMessage{

    @Value("message.type.error")
    private String messageType;

    @Override
    public ResponseMessage message(String message){
        return new ErrorMessage(){{
            setMessage(message);
        }};
    }
}
