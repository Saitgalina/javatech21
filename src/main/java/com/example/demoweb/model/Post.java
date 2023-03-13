package com.example.demoweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Post implements Serializable {
    private String text;
    private Integer likes;
    private  Date creationDate;
    @Id
    @GeneratedValue
    private Long id;

    public Post(){};
    public Post(Long id,String text, Date date)
    {
        this.id = id;
        this.text = text;
        this.creationDate =date;
        this.likes = 0;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getId() {
        return id;
    }
}
