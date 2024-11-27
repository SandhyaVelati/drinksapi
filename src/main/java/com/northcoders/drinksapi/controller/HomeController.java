package com.northcoders.drinksapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("api/v1")
public class HomeController {
    @GetMapping("/")
    public ResponseEntity<?> home(){
        return ResponseEntity.ok().body("Welcome to the Drinks API!");
    }
}

