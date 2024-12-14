package csc213.cse213_finalproject_group21_bksp;

import csc213.cse213_finalproject_group21_bksp.kibria.Department_d;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Employee extends User implements Serializable {
    protected String designation, departmentName;
    protected float salary;


    public Employee(int userId, String name, String gender, String email, LocalDate dob, String designation, String departmentName) {
        super(userId, name, gender, email, dob);
        this.designation = designation;
        this.departmentName = departmentName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "designation='" + designation + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", salary=" + salary +
                ", userId=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}
