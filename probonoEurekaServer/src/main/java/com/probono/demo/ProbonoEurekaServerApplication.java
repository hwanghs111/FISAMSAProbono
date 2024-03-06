package com.probono.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProbonoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProbonoEurekaServerApplication.class, args);
	}

}
