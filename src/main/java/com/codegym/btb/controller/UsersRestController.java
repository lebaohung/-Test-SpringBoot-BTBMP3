package com.codegym.btb.controller;

import com.codegym.btb.model.Users;
import com.codegym.btb.service.UsersServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UsersRestController {

    @Autowired
    private UsersServiceImp usersServiceImp;

    @GetMapping("/showList")
    public ResponseEntity<List<Users>> showList(){
        List<Users> usersList = usersServiceImp.findAll();
        if (usersList == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(usersList, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Users> showList(@PathVariable Long id){
        Users todo = usersServiceImp.findById(id);
        if (todo == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Void> showList(@PathVariable Long id, @RequestBody Users users){
        users.setIdUsers(id);
        this.usersServiceImp.save(users);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.usersServiceImp.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
