package csc213.cse213_finalproject_group21_bksp.kibria;

import java.io.Serializable;

public class Policies_d implements Serializable {

    private String title, description, type, departmentName, status;
    private int id;

    public Policies_d(String title, String description, String type, String departmentName, String status, int id) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.departmentName = departmentName;
        this.status = status;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Policies_d{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }
}
