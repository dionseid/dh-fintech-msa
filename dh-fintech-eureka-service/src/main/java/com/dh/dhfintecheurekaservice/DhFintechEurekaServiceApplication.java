package com.dh.dhfintecheurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DhFintechEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DhFintechEurekaServiceApplication.class, args);
	}

}
