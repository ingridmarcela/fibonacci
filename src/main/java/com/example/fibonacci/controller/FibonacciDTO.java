package com.example.fibonacci.controller;

import java.util.List;

public class FibonacciDTO {
    private String hora;
    private List<Integer> serieFibonacci;
    
    public FibonacciDTO(String hora, List<Integer> serieFibonacci) {
        this.hora = hora;
        this.serieFibonacci = serieFibonacci;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public List<Integer> getSerieFibonacci() {
        return serieFibonacci;
    }
    public void setSerieFibonacci(List<Integer> serieFibonacci) {
        this.serieFibonacci = serieFibonacci;
    }  
    

    
    
}
