package com.example.trucobackend.controllers;

import com.example.trucobackend.user.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid UserRegister data){
        repository.save(new User(data));
    }

    @GetMapping
    public List<UserData> showUser(){
        return repository.findAll().stream().map(UserData::new).toList();
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid UserUpdate data){
        var users = repository.getReferenceById(data.id());
        users.updateData(data);
    }
}
