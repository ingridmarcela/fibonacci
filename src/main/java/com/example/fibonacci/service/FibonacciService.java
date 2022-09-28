package com.example.fibonacci.service;

import java.util.List;

import com.example.fibonacci.controller.FibonacciDTO;

public interface FibonacciService {
    FibonacciDTO entregarSerie();
    //Se invica nuesva clase para que sea posible controlar/ejecutar los escenarios de prueba:test y no se invoca en el controller
    List<Integer> devolverSerie(int semilla1, int semilla2, int iteraciones);

}

