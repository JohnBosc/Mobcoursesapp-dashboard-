package com.mobcoursesapp.mvc.entities;

import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "Student")
public class Student implements Serializable {

    @Id
    @GeneratedValue
    private Long studentID;

    private String name;

    private String password;

    private String email;

    private String phone;



    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "Student_Course",
            joinColumns = {@JoinColumn(name = "Student_studentID", referencedColumnName = "studentID")},
            inverseJoinColumns = {@JoinColumn(name = "Course_courseID", referencedColumnName = "courseID")}
    )
    private Collection<Course> courseCollection;


    public Student() {
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Collection<Course> getCourseCollection() {
        return courseCollection;
    }

    public void setCourseCollection(Collection<Course> courseCollection) {
        this.courseCollection = courseCollection;
    }
}
