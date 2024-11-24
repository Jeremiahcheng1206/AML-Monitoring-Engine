package com.chengyu.amlewsbdl.domain;

import lombok.Data;
import java.util.Date;

@Data
public class RiskAssessment {
    private Integer assessmentId;
    private String factors;
    private String riskLevel;
    private Integer riskScore;
    private Date assessmentDate;
}