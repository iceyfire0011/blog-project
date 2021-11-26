package com.example.blogproject.repository;

import com.example.blogproject.model.TaskModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskModuleRepo extends JpaRepository<TaskModule, String>{
}
