package com.project.studybuddies;

import com.sun.faces.config.ConfigureListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
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

	/*
	 * Below sets up the Faces Servlet for Spring Boot
	 */
	@Bean
	public FacesServlet facesServlet() {
		return new FacesServlet();
	}

	@Bean
	public ServletRegistrationBean facesServletRegistration() {
		ServletRegistrationBean registration = new ServletRegistrationBean(
				facesServlet(), "*.xhtml");
		registration.setName("FacesServlet");
		return registration;
	}

	@Bean
	public ServletListenerRegistrationBean<ConfigureListener> jsfConfigureListener() {
		return new ServletListenerRegistrationBean<ConfigureListener>(
				new ConfigureListener());
	}

}
