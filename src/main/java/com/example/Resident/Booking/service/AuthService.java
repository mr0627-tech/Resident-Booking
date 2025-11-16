package com.example.Resident.Booking.service;

import com.example.Resident.Booking.dto.SignupRequest;
import com.example.Resident.Booking.dto.SignupResponse;

public interface AuthService {
    SignupResponse signup(SignupRequest request);
}