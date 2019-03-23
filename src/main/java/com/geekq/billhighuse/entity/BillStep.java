package com.geekq.billhighuse.entity;

import java.util.Date;

/**
 * 邱润泽 bullock
 */
public class BillStep {

    private BillStep(){}


    public BillStep(Long rangeStart,Long rangeEnd,String day,String type,Integer status,String msg){
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
        this.day = day;
        this.type = type;
        this.status = status;
        this.msg = msg;
        this.createTime = new Date();
        this.updateTime = new Date();
        this.version = 0;
    }
    /** 自增id*/
    private Integer id;

    /** bill_task.id*/
    private Integer taskId;

    /** 数据开始位置 >rangeStart  */
    private Long rangeStart;

    /** 数据结束位置 <=rangeEnd*/
    private Long rangeEnd;

    /** 账单日期*/
    private String day;

    /** 账单类型 DAY:日账单 MONTH:月账单*/
    private String type;

    /** 0:未处理,1:已处理,2:失败*/
    private Integer status;

    /** 其它信息*/
    private String msg;

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

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Long getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(Long rangeStart) {
        this.rangeStart = rangeStart;
    }

    public Long getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(Long rangeEnd) {
        this.rangeEnd = rangeEnd;
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
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