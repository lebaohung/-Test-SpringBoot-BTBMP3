package com.codegym.btb.service;

import com.codegym.btb.model.Users;
import com.codegym.btb.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImp implements IUserService {
    @Autowired
    UsersRepository usersRepository;

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Users findById(Long id) {
        Optional<Users> optionalUsers = usersRepository.findById(id);
        return optionalUsers.get();
    }

    @Override
    public void delete(Users todo) {
        usersRepository.delete(todo);
    }

    @Override
    public void save(Users users) {
        usersRepository.save(users);
    }

    @Override
    public void deleteById(Long id) {
        usersRepository.deleteById(id);
    }
}
