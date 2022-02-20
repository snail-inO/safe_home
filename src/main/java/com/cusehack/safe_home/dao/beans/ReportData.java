package com.cusehack.safe_home.dao.beans;

import com.cusehack.safe_home.constant.CrimeTypeEnum;

import java.util.Date;

public class ReportData {
    private long reportId;
    private String reportContent;
    private Date reportTime;
    private CrimeTypeEnum crimeType;
}
