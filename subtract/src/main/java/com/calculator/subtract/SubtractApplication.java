package com.calculator.subtract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SubtractApplication implements SubtractService {

	public static void main(String[] args) {
		SpringApplication.run(SubtractApplication.class, args);
	}

	@Override
	public Integer subtract(int a, int b) {
		return a - b;
	}

}
