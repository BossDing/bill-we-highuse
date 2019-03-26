package com.geekq.billhighuse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ALog {
    private Long pointLogId;

    private BigDecimal amount;

    private BigDecimal banlance;

    private String notes;

    private Integer operation;

    private Date time;

    private Integer version;

    private Integer fromUser;

    private Integer loan;

    private Integer toUser;

    private Integer user;

    private Integer operationType;

    private Integer subPointId;

    private String custText1;

    private String custText2;

    private Long custInt1;

    public Long getPointLogId() {
        return pointLogId;
    }

    public void setPointLogId(Long pointLogId) {
        this.pointLogId = pointLogId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBanlance() {
        return banlance;
    }

    public void setBanlance(BigDecimal banlance) {
        this.banlance = banlance;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getFromUser() {
        return fromUser;
    }

    public void setFromUser(Integer fromUser) {
        this.fromUser = fromUser;
    }

    public Integer getLoan() {
        return loan;
    }

    public void setLoan(Integer loan) {
        this.loan = loan;
    }

    public Integer getToUser() {
        return toUser;
    }

    public void setToUser(Integer toUser) {
        this.toUser = toUser;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public Integer getSubPointId() {
        return subPointId;
    }

    public void setSubPointId(Integer subPointId) {
        this.subPointId = subPointId;
    }

    public String getCustText1() {
        return custText1;
    }

    public void setCustText1(String custText1) {
        this.custText1 = custText1;
    }

    public String getCustText2() {
        return custText2;
    }

    public void setCustText2(String custText2) {
        this.custText2 = custText2;
    }

    public Long getCustInt1() {
        return custInt1;
    }

    public void setCustInt1(Long custInt1) {
        this.custInt1 = custInt1;
    }
}