package com.springlearninghub.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringFoxConfig {
/*
  @Bean
  public Docket configApi() {
    return new Docket(DocumentationType.SWAGGER_2)
      .select()
      .apis(RequestHandlerSelectors.basePackage("com.springlearninghub.rest")) // Paquete base de tus controladores
      .paths(PathSelectors.any())
      .build()
      .apiInfo(apiInfo())
      .pathMapping("/")
      .select()
      .paths(regex("/api.*"))
      .build();
  }

  /**
   * Method to set swagger info
   *
   * @return ApiInfoBuilder
   */
 
}
