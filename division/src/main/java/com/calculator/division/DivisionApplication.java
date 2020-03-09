package com.calculator.division;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DivisionApplication implements DivisonService {

	public static void main(String[] args) {
		SpringApplication.run(DivisionApplication.class, args);
	}

	@Override
	public Integer divison(int a, int b) {
		if(b==0) return 0;
		return a/b;
	}

}
