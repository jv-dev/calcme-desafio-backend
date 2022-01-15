package com.desafio.calcme.desafiobackend.dataTransferObject.request;

import lombok.Data;

@Data
public class RequestUserDTO {
    private String name;
    private String email;
    private String phone;
}
