package com.mobcoursesapp.mvc.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Course")
public class Course implements Serializable {

    @Id
    @GeneratedValue
    private Long courseID;

    private String course_name;

    @ManyToOne
    @JoinColumn(name = "subjectID")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "course_AuthorID")
    private Course_Author course_author;

    private String course_description;

    private String other_details;

    private String requirements;

    private String photo;


    public Course() {
    }

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_description() {
        return course_description;
    }

    public void setCourse_description(String course_description) {
        this.course_description = course_description;
    }

    public String getOther_details() {
        return other_details;
    }

    public void setOther_details(String other_details) {
        this.other_details = other_details;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Course_Author getCourse_author() {
        return course_author;
    }

    public void setCourse_author(Course_Author course_author) {
        this.course_author = course_author;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
