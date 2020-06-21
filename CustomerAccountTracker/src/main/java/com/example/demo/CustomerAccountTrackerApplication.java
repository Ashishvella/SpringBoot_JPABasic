package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.*")
@SpringBootApplication
public class CustomerAccountTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerAccountTrackerApplication.class, args);
	}

}
