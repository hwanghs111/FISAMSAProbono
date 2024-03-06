package com.probono.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"fisa.edu.controller","com.probono.demo"})
public class ProbonoFrontServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProbonoFrontServerApplication.class, args);
	}

}
