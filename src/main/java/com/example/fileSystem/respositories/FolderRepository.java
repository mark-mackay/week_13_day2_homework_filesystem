package com.example.fileSystem.respositories;


import com.example.fileSystem.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FolderRepository extends JpaRepository<Folder, Long>{
}
