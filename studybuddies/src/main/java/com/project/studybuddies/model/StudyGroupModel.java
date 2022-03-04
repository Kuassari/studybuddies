package com.project.studybuddies.model;

import java.util.ArrayList;

public class StudyGroupModel {

    private long groupId; // key
    private String course;
    private int courseId;
    private int maxParticipants;
    private int numOfParticipants;
    private String city;
    private String location;
    private String admin;
    private ArrayList<StudentModel> students = new ArrayList<StudentModel>();

    static long generatedGroupId = 1;

    public StudyGroupModel(){};

    public StudyGroupModel(String course, int courseId, int maxParticipants, int numOfParticipants, String city, String location, String admin){
        this.groupId = generatedGroupId;
        this.course = course;
        this.courseId = courseId;
        this.maxParticipants = maxParticipants;
        this.numOfParticipants = numOfParticipants;
        this.city = city;
        this.location = location;
        this.admin = admin;

        generatedGroupId++;
    }

    // get functions
    public long getGroupId(){
        return this.groupId;
    }

    public String getCourse(){
        return this.course;
    }

    public int getCourseId(){
        return this.courseId;
    }

    public int getMaxParticipants(){
        return this.maxParticipants;
    }

    public int getNumOfParticipants(){
        return this.numOfParticipants;
    }

    public String getCity(){
        return this.city;
    }

    public String getLocation(){
        return this.location;
    }

    public String getAdmin(){
        return this.admin;
    }

    // set functions

    public void setGroupId(long group_id){
        this.groupId = group_id;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public void setCourseId(int course_id){
        this.courseId = course_id;
    }

    public void setMaxParticipants(int max_participants){
        this.maxParticipants = max_participants;
    }

    public void setNumOfParticipants(int num_of_participants){
        this.numOfParticipants = num_of_participants;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setAdmin(String username){
        this.admin = username;
    }


    public void printStudyGroup(StudyGroupModel group){
        System.out.println("groupId: " + group.groupId);
        System.out.println("course: " + group.course);
        System.out.println("courseId: " + group.courseId);
        System.out.println("maxParticipants: " + group.maxParticipants);
        System.out.println("numOfParticipants: " + group.numOfParticipants);
        System.out.println("city: " + group.city);
        System.out.println("location: " + group.location);
        System.out.println("admin: " + group.admin);
    }

}
