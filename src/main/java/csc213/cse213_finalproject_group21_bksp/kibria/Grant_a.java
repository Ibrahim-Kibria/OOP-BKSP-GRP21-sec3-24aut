package csc213.cse213_finalproject_group21_bksp.kibria;

import java.io.Serializable;

public class Grant_a extends Request_d implements Serializable {
    private String grantName, grantStatus;
    private int grantId;

    public Grant_a(String grantName, String grantStatus, int grantId) {
        this.grantName = grantName;
        this.grantStatus = grantStatus;
        this.grantId = grantId;
    }

    public String getGrantName() {
        return grantName;
    }

    public void setGrantName(String grantName) {
        this.grantName = grantName;
    }

    public String getGrantStatus() {
        return grantStatus;
    }

    public void setGrantStatus(String grantStatus) {
        this.grantStatus = grantStatus;
    }

    public int getGrantId() {
        return grantId;
    }

    public void setGrantId(int grantId) {
        this.grantId = grantId;
    }

    @Override
    public String toString() {
        return "Grant_a{" +
                "grantName='" + grantName + '\'' +
                ", grantStatus='" + grantStatus + '\'' +
                ", grantId=" + grantId +
                '}';
    }

}