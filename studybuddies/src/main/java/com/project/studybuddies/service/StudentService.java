package com.project.studybuddies.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

import com.project.studybuddies.model.CourseModel;
import com.project.studybuddies.model.StudentModel;

public class StudentService {


/*
    private static ArrayList<StudentModel> students = new ArrayList<StudentModel>();

    // take data from student repository, need editing
    static {
        // Initialize Data
        CourseModel course1 = new CourseModel(1, "Calculus");
        CourseModel course2 = new CourseModel(2, "Java");
        ArrayList<CourseModel> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);

        StudentModel ranga = new StudentModel("1", "Kazuar", "Ofir",courses);

        students.add(ranga);
    }

    public StudentModel retrieveStudent(String studentId) {
        for (StudentModel student : students) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public List<CourseModel> retrieveCourses(String studentId) {
        StudentModel student = retrieveStudent(studentId);

        if (student == null) {
            return null;
        }

        return student.getCourses();
    }
*/

}
