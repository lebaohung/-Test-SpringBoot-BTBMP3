package com.codegym.btb.controller;

import com.codegym.btb.model.Role;
import com.codegym.btb.model.Users;
import com.codegym.btb.model.UsersForm;
import com.codegym.btb.service.UsersServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("")
public class ResgistrationRestController {

    @Autowired
    UsersServiceImp usersServiceImp;

    @Autowired
    private Environment environment;

    @GetMapping({"/hello"})
    String hello(){
        return  "hello";
    }

    @PostMapping(value = "/registration")
    ResponseEntity<Void> registration(@RequestPart(value = "avatar") MultipartFile avatar, @ModelAttribute UsersForm usersForm){

        String avatarOriginalFilename = avatar.getOriginalFilename();
        String imageUploadAvatarUser = environment.getProperty("image_upload_avatar_user").toString();
        try {
            FileCopyUtils.copy(avatar.getBytes(), new File(imageUploadAvatarUser + avatarOriginalFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Users users = new Users(usersForm.getUsername(), usersForm.getEmail(), usersForm.getPassword(),
                    usersForm.getConfirmpassword(), usersForm.getFullname(), usersForm.getPhonenumber(), avatarOriginalFilename);

        List<Users> usersList = this.usersServiceImp.findAll();
        Long id = (long) (usersList.size() + 1);
        users.setIdUsers(id);
        Role roleUser = new Role();
        roleUser.setIdRoles(2L);
        users.setRole(roleUser);
        users.setStatus(true);

        this.usersServiceImp.save(users);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
