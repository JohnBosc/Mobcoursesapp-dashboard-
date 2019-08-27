package com.mobcoursesapp.mvc.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Lesson")
public class Lesson implements Serializable {

    @Id
    @GeneratedValue
    private Long lessonID;

    private String lessonTitle;

    @ManyToOne
    @JoinColumn(name = "courseID")
    private Course course;

    @OneToMany(mappedBy = "lesson")
    private List<Title> titles;


    public Lesson() {
    }



    //Setters

    public void setLessonID(Long lessonID) {
        this.lessonID = lessonID;
    }

    public void setLessonTitle(String lessonTitle) {
        this.lessonTitle = lessonTitle;
    }

    @JsonIgnore
    public void setCourse(Course course) {
        this.course = course;
    }


    //Getters


    public Long getLessonID() {
        return lessonID;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }

    @JsonIgnore
    public Course getCourse() {
        return course;
    }
}
