package com.example.blogproject.config.initializer;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.file.Files;

public abstract class  CommonInitializer{


    public String readJsonAsString(Resource resource) throws IOException{
        return new String(Files.readAllBytes(resource.getFile().toPath()));
    }

    public abstract void insertToDb(Object object);
}
