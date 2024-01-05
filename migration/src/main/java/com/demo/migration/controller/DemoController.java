package com.demo.migration.controller;

import com.demo.migration.dto.HelloDto;
import com.demo.migration.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class DemoController {

    private final DemoService service;

    @GetMapping("/info")
    public ResponseEntity<HelloDto> getIngo() {
        return ResponseEntity.ok(service.getInfo());
    }

}
