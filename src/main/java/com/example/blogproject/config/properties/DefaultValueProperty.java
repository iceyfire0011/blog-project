package com.example.blogproject.config.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:constant.properties")
public class DefaultValueProperty{
}
