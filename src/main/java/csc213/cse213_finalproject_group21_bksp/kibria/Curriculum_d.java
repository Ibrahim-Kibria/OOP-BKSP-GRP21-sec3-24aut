package csc213.cse213_finalproject_group21_bksp.kibria;

import java.io.Serializable;
import java.util.List;

public class Curriculum_d implements Serializable {
    private String name, approval;
    private int credits;
    private List<Course_d> courses;


    public Curriculum_d(String name, String approval, int credits, List<Course_d> courses) {
        this.name = name;
        this.approval = approval;
        this.credits = credits;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApproval() {
        return approval;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public List<Course_d> getCourses() {
        return courses;
    }

    public void setCourses(List<Course_d> courses) {
        this.courses = courses;
    }

    public String toString() {
        return "Curriculum_d{" +
                "name='" + name + '\'' +
                ", approval='" + approval + '\'' +
                ", credits=" + credits +
                ", courses=" + courses +
                '}';
    }



}
