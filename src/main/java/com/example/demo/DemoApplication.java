package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public static void decirApellido() {
		System.out.println("Hernandez");
	}

	public static void decirNombre() {
		System.out.println("Raul");
	}
	
}
