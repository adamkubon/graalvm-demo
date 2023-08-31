package com.example.graalvmdemo.controllers;

import com.example.graalvmdemo.config.RecordProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenericController {

    final RecordProperties recordProperties;

    public GenericController(RecordProperties recordProperties) {
        this.recordProperties = recordProperties;
    }

    @RequestMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello Anonymous!" + recordProperties.param1());
    }

}
