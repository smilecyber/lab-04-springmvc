package com.cydeo.lab04springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LabController {
    @RequestMapping("/lab")
    public String login(Model model){
        model.addAttribute("firstLab", "lab-00-coupling");
        model.addAttribute("secondLab", "lab-01-ioc");
        model.addAttribute("thirdLab", "lab-02-di");
        model.addAttribute("fourthLab", "lab-03-springboot");
        model.addAttribute("fifthLab", "lab-04-springmvc");
        return "lab/lab-list";
    }
}
