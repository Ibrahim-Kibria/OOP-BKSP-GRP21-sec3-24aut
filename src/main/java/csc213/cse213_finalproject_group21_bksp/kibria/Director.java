package csc213.cse213_finalproject_group21_bksp.kibria;

import csc213.cse213_finalproject_group21_bksp.Employee;

import java.io.Serializable;
import java.time.LocalDate;

public class Director extends Employee implements Serializable {

    public Director(int userId, String name, String gender, String email, LocalDate dob, String designation, String departmentName) {
        super(userId, name, gender, email, dob, designation, departmentName);
    }

    public void addEmployee(Employee employee) {
        // add employee to the system
    }

    public void removeEmployee(Employee employee) {
        // remove employee from the system
    }

}
