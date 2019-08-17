package com.dovelol.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerNode1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerNode1Application.class, args);
	}

}
