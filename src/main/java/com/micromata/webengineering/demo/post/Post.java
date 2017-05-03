package com.micromata.webengineering.demo.post;

import java.util.Date;

/**
 * Created by Mina on 04.05.2017.
 */
public class Post {



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Post(String title) {
        this.title = title;
        this.date = new Date();
    }

    private Date date ;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private String title;

}