package com.example.TesteBD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TesteBdApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteBdApplication.class, args);
	}

}
