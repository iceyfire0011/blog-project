package com.example.blogproject.config.objectMapper;

import org.json.simple.JSONObject;

public interface IGenericMapper{
     Object getConvertedResult(JSONObject sourceObject, Object destinationObject) throws NoSuchFieldException, IllegalAccessException;
}
