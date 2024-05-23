package com.example.ex01.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiro")
public class PrimeiroController {

        @GetMapping("/hello")
        public String hello() {
            return "Executando com sucesso!";
        }

        @GetMapping("/hello2")
        public ResponseEntity<String> hello2() {
            return ResponseEntity
                .status(HttpStatus.OK)
                .body("Executando com sucesso!");
        }

    
}

        