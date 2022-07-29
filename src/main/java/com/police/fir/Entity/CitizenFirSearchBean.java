package com.police.fir.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CitizenFirSearchBean {
    private int districtId;
    private String firNumDisplay;

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public String getFirNumDisplay() {
        return firNumDisplay;
    }

    public void setFirNumDisplay(String firNumDisplay) {
        this.firNumDisplay = firNumDisplay;
    }
}
