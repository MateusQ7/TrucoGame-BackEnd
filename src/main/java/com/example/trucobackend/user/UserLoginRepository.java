package com.example.trucobackend.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {
    UserDetails findByLogin(String login);
}
