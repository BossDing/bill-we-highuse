package com.geekq.billhighuse.entity;

import java.math.BigDecimal;

public class ImportBStat extends ImportBStatKey {
    private Integer currentPlanCount = 0;

    private BigDecimal currentPlanAmount = BigDecimal.ZERO;

    private BigDecimal sumPlanAmount = BigDecimal.ZERO;

    private BigDecimal assets = BigDecimal.ZERO;

    private String subPointType;

    private BigDecimal sumPlanInterest = BigDecimal.ZERO;

    public Integer getCurrentPlanCount() {
        return currentPlanCount;
    }

    public void setCurrentPlanCount(Integer currentPlanCount) {
        this.currentPlanCount = currentPlanCount;
    }

    public BigDecimal getCurrentPlanAmount() {
        return currentPlanAmount;
    }

    public void setCurrentPlanAmount(BigDecimal currentPlanAmount) {
        this.currentPlanAmount = currentPlanAmount;
    }

    public BigDecimal getSumPlanAmount() {
        return sumPlanAmount;
    }

    public void setSumPlanAmount(BigDecimal sumPlanAmount) {
        this.sumPlanAmount = sumPlanAmount;
    }

    public BigDecimal getAssets() {
        return assets;
    }

    public void setAssets(BigDecimal assets) {
        this.assets = assets;
    }

    public String getSubPointType() {
        return subPointType;
    }

    public void setSubPointType(String subPointType) {
        this.subPointType = subPointType == null ? null : subPointType.trim();
    }

    public BigDecimal getSumPlanInterest() {
        return sumPlanInterest;
    }

    public void setSumPlanInterest(BigDecimal sumPlanInterest) {
        this.sumPlanInterest = sumPlanInterest;
    }
}