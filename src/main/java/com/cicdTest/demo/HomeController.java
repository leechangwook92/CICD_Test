package com.cicdTest.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    @GetMapping("/hi")
    @ResponseBody
    public String home() {
        return "hi";
    }

    @GetMapping("/hi2")
    public String home2() {
        return "index.html";
    }



}
