package com.back2261.authservice.interfaces.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsernameRequest {
    @NotBlank
    private String username;

    @Email
    @NotBlank
    private String email;
}
