package com.globant.pps.repository.entity;


import com.orm.SugarRecord;

public class User extends SugarRecord {

    String height;
    Long date;

    public User() {
    }

    public User(String height, Long date) {
        this.height = height;
        this.date = date;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
}
