package com.calculator.sum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SumApplication implements SumService {

	public static void main(String[] args) {
		SpringApplication.run(SumApplication.class, args);
	}

	@Override
	public Integer sum(int a, int b) {
		return a + b;
	}

}
