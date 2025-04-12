package org.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class supplyController {
    @GetMapping("/supply")
    public ResponseEntity<String> getSupply(){
        // This is a simple endpoint that returns a message
        return ResponseEntity.of(Optional.of("supplyController is working!"));

    }
}
