package com.example.trucobackend.controllers;

import com.example.trucobackend.services.TokenService;
import com.example.trucobackend.user.AuthenticationData;
import com.example.trucobackend.user.UserLogin;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity login(@RequestBody @Valid AuthenticationData data){
        var token = new UsernamePasswordAuthenticationToken(data.login(), data.password());

        System.out.println(data.password());
        System.out.println(data.login());
        System.out.println(token);
        var authentication = manager.authenticate(token);

        System.out.println("OI" + authentication);

        return ResponseEntity.ok(tokenService.generateToken((UserLogin) authentication.getPrincipal()));
    }
}
