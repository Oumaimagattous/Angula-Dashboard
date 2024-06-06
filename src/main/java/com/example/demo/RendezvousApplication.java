package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages= {"com.example.demo.service.controller"})
public class RendezvousApplication {

	public static void main(String[] args) {
		SpringApplication.run(RendezvousApplication.class, args);
	}

}
