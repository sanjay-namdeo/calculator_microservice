package com.calculator.division;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface DivisonService {
    @RequestMapping(value = "divison", method = RequestMethod.GET)
    public Integer divison(int a, int b);
}