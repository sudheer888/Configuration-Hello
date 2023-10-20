package com.example.beandemo.api;

import com.example.beandemo.services.HelloService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class HelloWorld
{
    private final HelloService service;
    public HelloWorld(HelloService service)
    {
        this.service=service;
    }
    @GetMapping("hello")
    public ResponseEntity<?>get()
    {
        return ResponseEntity.ok(service.display());
    }


}
