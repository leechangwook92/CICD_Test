package com.cicdTest.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/hi")
    public String home() {
        return "index.html";
    }

    @GetMapping("/hi2")
    public String home2() {
        return "index.html";
    }



}
