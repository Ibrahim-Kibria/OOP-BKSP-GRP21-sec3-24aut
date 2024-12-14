package csc213.cse213_finalproject_group21_bksp.kibria;

import csc213.cse213_finalproject_group21_bksp.Employee;

import java.io.Serializable;
import java.time.LocalDate;

public class Accountant extends Employee implements Serializable {

    public Accountant(int userId, String name, String gender, String email, LocalDate dob, String designation, String departmentName) {
        super(userId, name, gender, email, dob, designation, departmentName);
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "designation='" + designation + '\'' +
                ", dept='" + departmentName + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }

    public void addRevenue(Revenue_a revenue) {
        // add revenue to the system
    }

    public void removeRevenue(Revenue_a revenue) {
        // remove revenue from the system
    }


}
