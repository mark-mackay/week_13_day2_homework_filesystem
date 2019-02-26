package com.example.fileSystem.respositories;


import com.example.fileSystem.models.File;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FileRepository extends JpaRepository<File, Long> {
}
