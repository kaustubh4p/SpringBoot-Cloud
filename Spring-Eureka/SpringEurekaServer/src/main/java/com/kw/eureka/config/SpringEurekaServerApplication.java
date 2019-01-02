package com.kw.eureka.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author KaustubhWaghmare
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServerApplication.class, args);
	}

}

