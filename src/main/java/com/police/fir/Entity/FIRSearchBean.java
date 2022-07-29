package com.police.fir.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FIRSearchBean {
    private CitizenFirSearchBean citizenFirSearchBean;
    private List<CitizenFirSearchBean> list;

    public CitizenFirSearchBean getCitizenFirSearchBean() {
        System.out.println(citizenFirSearchBean.getDistrictId());
        return citizenFirSearchBean;
    }

    public void setCitizenFirSearchBean(CitizenFirSearchBean citizenFirSearchBean) {
        this.citizenFirSearchBean = citizenFirSearchBean;
    }

    public List<CitizenFirSearchBean> getList() {
        return list;
    }

    public void setList(List<CitizenFirSearchBean> list) {
        this.list = list;
    }
}
