package com.example.projetJavaAvance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ProjetJavaAvanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetJavaAvanceApplication.class, args);
		
	}

}
