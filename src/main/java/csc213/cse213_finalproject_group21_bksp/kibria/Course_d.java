package csc213.cse213_finalproject_group21_bksp.kibria;

import java.io.Serializable;

public class Course_d implements Serializable {
    private String name;
    private String Id;
    private int credits;
    private Course_d prerequisites;
    private String approval;

    public Course_d(String name, String id, int credits, String approval) {
        this.name = name;
        Id = id;
        this.credits = credits;
        this.approval = approval;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public int getCredits() {
        return credits;
    }

    public Course_d getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(Course_d prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getApproval() {
        return approval;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    @Override
    public String toString() {
        return "Course_d{" +
                "name='" + name + '\'' +
                ", Id='" + Id + '\'' +
                ", credits=" + credits +
                ", prerequisites=" + prerequisites +
                ", approval='" + approval + '\'' +
                '}';
    }
}
