package com.example.fibonacci.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.fibonacci.controller.FibonacciDTO;
import com.example.fibonacci.service.FibonacciService;

@Service
public class FibonacciServiceImpl implements FibonacciService {
    @Override
    public FibonacciDTO entregarSerie() {
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond(); //15

        int semilla1 = seconds % 10; //15 % 10 = 5
        int semilla2 = (seconds - semilla1)/10; //15-5/10 =1
        // en java la división es entera. La que no es división entera en java es // y retornaría un flotante
        //int semilla2 = seconds / 10 --> 1

        String hora = hours  + ":"+ minutes +":"+seconds;
        
        List<Integer> serie = new ArrayList<>();
        
        //String hora,List<Integer> serieFibonacci
        serie = devolverSerie(semilla1, semilla2, seconds);
        FibonacciDTO respuestaSerie = new FibonacciDTO(hora, serie);
        return respuestaSerie;
    }

    public List<Integer> devolverSerie(int semilla1, int semilla2, int iteraciones){
        
        List<Integer> serieFibonacci = new ArrayList<>();
        if(iteraciones <0){
            throw new IllegalArgumentException();
        }
        
        serieFibonacci.add(semilla1);
        serieFibonacci.add(semilla2);
        
        int temporal = 0;
        int suma = 0;
        //while (temporal < seconds && serieFibonacci.size() <= seconds ) { //para que imprima sólo la longitud del fibonacci
        while (temporal < iteraciones) { // && serieFibonacci.size() <= seconds
            //serieFibonacci.add
            suma = serieFibonacci.get(serieFibonacci.size()-1) + serieFibonacci.get(serieFibonacci.size()-2);
            // La primera vez suma = 1+5
            serieFibonacci.add(suma);
            temporal++;
        }
        return serieFibonacci;
        
    }
       
}
