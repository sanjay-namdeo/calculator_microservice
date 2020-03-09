package com.calculator.multiple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultipleApplication implements MultipleService {

	public static void main(String[] args) {
		SpringApplication.run(MultipleApplication.class, args);
	}

	@Override
	public Integer multiply(int a, int b) {
		return a*b;
	}

}
