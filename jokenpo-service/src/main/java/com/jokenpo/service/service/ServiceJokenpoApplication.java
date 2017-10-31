package com.jokenpo.service.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceJokenpoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceJokenpoApplication.class, args);
	}
}
