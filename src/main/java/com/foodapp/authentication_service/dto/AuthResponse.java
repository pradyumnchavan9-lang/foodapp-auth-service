package com.foodapp.authentication_service.dto;


import com.foodapp.authentication_service.enums.Role;
import lombok.Data;

@Data
public class AuthResponse {

    private String token;
    private String name;
    private String email;
    private Role role;

}
