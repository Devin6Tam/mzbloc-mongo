package com.mzbloc.mongo.entity;

/**
 * Created by tanxw on 2018/12/12.
 */
public class LocationEntity extends BaseEntity{

    private String place;
    private int year;

    public LocationEntity() {
    }

    public LocationEntity(String place, int year) {
        this.place = place;
        this.year = year;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
