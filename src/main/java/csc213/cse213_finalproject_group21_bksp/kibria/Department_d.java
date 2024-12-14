package csc213.cse213_finalproject_group21_bksp.kibria;

import java.io.Serializable;

public abstract class Department_d implements Serializable {
    String departmentName;
    int postedPeople;


    public Department_d(String departmentName, int postedPeople) {
        this.departmentName = departmentName;
        this.postedPeople = postedPeople;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getPostedPeople() {
        return postedPeople;
    }

    public void setPostedPeople(int postedPeople) {
        this.postedPeople = postedPeople;
    }

    @Override
    public String toString() {
        return "Department_d{" +
                "departmentName='" + departmentName + '\'' +
                ", postedPeople=" + postedPeople +
                '}';
    }
}
