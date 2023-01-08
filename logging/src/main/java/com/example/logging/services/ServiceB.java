package com.example.logging.services;

import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Data
public class ServiceB {
    private int n1 = 2;
    private int n2 = 8;


    public String getExponentPower(int n1 , int n2 ){
        this.n1 = n1;
        this.n2 = n2;
        int power1 = n1;
        int power2 = n2;
        for(int i = 0; i < n1; i++){
            power1 *= n1;
        }
        for(int i = 0; i < n2; i++){
            power2 *= n1;
        }
        return "First result: " + power1 + ", second result: " + power2;

    }
}