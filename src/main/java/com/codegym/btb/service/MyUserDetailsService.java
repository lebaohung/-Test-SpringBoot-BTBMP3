package com.codegym.btb.service;

import com.codegym.btb.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UsersServiceImp usersServiceImp;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = usersServiceImp.findByUsername(username);
        String users_username = users.getUsername();
        String users_password = users.getPassword();
        return new User(users_username,users_password, new ArrayList<>());
    }
}
