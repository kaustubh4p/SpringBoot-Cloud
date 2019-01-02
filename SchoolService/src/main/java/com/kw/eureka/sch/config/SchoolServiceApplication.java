package com.kw.eureka.sch.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author KaustubhWaghmare
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="com.kw.eureka.sch")
@EnableEurekaClient
public class SchoolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolServiceApplication.class, args);
	}

}

