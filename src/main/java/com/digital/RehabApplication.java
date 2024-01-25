package com.digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.digital")
public class RehabApplication {

	public static void main(String[] args) {
		SpringApplication.run(RehabApplication.class, args);
	}

}
