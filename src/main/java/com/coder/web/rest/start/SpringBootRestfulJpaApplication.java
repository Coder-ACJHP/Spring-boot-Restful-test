package com.coder.web.rest.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.coder.web.rest.entity")
@ComponentScan(basePackages = "com.coder.web.rest")
@EnableJpaRepositories(basePackages = "com.coder.web.rest.service")
public class SpringBootRestfulJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulJpaApplication.class, args);
	}
}
