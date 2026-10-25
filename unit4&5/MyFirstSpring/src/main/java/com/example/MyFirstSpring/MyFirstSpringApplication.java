package com.example.MyFirstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringApplication implements commandLineRunner {
@Autowired 
HelloWorld hw;
	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringApplication.class, args);
	}
	@Override 
	public void run (String ... args) throws Exception{
		//TODO Auto generated 
		System.out.println(hw.display());
	}

}
