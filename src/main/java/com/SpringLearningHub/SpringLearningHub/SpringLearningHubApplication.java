package com.SpringLearningHub.SpringLearningHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.SpringLearningHub.rest.Controller;

@SpringBootApplication
@ComponentScan(basePackageClasses = Controller.class)
public class SpringLearningHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearningHubApplication.class, args);
	}

}
