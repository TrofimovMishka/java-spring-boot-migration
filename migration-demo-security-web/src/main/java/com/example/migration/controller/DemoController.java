package com.example.migration.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/info")
    public ResponseEntity<String> getInfo() {
        return new ResponseEntity<>("Hello demo", HttpStatus.OK);
    }
}
