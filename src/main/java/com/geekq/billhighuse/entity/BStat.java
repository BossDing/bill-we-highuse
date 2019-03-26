package com.geekq.billhighuse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BStat {
    private Integer id;

    private BigDecimal currentPlanAmount;

    private Integer currentPlanCount;

    private Integer sumBidCount;

    private BigDecimal sumPlanAmount;

    private Integer sumPlanCount;

    private BigDecimal sumPlanInterest;

    private Integer userId;

    private Integer version;

    private BigDecimal sumInterestReinvestedAmount;

    private BigDecimal joinFee;

    private BigDecimal exitFee;

    private BigDecimal serviceFee;

    private Integer exitCount;

    private Integer exitingCount;

    private BigDecimal total;

    private BigDecimal rate;

    private BigDecimal assets;

    private Date lastUpdateTime;

    private String subPointType;

    private Integer totalOverdueDays;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCurrentPlanAmount() {
        return currentPlanAmount;
    }

    public void setCurrentPlanAmount(BigDecimal currentPlanAmount) {
        this.currentPlanAmount = currentPlanAmount;
    }

    public Integer getCurrentPlanCount() {
        return currentPlanCount;
    }

    public void setCurrentPlanCount(Integer currentPlanCount) {
        this.currentPlanCount = currentPlanCount;
    }

    public Integer getSumBidCount() {
        return sumBidCount;
    }

    public void setSumBidCount(Integer sumBidCount) {
        this.sumBidCount = sumBidCount;
    }

    public BigDecimal getSumPlanAmount() {
        return sumPlanAmount;
    }

    public void setSumPlanAmount(BigDecimal sumPlanAmount) {
        this.sumPlanAmount = sumPlanAmount;
    }

    public Integer getSumPlanCount() {
        return sumPlanCount;
    }

    public void setSumPlanCount(Integer sumPlanCount) {
        this.sumPlanCount = sumPlanCount;
    }

    public BigDecimal getSumPlanInterest() {
        return sumPlanInterest;
    }

    public void setSumPlanInterest(BigDecimal sumPlanInterest) {
        this.sumPlanInterest = sumPlanInterest;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getSumInterestReinvestedAmount() {
        return sumInterestReinvestedAmount;
    }

    public void setSumInterestReinvestedAmount(BigDecimal sumInterestReinvestedAmount) {
        this.sumInterestReinvestedAmount = sumInterestReinvestedAmount;
    }

    public BigDecimal getJoinFee() {
        return joinFee;
    }

    public void setJoinFee(BigDecimal joinFee) {
        this.joinFee = joinFee;
    }

    public BigDecimal getExitFee() {
        return exitFee;
    }

    public void setExitFee(BigDecimal exitFee) {
        this.exitFee = exitFee;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public Integer getExitCount() {
        return exitCount;
    }

    public void setExitCount(Integer exitCount) {
        this.exitCount = exitCount;
    }

    public Integer getExitingCount() {
        return exitingCount;
    }

    public void setExitingCount(Integer exitingCount) {
        this.exitingCount = exitingCount;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getAssets() {
        return assets;
    }

    public void setAssets(BigDecimal assets) {
        this.assets = assets;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getSubPointType() {
        return subPointType;
    }

    public void setSubPointType(String subPointType) {
        this.subPointType = subPointType == null ? null : subPointType.trim();
    }

    public Integer getTotalOverdueDays() {
        return totalOverdueDays;
    }

    public void setTotalOverdueDays(Integer totalOverdueDays) {
        this.totalOverdueDays = totalOverdueDays;
    }
}