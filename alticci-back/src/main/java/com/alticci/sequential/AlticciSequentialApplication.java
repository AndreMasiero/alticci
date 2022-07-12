package com.alticci.sequential;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AlticciSequentialApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlticciSequentialApplication.class, args);
	}

}
