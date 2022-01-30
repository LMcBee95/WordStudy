package com.wordStudy.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WordController {

    @GetMapping("/")
    public String showSignUpForm() {
        return "home";
    }

}
