package com.cicdTest.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    @GetMapping("/hi")
    public String home() {
        System.out.println("ttttest");
        return "index.html";
    }

    @GetMapping("/answer")
    @ResponseBody
    public String please() {
        return "응답해랏";
    }

    @GetMapping("/hi2")
    @ResponseBody
    public String home2() {
        return "index.html";
    }

}
