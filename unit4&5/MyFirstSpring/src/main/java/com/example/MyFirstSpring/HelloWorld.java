package com.example.MyFirstSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    public String display(){
        logger.info("Program run");
        logger.warn("Give valid ");
        logger.error("Wromg inputs");
        return "Hello World";
    }
}
