package com.crs.hotel.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.crs.*"})
@EnableSwagger2
@EnableJpaRepositories("com.crs.domain.hotel.repository")
@EntityScan("com.crs.domain.hotel.entities")
public class HotelSpringBootApplicationService {
	
	public static void main(String[] args) {
		SpringApplication.run(HotelSpringBootApplicationService.class, args);
	}
	
}
 