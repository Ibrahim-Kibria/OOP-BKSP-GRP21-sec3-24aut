package csc213.cse213_finalproject_group21_bksp.kibria;

import java.io.Serializable;
import java.util.List;

public class Program_d implements Serializable {
    private String name;
    private String id;
    private int credits;
    private String approval;


    private Curriculum_d curriculum;

    public Program_d(String name, String id, int credits, String approval, Curriculum_d curriculum) {
        this.name = name;
        this.id = id;
        this.credits = credits;
        this.approval = approval;
        this.curriculum = curriculum;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getApproval() {
        return approval;
    }

    private void setApproval(String approval) {
        this.approval = approval;
    }

    public Curriculum_d getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum_d curriculum) {
        this.curriculum = curriculum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Program_d{" +
                "name='" + name + '\'' +
                ", Id='" + id + '\'' +
                ", credits=" + credits +
                ", approval='" + approval + '\'' +
                ", curriculum=" + curriculum +
                '}';
    }

    public void addprogram(Program_d program) {
        // add program to the system
    }

    public void removeprogram(Program_d program) {
        // remove program from the system
    }

    public void editprogram(Program_d program) {
        // edit program in the system
    }


}
