package com.company;

import java.util.Date;

public class Lost{
    private String name;
    private String date;
    private String place;
    public Lost(){
        this.name=name;
        this.date=date;
        this.place=place;

    }
    public Lost(String name,String date,String place) {
        this.name=name;
        this.date=date;
        this.place=place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Lost{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}


