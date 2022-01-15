package com.desafio.calcme.desafiobackend.model;

import com.desafio.calcme.desafiobackend.dataTransferObject.request.RequestUserDTO;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data //Anotação Lombok para a geração automática de @ToString e @Getter / @Setter
@Document(collection = "user")
public class User {

    @Id
    private String id;

    private String name;
    private String email;
    private String phone;

    public User(RequestUserDTO newUser) {
        this.name = newUser.getName();
        this.email = newUser.getEmail();
        this.phone = newUser.getPhone();
    }
}
