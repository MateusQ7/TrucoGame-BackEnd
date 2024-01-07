package com.example.trucobackend.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record UserRegister(
        @NotBlank
        String name,
        @NotBlank
        String password,
        @NotBlank
        @Email
        String email) {
}
