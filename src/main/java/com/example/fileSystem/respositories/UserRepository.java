package com.example.fileSystem.respositories;


import com.example.fileSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{
}
