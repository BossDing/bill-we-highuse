package com.geekq.billhighuse.entity;

import java.util.Date;

/**
 * 邱润泽 bullock
 */
public class BillTask {
    /**
     * 不允许使用无参构造器
     */
    private BillTask(){}

    public BillTask(String day,String type,Integer status){
        this.day = day;
        this.type = type;
        this.status = status;
        this.createTime = new Date();
        this.updateTime = new Date();
        this.version = 0;
    }
    /** 自增id*/
    private Integer id;

    /** 账单日期*/
    private String day;

    /** 账单类型 DAY:日账单 MONTH:月账单*/
    private String type;

    /** 0 未处理,1已处理*/
    private Integer status;

    /** 创建时间*/
    private Date createTime;

    /** 更新时间*/
    private Date updateTime;

    /** 版本号*/
    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}