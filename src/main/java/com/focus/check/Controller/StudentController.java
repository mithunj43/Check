package com.focus.check.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("focus")
    public String getData(){
        return "Focus and Finish";
    }

    @GetMapping("study")
    public String read(){
        return "study";
    }
}
