package org.hello.chickenchickenlove.fakeDataGenerator.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ValueController {

    @Value("${ash.hello.test}")
    private String test;

    @RequestMapping("/")
    public String hello() {
        System.out.println("test = " + test);
        return "ok";
    }



}
