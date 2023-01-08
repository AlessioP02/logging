package com.example.logging.controllers;

import com.example.logging.services.ServiceB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB {

    Logger logger = LoggerFactory.getLogger(ControllerB.class);
    @Autowired
    ServiceB serviceB;

    @GetMapping("/")
    public String getWelcome() {
        logger.info("Welcome");
        return "Welcome";
    }

    @GetMapping("/exp")
    public String getService() {
        logger.debug("service");
        return serviceB.getExponentPower(serviceB.getN1(), serviceB.getN2());
    }

    @GetMapping("/get-errors")
    public void getError(){
        Error error = new Error("Error 404");
        logger.error("this is the ERROR Logger",error);
    }
}
