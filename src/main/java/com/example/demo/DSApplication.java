package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class DSApplication {

	public static void main(String[] args) {
		SpringApplication.run(DSApplication.class, args);
	}

}
