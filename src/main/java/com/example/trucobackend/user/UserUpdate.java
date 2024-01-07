package com.example.trucobackend.user;

import jakarta.validation.constraints.NotNull;

public record UserUpdate(
        @NotNull
        Long id,

        String name,
        String email) {
}
