package com.example.blogproject.model;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import java.sql.Date;

@Data
@Entity
public class User extends BaseEntity{
    @UniqueElements
    private String username;
    private String password;
    private String email;
    private Date dateOfBirth;
}
