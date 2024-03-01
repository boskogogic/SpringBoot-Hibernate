package com.example.unibl.etf.SpringBootBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author Bosko Gogic
 * @EnableSwagger2 annotation for adding swagger.
 */
@SpringBootApplication
//@EnableSwagger2
public class SpringBootBackendApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

}
