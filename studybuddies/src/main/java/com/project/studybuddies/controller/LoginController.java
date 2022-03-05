package com.project.studybuddies.controller;

import com.project.studybuddies.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("loginController")
@Scope("request")
public class LoginController {

   @Autowired
    private StudentModel student;

}
