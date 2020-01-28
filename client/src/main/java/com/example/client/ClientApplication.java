package com.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.client")
@EnableDiscoveryClient
public class ClientApplication {

	public static void main(final String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
