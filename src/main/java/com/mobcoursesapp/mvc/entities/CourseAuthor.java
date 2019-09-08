package com.mobcoursesapp.mvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "CourseAuthor")
public class CourseAuthor implements Serializable {

    @Id
    @GeneratedValue
    private Long courseAuthorID;

    private String name;

    @OneToMany(mappedBy = "courseAuthor", fetch = FetchType.EAGER)
    private List<Course> courses;

    private String email;

    private String password;

    private String phone;


    public CourseAuthor() {
    }

    //Setters

    public void setCourseAuthorID(Long courseAuthorID) {
        this.courseAuthorID = courseAuthorID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    //Getters


    public Long getCourseAuthorID() {
        return courseAuthorID;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }
}
