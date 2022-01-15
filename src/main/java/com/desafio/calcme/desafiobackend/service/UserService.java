package com.desafio.calcme.desafiobackend.service;

import com.desafio.calcme.desafiobackend.dataTransferObject.request.RequestUserDTO;
import com.desafio.calcme.desafiobackend.model.User;
import com.desafio.calcme.desafiobackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public ResponseEntity<?> save(RequestUserDTO user) {

        try {
            User newUser = new User(user);
            newUser.setEmail(user.getEmail().toLowerCase());

            repository.save(newUser);
            return new ResponseEntity<>(newUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
