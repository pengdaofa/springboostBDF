package com.pengdf.project.index.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private static final Logger log = LoggerFactory.getLogger(IndexController.class);

    @GetMapping(value = "/")
    public String index(Model model) {
        String name = "project";
        model.addAttribute("name", name);
        return "index";
    }
}
