package com.example.blogproject.config.objectMapper;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class GenericMapper{

    public static Object MapToObject(Map<Object, Object> sourceMap, Object destinationObject) throws NoSuchFieldException, IllegalAccessException {
        Field destinationFields[] = destinationObject.getClass().getDeclaredFields();
        for (Field field : destinationFields) {
            Field destinationField = destinationObject.getClass().getDeclaredField(field.getName());
            destinationField.setAccessible(true);
            if (sourceMap.containsKey(field.getName())){
                destinationField.set( destinationObject, sourceMap.get(field.getName()));
            }
        }
        return destinationObject;
    }
}
