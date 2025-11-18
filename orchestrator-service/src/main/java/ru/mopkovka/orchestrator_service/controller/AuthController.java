package ru.mopkovka.orchestrator_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @PostMapping("/sign-up")
    public String signIn() {
        System.out.println("signUp endpoint called");
        return "Sign-Up endpoint";
    }
}
