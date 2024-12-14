package csc213.cse213_finalproject_group21_bksp.kibria;

import java.io.Serializable;

public class Revenue_a implements Serializable {
    private String revenueName, revenueType, status;
    private int rvnId;

    public Revenue_a(String revenueName, String revenueType, String status, int id) {
        this.revenueName = revenueName;
        this.revenueType = revenueType;
        this.status = status;
        this.rvnId = id;
    }

    public String getRevenueName() {
        return revenueName;
    }

    public void setRevenueName(String revenueName) {
        this.revenueName = revenueName;
    }

    public String getRevenueType() {
        return revenueType;
    }

    public void setRevenueType(String revenueType) {
        this.revenueType = revenueType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return rvnId;
    }

    public void setId(int id) {
        this.rvnId = id;
    }

    @Override
    public String toString() {
        return "Revenue_a{" +
                "revenueName='" + revenueName + '\'' +
                ", revenueType='" + revenueType + '\'' +
                ", status='" + status + '\'' +
                ", id=" + rvnId +
                '}';
    }
}
