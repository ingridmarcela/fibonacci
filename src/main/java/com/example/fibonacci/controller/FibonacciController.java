package com.example.fibonacci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.fibonacci.service.FibonacciService;

@RestController
@RequestMapping( "/fibonacci")

public class FibonacciController {
    private final FibonacciService fibonacciService;

    public FibonacciController( @Autowired FibonacciService x )
    {
        this.fibonacciService = x;
    }

    @GetMapping
    public ResponseEntity<FibonacciDTO> serieCalculada(){
        return ResponseEntity.ok(fibonacciService.entregarSerie());
    }

}
