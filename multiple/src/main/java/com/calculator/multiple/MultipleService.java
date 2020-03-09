package com.calculator.multiple;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface MultipleService {

    @RequestMapping(value = "multiply", method = RequestMethod.GET)
    public Integer multiply(@RequestParam("a") int a, @RequestParam("b") int b);
}