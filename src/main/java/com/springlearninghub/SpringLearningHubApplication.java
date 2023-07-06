package com.springlearninghub;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.springlearninghub.rest.Controller;
import com.springlearninghub.service.ServiceClass;

@SpringBootApplication
//@EnableSwagger2
@ComponentScan(basePackageClasses={Controller.class,ServiceClass.class})

public class SpringLearningHubApplication extends SpringBootServletInitializer{

  public static void main(String[] args) {
    SpringApplication.run(SpringLearningHubApplication.class, args);
  }

 
}
