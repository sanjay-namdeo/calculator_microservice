package com.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CalculatorService {
    @RequestMapping(method = RequestMethod.GET, value = "sum")
    public Integer sum(@RequestParam("a") int a, @RequestParam("b") int b);

    @RequestMapping(method = RequestMethod.GET, value = "subtract")
    public Integer subtract(@RequestParam("a") int a, @RequestParam("b") int b);

    @RequestMapping(method = RequestMethod.GET, value = "divison")
    public Integer divison(@RequestParam("a") int a, @RequestParam("b") int b);

    @RequestMapping(method = RequestMethod.GET, value = "multiply")
    public Integer multiply(@RequestParam("a") int a, @RequestParam("b") int b);
}