package com.project.studybuddies.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Scope(value = "session")
@Component(value = "StudentModel")

@RestController
public class StudentController {

/*
    @Autowired
    private StudentService studentService;

    @GetMapping("/students/{studentId}/courses")
    public List<CourseModel> retrieveCoursesForStudent(@PathVariable String studentId) {
        return studentService.retrieveCourses(studentId);
    }
*/

}
