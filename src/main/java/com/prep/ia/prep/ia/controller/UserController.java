package com.prep.ia.prep.ia.controller;

import com.prep.ia.prep.ia.model.User;
import com.prep.ia.prep.ia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private  UserService service;
    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user){
       User savedUser =  service.saveUser(user);
        return ResponseEntity.ok().body(savedUser);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAll(){
        List<User> users =  service.getAll();
        return  ResponseEntity.ok().body(users);
    }
@GetMapping("/getById/{userId}")
    public  ResponseEntity<Optional<User>> geUsertById(@PathVariable Long userId) throws Exception {
        Optional<User> user = service.getUserById(userId);
        return ResponseEntity.ok().body(user);
    }
}
