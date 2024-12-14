package csc213.cse213_finalproject_group21_bksp.kibria;

import java.io.Serializable;

public class Fund_a implements Serializable {
    private String fundName, fundType, fundStatus;
    private int fundId;

    public Fund_a(String fundName, String fundType, String fundStatus, int fundId) {
        this.fundName = fundName;
        this.fundType = fundType;
        this.fundStatus = fundStatus;
        this.fundId = fundId;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getFundStatus() {
        return fundStatus;
    }

    public void setFundStatus(String fundStatus) {
        this.fundStatus = fundStatus;
    }

    public int getFundId() {
        return fundId;
    }

    public void setFundId(int fundId) {
        this.fundId = fundId;
    }

    @Override
    public String toString() {
        return "Fund_a{" +
                "fundName='" + fundName + '\'' +
                ", fundType='" + fundType + '\'' +
                ", fundStatus='" + fundStatus + '\'' +
                ", fundId=" + fundId +
                '}';
    }
}
