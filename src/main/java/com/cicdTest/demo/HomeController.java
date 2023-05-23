package com.cicdTest.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    @GetMapping("/hi")
    public String home() {
        return "/resources/templates/index.html";
    }

    @GetMapping("/hi2")
    @ResponseBody
    public String home2() {
        return "index.html";
    }



}
