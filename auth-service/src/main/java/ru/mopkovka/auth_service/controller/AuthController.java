package ru.mopkovka.auth_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @PostMapping("/sign-in")
    public String signIn() {
        System.out.println("signIn endpoint called");
        return "Sign-In endpoint";
    }

    @PostMapping("/refresh-token")
    public String refreshToken() {
        System.out.println("refreshToken endpoint called");
        return "Refresh-Token endpoint";
    }
}
