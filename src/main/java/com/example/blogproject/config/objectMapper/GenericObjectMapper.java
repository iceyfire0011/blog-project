package com.example.blogproject.config.objectMapper;

import org.json.simple.JSONObject;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class GenericObjectMapper implements IGenericMapper{

    @Override
    public Object getConvertedResult(JSONObject sourceObject, Object destinationObject) throws NoSuchFieldException, IllegalAccessException{
        Field sourceFields[] = sourceObject.getClass().getDeclaredFields();
        Map<Object, Object> sourceMap = new HashMap<>();
        for (Field field : sourceFields) {
            Field sourceField = sourceObject.getClass().getDeclaredField(field.getName());
            sourceField.setAccessible(true);
            sourceMap.put(field.getName(),  sourceField.get(sourceObject));
        }
        GenericMapper.MapToObject(sourceMap, destinationObject);
        return destinationObject;
    }
}
