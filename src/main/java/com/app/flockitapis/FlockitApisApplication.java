package com.app.flockitapis;

import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.app.flockitapis.*")
public class FlockitApisApplication  {

	public static void main(String[] args) {
		SpringApplication.run(FlockitApisApplication.class, args);
	}

	

}
