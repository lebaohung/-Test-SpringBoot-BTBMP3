package com.codegym.btb.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class UsersForm {
    private Long idUsers;
    private String username;
    private String email;
    private String password;
    private String confirmpassword;
    private String fullname;
    private String phonenumber;
    private MultipartFile avatar;
    private Role role;

    public UsersForm(Long idUsers, String username, String email, String password, String confirmpassword, String fullname, String phonenumber, MultipartFile avatar, Role role) {
        this.idUsers = idUsers;
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmpassword = confirmpassword;
        this.fullname = fullname;
        this.phonenumber = phonenumber;
        this.avatar = avatar;
        this.role = role;
    }

    public UsersForm() {
    }
}
