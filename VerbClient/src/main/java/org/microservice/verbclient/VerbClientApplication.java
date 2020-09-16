package org.microservice.verbclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VerbClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerbClientApplication.class, args);
	}

}
