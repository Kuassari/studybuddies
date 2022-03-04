package com.project.studybuddies.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

import com.project.studybuddies.model.CourseModel;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private int counter = 0;
    public String getMessage() {
        return "This is my message " + counter++;
    }
}
