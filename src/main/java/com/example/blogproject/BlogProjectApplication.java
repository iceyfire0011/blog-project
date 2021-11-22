package com.example.blogproject;

import com.example.blogproject.config.initializer.SeedDataInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogProjectApplication{

    public static void main(String[] args){
        SpringApplication.run(BlogProjectApplication.class, args);
        try{

            SeedDataInitializer.init();
        }catch(Exception e){

        }
    }

}
