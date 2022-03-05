package com.project.studybuddies.controller;

import com.project.studybuddies.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.ManagedBean;

@Scope(value = "session")
@Component(value = "StudentModel")
@ManagedBean
@RestController
public class StudentController {

    @Autowired
    StudentModel student;

    public void setStudent(StudentModel student) {
        this.student = student;
    }

    public void printStudent(StudentModel student) {
        student.printStudent();
    }

}
