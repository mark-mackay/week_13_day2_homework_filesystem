package com.example.fileSystem.components;

import com.example.fileSystem.models.File;
import com.example.fileSystem.models.Folder;
import com.example.fileSystem.models.User;
import com.example.fileSystem.respositories.FileRepository;
import com.example.fileSystem.respositories.FolderRepository;
import com.example.fileSystem.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component

public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user1 =  new User("Mark");
        userRepository.save(user1);

        Folder folder1 = new Folder("/", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("/DOS", user1);
        folderRepository.save(folder2);

        File file1 = new File("command", "com", 65535, folder1);
        fileRepository.save(file1);
        File file2 = new File("msdos", "sys", 32454, folder1);
        fileRepository.save(file2);
        File file3 = new File("autoexec", "bat", 18989, folder1);
        fileRepository.save(file3);
        File file4 = new File("fdisk", "exe", 45363, folder2);
        fileRepository.save(file4);
        File file5 = new File("chkdsk", "exe", 78665, folder2);
        fileRepository.save(file5);
    }

}




