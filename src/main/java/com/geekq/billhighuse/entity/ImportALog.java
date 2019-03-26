package com.geekq.billhighuse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ImportALog extends ImportALogKey {
    private BigDecimal amount = BigDecimal.ZERO;

    private Date time;

    private Integer operation;

    private Date createTime;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}