package com.mobcoursesapp.mvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Course_Author")
public class Course_Author implements Serializable {

    @Id
    @GeneratedValue
    private Long course_AuthorID;

    private String name;

    @OneToMany(mappedBy = "course_author")
    private List<Course> courseList;

    private String password;

    private String phone;


    public Course_Author() {
    }


    public Long getCourse_AuthorID() {
        return course_AuthorID;
    }

    public void setCourse_AuthorID(Long course_AuthorID) {
        this.course_AuthorID = course_AuthorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
