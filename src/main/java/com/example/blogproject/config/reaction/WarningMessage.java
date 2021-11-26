package com.example.blogproject.config.reaction;

import org.springframework.beans.factory.annotation.Value;

public class WarningMessage extends ResponseMessage{

    @Value("message.type.warning")
    private String messageType;

    @Override
    public ResponseMessage message(String message){
        return new WarningMessage(){{
            setMessage(message);
        }};
    }
}
