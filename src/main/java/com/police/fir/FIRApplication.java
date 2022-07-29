package com.police.fir;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.police.fir.Entity.FIRSearchBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

//@SpringBootApplication = @Configuration + @ComponentScan + @EnableAutoConfiguration
//The @SpringBootApplication annotation is a combination of following three Spring annotations and provides the functionality of all three with just one line of code.
//
//@Configuration
//This annotation marks a class as a Configuration class for Java-based configuration. This is particularly important if you favor Java-based configuration over XML configuration.
//
//@ComponentScan
//This annotation enables component-scanning so that the web controller classes and other components you create will be automatically discovered and registered as beans in Spring's Application Context. All the@Controller classes you write are discovered by this annotation.
//
//@EnableAutoConfiguration
//This annotation enables the magical auto-configuration feature of Spring Boot, which can automatically configure a lot of stuff for you.
@SpringBootApplication
public class FIRApplication {

	public static void main(String[] args) {
		SpringApplication.run(FIRApplication.class, args);
		System.out.println("Hello world!");




	}

}
