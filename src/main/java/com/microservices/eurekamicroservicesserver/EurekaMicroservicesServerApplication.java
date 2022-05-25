package com.microservices.eurekamicroservicesserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMicroservicesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMicroservicesServerApplication.class, args);
	}

}
