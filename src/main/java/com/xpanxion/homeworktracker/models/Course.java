package com.xpanxion.homeworktracker.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String title;
    @Column
    private String language;
    @Column
    private String subject;
    @Column
    private String imageUrl;

    public Course() {

    }

    public Course(int id, String title, String language, String subject, String imageUrl) {
        this.id = id;
        this.title = title;
        this.language = language;
        this.subject = subject;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString(){
        return "Course{" +
                ",title = '" + title + '\''+ ",language = '" + language + '\''+
                ",subject = '" + subject + '\''+
                ",imgUrl = '" + imageUrl + '\''+
                '}';
    }
}
