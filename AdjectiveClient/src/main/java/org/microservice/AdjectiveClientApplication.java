package org.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdjectiveClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdjectiveClientApplication.class, args);
	}

}
