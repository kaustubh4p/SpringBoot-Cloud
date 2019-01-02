package com.kw.eureka.std.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author KaustubhWaghmare
 *
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages="com.kw.eureka.std")
public class StudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

}

