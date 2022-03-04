package com.project.studybuddies.controller;

import java.util.List;

import com.project.studybuddies.service.CourseService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@Component(value = "CourseModel")
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    int count = 0;
    private String jsfTestString = "This string came from server side";

    @GetMapping("/message")
    public String printMessage() {
        return this.jsfTestString;
    }
}
