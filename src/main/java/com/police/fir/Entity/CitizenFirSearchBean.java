package com.police.fir.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CitizenFirSearchBean {
    private int districtId;
    private String firNumDisplay;
    private int actId;
    private String actName;
    private String complainantFirstName;
    private String complainantLastName;
    private String complainantMiddleName;
    private String complainantName;
    private int districtCd;
    private String districtName;
    private String firBrief;
    private int firDate;
    private int firFromDate;
    private String firFromDateStr;
    private int firYear;
    private String isFirstSyncDone;
    private int langCd;
    private String linkedFirAction;
    private String linkedFirDetails;
    private int linkedFirs;
    private String linkingFir;
    private String linkingReason;
    private String misc1;
    private String misc2;
    private String nameType;
    private int orginalRecord;
    private int pageCacheRows;
    private int pageStartNo;
    private int pageTotalCount;
    List parameters;
    private int policeStationId;
    private String policeStationName;
    private String psRecordSyncOn;
    private String queryDynamicPart;
    private String queryKey;
    private String recordCreatedBy;
    private int recordCreatedOn;
    private String recordStatus;
    private String recordSyncFrom;
    private int recordSyncOn;
    private int recordSyncTo;
    private String recordUpStringdBy;
    private String recordUpStringdFrom;
    private int recordUpStringdOn;
    private int recordUpdatedFrom;
    private int recordUpdatedOn;
    private String recordUpdatedby;
    private int regFirNo;
    private String returnClassType;
    private boolean searchCrit;
    private String searchName;
    private int sectionId;
    private String sectionName;
    private int stateCd;
    private String stateName;
    private String statusOfFir;
    private int userDistrictCd;
    private int userPsCd;
    private String userStateCd;

    public String getUserStateCd() {
        return userStateCd;
    }

    public void setUserStateCd(String userStateCd) {
        this.userStateCd = userStateCd;
    }

    public int getUserPsCd() {
        return userPsCd;
    }

    public void setUserPsCd(int userPsCd) {
        this.userPsCd = userPsCd;
    }

    public int getUserDistrictCd() {
        return userDistrictCd;
    }

    public void setUserDistrictCd(int userDistrictCd) {
        this.userDistrictCd = userDistrictCd;
    }

    public String getStatusOfFir() {
        return statusOfFir;
    }

    public void setStatusOfFir(String statusOfFir) {
        this.statusOfFir = statusOfFir;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getStateCd() {
        return stateCd;
    }

    public void setStateCd(int stateCd) {
        this.stateCd = stateCd;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public boolean isSearchCrit() {
        return searchCrit;
    }

    public void setSearchCrit(boolean searchCrit) {
        this.searchCrit = searchCrit;
    }

    public String getReturnClassType() {
        return returnClassType;
    }

    public void setReturnClassType(String returnClassType) {
        this.returnClassType = returnClassType;
    }



    public int getRegFirNo() {
        return regFirNo;
    }

    public void setRegFirNo(int regFirNo) {
        this.regFirNo = regFirNo;
    }

    public String getRecordUpdatedby() {
        return recordUpdatedby;
    }

    public void setRecordUpdatedby(String recordUpdatedby) {
        this.recordUpdatedby = recordUpdatedby;
    }

    public int getRecordUpdatedOn() {
        return recordUpdatedOn;
    }

    public void setRecordUpdatedOn(int recordUpdatedOn) {
        this.recordUpdatedOn = recordUpdatedOn;
    }

    public int getRecordUpdatedFrom() {
        return recordUpdatedFrom;
    }

    public void setRecordUpdatedFrom(int recordUpdatedFrom) {
        this.recordUpdatedFrom = recordUpdatedFrom;
    }

    public int getRecordUpStringdOn() {
        return recordUpStringdOn;
    }

    public void setRecordUpStringdOn(int recordUpStringdOn) {
        this.recordUpStringdOn = recordUpStringdOn;
    }

    public String getRecordUpStringdFrom() {
        return recordUpStringdFrom;
    }

    public void setRecordUpStringdFrom(String recordUpStringdFrom) {
        this.recordUpStringdFrom = recordUpStringdFrom;
    }

    public String getRecordUpStringdBy() {
        return recordUpStringdBy;
    }

    public void setRecordUpStringdBy(String recordUpStringdBy) {
        this.recordUpStringdBy = recordUpStringdBy;
    }

    public int getRecordSyncTo() {
        return recordSyncTo;
    }

    public void setRecordSyncTo(int recordSyncTo) {
        this.recordSyncTo = recordSyncTo;
    }

    public int getRecordSyncOn() {
        return recordSyncOn;
    }

    public void setRecordSyncOn(int recordSyncOn) {
        this.recordSyncOn = recordSyncOn;
    }

    public String getRecordSyncFrom() {
        return recordSyncFrom;
    }

    public void setRecordSyncFrom(String recordSyncFrom) {
        this.recordSyncFrom = recordSyncFrom;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public int getRecordCreatedOn() {
        return recordCreatedOn;
    }

    public void setRecordCreatedOn(int recordCreatedOn) {
        this.recordCreatedOn = recordCreatedOn;
    }

    public String getRecordCreatedBy() {
        return recordCreatedBy;
    }

    public void setRecordCreatedBy(String recordCreatedBy) {
        this.recordCreatedBy = recordCreatedBy;
    }

    public String getQueryKey() {
        return queryKey;
    }

    public void setQueryKey(String queryKey) {
        this.queryKey = queryKey;
    }

    public String getQueryDynamicPart() {
        return queryDynamicPart;
    }

    public void setQueryDynamicPart(String queryDynamicPart) {
        this.queryDynamicPart = queryDynamicPart;
    }

    public String getPsRecordSyncOn() {
        return psRecordSyncOn;
    }

    public void setPsRecordSyncOn(String psRecordSyncOn) {
        this.psRecordSyncOn = psRecordSyncOn;
    }

    public String getPoliceStationName() {
        return policeStationName;
    }

    public void setPoliceStationName(String policeStationName) {
        this.policeStationName = policeStationName;
    }

    public int getPoliceStationId() {
        return policeStationId;
    }

    public void setPoliceStationId(int policeStationId) {
        this.policeStationId = policeStationId;
    }

    public List getParameters() {
        return parameters;
    }

    public void setParameters(List parameters) {
        this.parameters = parameters;
    }

    public int getPageTotalCount() {
        return pageTotalCount;
    }

    public void setPageTotalCount(int pageTotalCount) {
        this.pageTotalCount = pageTotalCount;
    }

    public int getPageStartNo() {
        return pageStartNo;
    }

    public void setPageStartNo(int pageStartNo) {
        this.pageStartNo = pageStartNo;
    }

    public int getPageCacheRows() {
        return pageCacheRows;
    }

    public void setPageCacheRows(int pageCacheRows) {
        this.pageCacheRows = pageCacheRows;
    }

    public int getOrginalRecord() {
        return orginalRecord;
    }

    public void setOrginalRecord(int orginalRecord) {
        this.orginalRecord = orginalRecord;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getMisc2() {
        return misc2;
    }

    public void setMisc2(String misc2) {
        this.misc2 = misc2;
    }

    public String getMisc1() {
        return misc1;
    }

    public void setMisc1(String misc1) {
        this.misc1 = misc1;
    }

    public String getLinkingReason() {
        return linkingReason;
    }

    public void setLinkingReason(String linkingReason) {
        this.linkingReason = linkingReason;
    }

    public String getLinkingFir() {
        return linkingFir;
    }

    public void setLinkingFir(String linkingFir) {
        this.linkingFir = linkingFir;
    }

    public int getLinkedFirs() {
        return linkedFirs;
    }

    public void setLinkedFirs(int linkedFirs) {
        this.linkedFirs = linkedFirs;
    }

    public String getLinkedFirDetails() {
        return linkedFirDetails;
    }

    public void setLinkedFirDetails(String linkedFirDetails) {
        this.linkedFirDetails = linkedFirDetails;
    }

    public String getLinkedFirAction() {
        return linkedFirAction;
    }

    public void setLinkedFirAction(String linkedFirAction) {
        this.linkedFirAction = linkedFirAction;
    }

    public int getLangCd() {
        return langCd;
    }

    public void setLangCd(int langCd) {
        this.langCd = langCd;
    }

    public String getIsFirstSyncDone() {
        return isFirstSyncDone;
    }

    public void setIsFirstSyncDone(String isFirstSyncDone) {
        this.isFirstSyncDone = isFirstSyncDone;
    }

    public int getFirYear() {
        return firYear;
    }

    public void setFirYear(int firYear) {
        this.firYear = firYear;
    }

    public String getFirFromDateStr() {
        return firFromDateStr;
    }

    public void setFirFromDateStr(String firFromDateStr) {
        this.firFromDateStr = firFromDateStr;
    }

    public int getFirFromDate() {
        return firFromDate;
    }

    public void setFirFromDate(int firFromDate) {
        this.firFromDate = firFromDate;
    }

    public int getFirDate() {
        return firDate;
    }

    public void setFirDate(int firDate) {
        this.firDate = firDate;
    }

    public String getFirBrief() {
        return firBrief;
    }

    public void setFirBrief(String firBrief) {
        this.firBrief = firBrief;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public int getDistrictCd() {
        return districtCd;
    }

    public void setDistrictCd(int districtCd) {
        this.districtCd = districtCd;
    }

    public String getComplainantName() {
        return complainantName;
    }

    public void setComplainantName(String complainantName) {
        this.complainantName = complainantName;
    }

    public String getComplainantMiddleName() {
        return complainantMiddleName;
    }

    public void setComplainantMiddleName(String complainantMiddleName) {
        this.complainantMiddleName = complainantMiddleName;
    }

    public String getComplainantLastName() {
        return complainantLastName;
    }

    public void setComplainantLastName(String complainantLastName) {
        this.complainantLastName = complainantLastName;
    }

    public String getComplainantFirstName() {
        return complainantFirstName;
    }

    public void setComplainantFirstName(String complainantFirstName) {
        this.complainantFirstName = complainantFirstName;
    }

    public String getActName() {
        return actName ; }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public int getActId() {
        return actId;
    }

    public void setActId(int actid) {
        this.actId = actid;
    }



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
