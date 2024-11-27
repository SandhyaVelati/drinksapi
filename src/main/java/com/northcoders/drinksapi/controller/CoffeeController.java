package com.northcoders.drinksapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoffeeController {
    @GetMapping("/coffeelover")
    public ResponseEntity<?> getCoffeeLover(){
        return ResponseEntity.ok().body("I like coffee!");
    }
}
