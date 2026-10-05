package com.example.expense_journal_api.controller;

import com.example.expense_journal_api.dto.RegisterRequest;
import com.example.expense_journal_api.entity.User;
import com.example.expense_journal_api.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/registerr")
    public ResponseEntity<User> register(@RequestBody @Valid RegisterRequest request) {

        User savedUser = userService.registerUser(request);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
