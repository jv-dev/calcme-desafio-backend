package com.desafio.calcme.desafiobackend.repository;

import com.desafio.calcme.desafiobackend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
