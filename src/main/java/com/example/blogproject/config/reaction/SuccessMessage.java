package com.example.blogproject.config.reaction;

import org.springframework.beans.factory.annotation.Value;

import java.text.MessageFormat;

public class SuccessMessage extends ResponseMessage{

    @Value("message.type.success")
    private int messageType;

    @Override
    public ResponseMessage message(String message){
        return new SuccessMessage(){{
            setMessage(message);
        }};
    }
}
