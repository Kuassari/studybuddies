package com.project.studybuddies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.faces.webapp.FacesServlet;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class StudybuddiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudybuddiesApplication.class, args);
	}


	@Bean
	public FacesServlet facesServlet() {
		return new FacesServlet();
	}


}
