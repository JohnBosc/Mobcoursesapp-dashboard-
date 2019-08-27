package com.mobcoursesapp.mvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Subject")
public class Subject implements Serializable {

    @Id
    @GeneratedValue
    private Long subjectID;

    private String subjectName;

    @OneToMany(mappedBy = "subject")
    private List<Course> courses;



    public Subject() {
    }


    //Setters
    public void setSubjectID(Long subjectID) {
        this.subjectID = subjectID;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    //Getters


    public Long getSubjectID() {
        return subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
