package com.mysite.sbb;

import groovy.lang.GString;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
        public String root(){
        return "redirect:/question/list";
    }
}
