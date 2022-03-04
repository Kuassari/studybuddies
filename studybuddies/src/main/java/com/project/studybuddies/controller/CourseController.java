package com.project.studybuddies.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component(value = "CourseModel")
@RestController
public class CourseController {

    int count = 0;
    private String jsfTestString = "This string came from server side";

    @GetMapping("/message")
    public String printMessage() {
        return this.jsfTestString;
    }
}
