package csc213.cse213_finalproject_group21_bksp.kibria;

import java.io.Serializable;

public class FinancialAid_a extends Request_d implements Serializable {
    private String athleteName, application, status;
    private int id;

    public FinancialAid_a(String athleteName, String application, String status, int id) {
        this.athleteName = athleteName;
        this.application = application;
        this.status = status;
        this.id = id;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FinancialAid_a{" +
                "athleteName='" + athleteName + '\'' +
                ", application='" + application + '\'' +
                ", status='" + status + '\'' +
                ", id=" + id +
                '}';
    }
}
