package com.doctor.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class controller {
    @GetMapping("/doctor/1")

    @ResponseBody
    public String index() {
        return "Greetings from William Hartnell <a href='http://localhost:8080/doctor/1'</a>";
    }

    @GetMapping("/doctor/10")

    @ResponseBody
    public String index2() {
        return "Greetings from David Tennant  <a href='http://localhost:8080/doctor/10'</a>";
    }

    @GetMapping("/doctor/13")

    @ResponseBody
    public String index3() {
        return "Greetings from Jodie Whittaker <a href='http://localhost:8080/doctor/13'</a>";
    }
}
