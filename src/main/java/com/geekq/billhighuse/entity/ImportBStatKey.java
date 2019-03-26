package com.geekq.billhighuse.entity;

public class ImportBStatKey {
    private String day;

    private Integer userid;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}