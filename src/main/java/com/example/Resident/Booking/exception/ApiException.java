package com.example.Resident.Booking.exception;

public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }
}