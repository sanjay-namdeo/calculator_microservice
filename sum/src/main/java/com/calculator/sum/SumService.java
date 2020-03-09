package com.calculator.sum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface SumService {
    @RequestMapping(value = "sum",method = RequestMethod.GET)
    public Integer sum(@RequestParam("a") int a, @RequestParam("b") int b);
}