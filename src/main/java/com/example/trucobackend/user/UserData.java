package com.example.trucobackend.user;

public record UserData(Long id, String name, String email) {

    public UserData(User user) {
        this(user.getId(),user.getName(), user.getEmail());
    }
}
