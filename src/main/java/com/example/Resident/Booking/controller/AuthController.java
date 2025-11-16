package com.example.Resident.Booking.controller;


import com.example.Resident.Booking.dto.SignupRequest;
import com.example.Resident.Booking.dto.SignupResponse;
import com.example.Resident.Booking.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public SignupResponse signup(@Validated @RequestBody SignupRequest request) {
        return authService.signup(request);
    }
}

