package com.cusehack.safe_home.dao.beans;

public class Honesty {
    private long honestyId;
    private int honestyLevel;
    private long reportCount;
    private long validReportCount;
    private int honestyScore;

    public Honesty(long honestyId, int honestyLevel, long reportCount, long validReportCount, int honestyScore) {
        this.honestyId = honestyId;
        this.honestyLevel = honestyLevel;
        this.reportCount = reportCount;
        this.validReportCount = validReportCount;
        this.honestyScore = honestyScore;
    }

    public long getHonestyId() {
        return honestyId;
    }

    public void setHonestyId(long honestyId) {
        this.honestyId = honestyId;
    }

    public int getHonestyLevel() {
        return honestyLevel;
    }

    public void setHonestyLevel(int honestyLevel) {
        this.honestyLevel = honestyLevel;
    }

    public long getReportCount() {
        return reportCount;
    }

    public void setReportCount(long reportCount) {
        this.reportCount = reportCount;
    }

    public long getValidReportCount() {
        return validReportCount;
    }

    public void setValidReportCount(long validReportCount) {
        this.validReportCount = validReportCount;
    }

    public int getHonestyScore() {
        return honestyScore;
    }

    public void setHonestyScore(int honestyScore) {
        this.honestyScore = honestyScore;
    }
}
