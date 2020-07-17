package com.codegym.btb.service;

import com.codegym.btb.model.Users;

import java.util.List;

public interface IUserService {
    List<Users> findAll();
    Users findById(Long id);
    void delete(Users todo);
    void deleteById(Long id);
    void save(Users todo);
}
