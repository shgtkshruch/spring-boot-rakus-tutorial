package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class testController {
  @RequestMapping("/index")
  public String index(Model model) {
    model.addAttribute("tag","Spring Boot + Thymeleaf入門");
    return "/index";
  }

  @RequestMapping("/input")
  public String input(String input, Model model) {
    model.addAttribute("tag", "Spring Boot + Thymeleaf入門");
    model.addAttribute("input", input);
    return "/index";
  }
}
