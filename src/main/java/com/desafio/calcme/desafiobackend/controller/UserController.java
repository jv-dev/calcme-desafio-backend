package com.desafio.calcme.desafiobackend.controller;

import com.desafio.calcme.desafiobackend.dataTransferObject.request.RequestUserDTO;
import com.desafio.calcme.desafiobackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody RequestUserDTO user) {
        return this.service.save(user);
    }
}
