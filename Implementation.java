package com.example.beandemo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Implementation implements HelloService {
    private final String message;

    public Implementation(@Value("${app.message}") String message) {
        this.message = message;
    }

    @Override
    public String display()
    {
        return message;
    }
}
