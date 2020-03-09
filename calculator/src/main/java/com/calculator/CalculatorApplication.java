package com.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CalculatorApplication implements CalculatorService {
	@Autowired
	private SumService sumService;

	@Autowired
	private SubtractService subtractService;

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Override
	public Integer sum(int a, int b) {
		return sumService.sum(a, b);
	}

	@Override
	public Integer subtract(int a, int b) {
		return subtractService.subtract(a, b);
	}

	@Override
	public Integer divison(int a, int b) {
		return a/b;
	}

	@Override
	public Integer multiply(int a, int b) {
		return a*b;
	}
}
