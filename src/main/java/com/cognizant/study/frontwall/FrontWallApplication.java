package com.cognizant.study.frontwall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FrontWallApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontWallApplication.class, args);
	}

}
