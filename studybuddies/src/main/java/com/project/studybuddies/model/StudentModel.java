package com.project.studybuddies.model;

import java.util.ArrayList;

public class StudentModel {
    private String id;
    private String user_name; // key
    private String student_name;
    private String password;
    private String city;
    private String location;
    private String phone_num;
    private String gender;
    private int birth_year;
    private ArrayList<CourseModel> courses;

    public StudentModel(String id, String user_name, String student_name,ArrayList<CourseModel> courses){
        super();
        this.id = id;
        this.user_name = user_name;
        this.student_name = student_name;
//        this.password = password;
//        this.city = city;
//        this.location = location;
//        this.phone_num = phone_num;
//        this.gender = gender;
//        this.birth_year = birth_year;
        this.courses = courses;
    }

    // get functions
    public String getId() { return id; }

    public String getUserName(){
        return this.user_name;
    }

    public String getName(){
        return this.student_name;
    }

    public String getCity(){
        return this.city;
    }

    public String getLocation(){
        return this.location;
    }

    public String getPhoneNum(){
        return this.phone_num;
    }

    public String getGender(){
        return this.gender;
    }

    public int getBirthYear(){
        return this.birth_year;
    }

    public ArrayList<CourseModel> getCourses() { return this.courses; }

    // set functions
    public void setId(String id) { this.id = id; }

    public void setUserName(String user_name){
        this.user_name = user_name;
    }

    public void setName(String student_name){
        this.student_name = student_name;
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
        this.phone_num = phone_num;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void getBirthYear(int birth_year){
        this.birth_year = birth_year;
    }

    public void setCourses(ArrayList<CourseModel> courses) { this.courses = courses; }

    //ToString
    @Override
    public String toString() {
        return String.format(
                "Student [id=%s, user name=%s, student name=%s, courses=%s]", id,
                user_name, student_name, courses);
    }
}
