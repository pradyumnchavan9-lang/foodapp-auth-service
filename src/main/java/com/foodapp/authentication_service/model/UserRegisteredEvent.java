package com.foodapp.authentication_service.model;

import com.foodapp.authentication_service.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisteredEvent {

    private String email;
    private Role role;
}
