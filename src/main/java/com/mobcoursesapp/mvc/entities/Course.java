package com.mobcoursesapp.mvc.entities;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Course")
public class Course implements Serializable {

    @Id
    @GeneratedValue
    private Long courseID;

    private String courseTitle;

    @ManyToOne
    @JoinColumn(name = "subjectID")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "courseAuthorID")
    private CourseAuthor courseAuthor;

    private String courseDescription;

    private String otherDetails;

    private String requirements;

    @Transient
    private MultipartFile photo;

    @OneToMany(mappedBy = "course")
    private List<Lesson> lessons;


    public Course() {
    }



    //Setters


    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setCourseAuthor(CourseAuthor courseAuthor) {
        this.courseAuthor = courseAuthor;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public void setPhoto(MultipartFile photo) {
        this.photo = photo;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    //Getters


    public Long getCourseID() {
        return courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public Subject getSubject() {
        return subject;
    }

    public CourseAuthor getCourseAuthor() {
        return courseAuthor;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public String getRequirements() {
        return requirements;
    }

    public MultipartFile getPhoto() {
        return photo;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }
}
