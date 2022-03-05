package com.project.studybuddies.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Component("student")
@Table(name = "students")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="userName", nullable = false, unique = true, length = 45)
    private String userName;

    @Column(name="studentName", nullable = false)
    private String studentName;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="city", nullable = false)
    private String city;

    @Column(name="location")
    private String location;

    @Column(name="phoneNum")
    private String phoneNum;

    @Column(name="gender", nullable = false)
    private String gender;

    private ArrayList<Integer> courses;

    public StudentModel(){ }

    public StudentModel(String username, String student_name, String password, String city, String location, String phone_num, String gender){
        this.userName = username;
        this.studentName = student_name;
        this.password = password;
        this.city = city;
        this.location = location;
        this.phoneNum = phone_num;
        this.gender = gender;
        this.courses = new ArrayList<Integer>();
    }

    // get functions
    public String getUsername(){
        return this.userName;
    }
    public String getPassword(){
        return this.password;
    }
    public String getStudentName(){
        return this.studentName;
    }
    public String getCity(){
        return this.city;
    }
    public String getLocation(){
        return this.location;
    }
    public String getPhoneNum(){
        return this.phoneNum;
    }
    public String getGender(){
        return this.gender;
    }

    // set functions
    public void setUsername(String username){
        this.userName = username;
    }
    public void setStudentName(String student_name){
        this.studentName = student_name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setPhoneNum(String phone_num){
        this.phoneNum = phone_num;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public void printStudent(){
        System.out.println("username: " + this.userName);
        System.out.println("name: " + this.studentName);
        System.out.println("password: " + this.password);
        System.out.println("city: " + this.city);
        System.out.println("location: " + this.location);
        System.out.println("phone number: " + this.phoneNum);
        System.out.println("gender: " + this.gender);
    }
}
