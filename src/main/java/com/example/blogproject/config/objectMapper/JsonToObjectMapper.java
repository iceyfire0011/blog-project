package com.example.blogproject.config.objectMapper;

import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonToObjectMapper implements IGenericMapper{
    public  Object getConvertedResult(JSONObject sourceObject, Object destinationObject) throws NoSuchFieldException, IllegalAccessException{
        Map<Object, Object> sourceMap = new HashMap<>();
        for(var key : sourceObject.keySet()){
            sourceMap.put(key.toString(), sourceObject.get(key));
        }
        GenericMapper.MapToObject(sourceMap, destinationObject);
        return destinationObject;
    }
}
