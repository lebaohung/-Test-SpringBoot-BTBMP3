package com.codegym.btb.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "user")
@Data
public class Users {

    @Id
    @Column(name = "id")
    private Long idUsers;

    @NotEmpty
    private String username;
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
    @NotEmpty
    private String confirmpassword;
    @NotEmpty
    @Column(name = "name")
    private String fullname;
    @NotEmpty
    @Column(name = "sdt")
    private String phonenumber;
    @NotEmpty
    private String avatar;

    @ManyToOne(targetEntity = Role.class)
    @JoinColumn (name = "Role_id")
//    @Column(name = "Role_id")
    private Role role;

    public Users() {
    }

    public Users(Long idUsers, @NotEmpty String username, @NotEmpty String email, @NotEmpty String password, @NotEmpty String confirmpassword, @NotEmpty String fullname, @NotEmpty String phonenumber, @NotEmpty String avatar, Role role) {
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

    public Users(@NotEmpty String username, @NotEmpty String email, @NotEmpty String password, @NotEmpty String confirmpassword, @NotEmpty String fullname, @NotEmpty String phonenumber, @NotEmpty String avatar) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmpassword = confirmpassword;
        this.fullname = fullname;
        this.phonenumber = phonenumber;
        this.avatar = avatar;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(Long idUsers) {
        this.idUsers = idUsers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phoneNumber) {
        this.phonenumber = phoneNumber;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
