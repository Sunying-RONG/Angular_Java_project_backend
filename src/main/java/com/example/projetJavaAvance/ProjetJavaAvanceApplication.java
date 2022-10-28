package com.example.projetJavaAvance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

import com.example.projetJavaAvance.service.MonumentRepo;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@EnableJpaRepositories(basePackageClasses
//	    = {
//	        MonumentRepo.class,
//	    })
public class ProjetJavaAvanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetJavaAvanceApplication.class, args);
		

	}

}
