package com.csb.appadvc2122.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("About")

public class AboutUsController {

    @GetMapping
    private String home(Model model) {
        return "About/AboutUs";
    }

}


