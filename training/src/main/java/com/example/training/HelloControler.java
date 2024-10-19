package com.example.training;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloControler {


    @RequestMapping("main/hello")
    public String Hello() {
        return "Hello World";
    }

}
