package com.calculator.subtract;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface SubtractService {

    @RequestMapping(value = "subtract", method = RequestMethod.GET)
    public Integer subtract(@RequestParam("a") int a, @RequestParam("b") int b);
}