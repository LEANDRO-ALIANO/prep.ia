package com.prep.ia.prep.ia.service;

import com.prep.ia.prep.ia.model.User;
import com.prep.ia.prep.ia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService{

        @Autowired
        UserRepository repository;


           public User saveUser(User user){
               return repository.save(user);
           }
           public List<User> getAll(){
               return repository.findAll();
           }
           public Optional<User> getUserById(Long id) throws Exception {
               Optional<User> user = repository.findById(id);
               return user;

           }
    }


