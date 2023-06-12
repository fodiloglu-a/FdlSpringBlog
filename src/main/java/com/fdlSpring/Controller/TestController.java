package com.fdlSpring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController  {
    private static final String RESOURCE="index";

        @GetMapping("/")
    public String index() {
        return RESOURCE;
    }
    @GetMapping("/v1")
    public String test() {
        return "test";
    }
}

