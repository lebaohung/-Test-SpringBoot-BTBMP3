package com.codegym.btb.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    Long idUsers;

    private String username;
    private String email;
    private String password;
    private String fullname;
    private String phonenumber;
    private String avatar;

    @ManyToOne(targetEntity = Role.class)
    @JoinColumn (name = "idRoles")
    private Role role;

    public Users() {
    }

    public Users(Long idUsers, String username, String email, String password, String fullname, String phonenumber, String avatar, Role role) {
        this.idUsers = idUsers;
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.phonenumber = phonenumber;
        this.avatar = avatar;
        this.role = role;
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
