package csc213.cse213_finalproject_group21_bksp.kibria;

import java.io.Serializable;

public class Hire_d extends Request_d implements Serializable {
    private String position, departmentName, status;
    int id;

    public Hire_d(String position, String departmentName, String status, int id) {
        this.position = position;
        this.departmentName = departmentName;
        this.status = status;
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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
        return "Hire_d{" +
                "position='" + position + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", status='" + status + '\'' +
                ", id=" + id +
                '}';
    }
}
