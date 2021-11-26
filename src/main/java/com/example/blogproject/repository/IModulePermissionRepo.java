package com.example.blogproject.repository;

import com.example.blogproject.model.ModulePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IModulePermissionRepo extends JpaRepository<ModulePermission,String>{
}
