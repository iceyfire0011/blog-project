package com.example.blogproject.config.reaction;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.text.MessageFormat;

@Data
public abstract class ResponseMessage{

    private String message;
    public abstract ResponseMessage message( String message);

}
