package com.student.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebControllerTest {

    @GetMapping("/front")
    //@ResponseBody
    public String test()
    {
        return "index";
    }
}
