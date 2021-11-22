package com.example.blogproject.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class UserDto extends BaseDto{
    private String username;
    private String password;
    private String email;
    private Date dateOfBirth;
}
