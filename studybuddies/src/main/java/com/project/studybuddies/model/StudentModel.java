package com.project.studybuddies.model;

import java.util.ArrayList;

public class StudentModel {
    private String username; // key
    private String studentName;
    private String password;
    private String city;
    private String location;
    private String phoneNum;
    private String gender;
    private ArrayList<Integer> courses;

    public StudentModel(){ }

    public StudentModel(String username, String student_name, String password, String city, String location, String phone_num, String gender){
        this.username = username;
        this.studentName = student_name;
        this.password = password;
        this.city = city;
        this.location = location;
        this.phoneNum = phone_num;
        this.gender = gender;
        this.courses = new ArrayList<Integer>();
    }

    // public Base.Student (Base.Student studentToCopy){

    // }


    // get functions

    public String getUsername(){
        return this.username;
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

//    public ArrayList<Integer> getCourses(){
//        return this.courses;
//    }


    // public ArrayList<String> getCourses() throws CloneNotSupportedException{
    //     ArrayList<String> courses_copy = new ArrayList<String>();
    //     Iterator<String> iterator = this.courses.iterator();
    //     while(iterator.hasNext()){
    //         courses_copy.add((String) iterator.next().clone());
    //     }
    //     return courses_copy;
    // }

    // set functions

    public void setUsername(String username){
        this.username = username;
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

//    public void addCourse(String courseToAdd){
//        this.courses.add(courseToAdd);
//    }

    public void printStudent(StudentModel s){
        System.out.println("username: " + s.username);
        System.out.println("name: " + s.studentName);
        System.out.println("password: " + s.password);
        System.out.println("city: " + s.city);
        System.out.println("location: " + s.location);
        System.out.println("phone number: " + s.phoneNum);
        System.out.println("gender: " + s.gender);
    }
}
