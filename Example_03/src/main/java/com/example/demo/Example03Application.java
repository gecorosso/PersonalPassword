package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Example03Application {

	public static void main(String[] args) {
		SpringApplication.run(Example03Application.class, args);
		System.out.println("Modifica_01");
		//===Per configurare
		System.out.println("Modifica_02");
		System.out.println("Modifica_03");
	}

}
