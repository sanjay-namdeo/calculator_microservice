package com.calculator;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("calcular.sum.service")
public interface SumService {
    @RequestMapping(method = RequestMethod.GET, value = "sum")
    public Integer sum(@RequestParam("a") int a, @RequestParam("b") int b);
}