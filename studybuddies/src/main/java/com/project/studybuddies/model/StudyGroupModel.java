package com.project.studybuddies.model;

import java.util.ArrayList;

public class StudyGroupModel {

    // write properties of group
    // array of students, id of the group, num of students, course object
    // get functions
    // no need location and city because student array contain that info

    private int group_id; // key
    private int max_participants;
    private int num_of_participants;
    private StudentModel admin;
    private CourseModel course;
    private ArrayList<StudentModel> students;

    public int getGroupId(){
        return this.group_id;
    }

    /* need to refactor this
    public CourseModel getCourse(){
        return CourseModel.ToString();
    }
    */

    public int getMaxParticipants(){
        return this.max_participants;
    }

    public int getNumOfParticipants(){
        return this.num_of_participants;
    }

}
