package com.project.studybuddies.model;

public class CourseModel {
    private int id;
    private String name;

    public CourseModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
    public void setId(int id){
        this.id = id;
    }

    //ToString
    @Override
    public String toString() {
        return String.format(
                "Course [id=%s, name=%s]", id, name);
    }

    // this class represent course independently without any info on users
    // every student will have array of courses and we use that info for group study
}
