package com.mobcoursesapp.mvc.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Title")
public class Title implements Serializable {

    @Id
    @GeneratedValue
    private Long titleID;

    private String titleName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "lessonID")
    private Lesson lesson;

    private String content;


    public Title() {
    }



    //Setters

    public void setTitleID(Long titleID) {
        this.titleID = titleID;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public void setContent(String content) {
        this.content = content;
    }


    //Getters


    public Long getTitleID() {
        return titleID;
    }

    public String getTitleName() {
        return titleName;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public String getContent() {
        return content;
    }
}
