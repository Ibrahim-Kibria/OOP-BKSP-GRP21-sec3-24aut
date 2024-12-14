package csc213.cse213_finalproject_group21_bksp.rafi;

import csc213.cse213_finalproject_group21_bksp.User;

import java.io.Serializable;
import java.time.LocalDate;


import javax.swing.*;

public class Player extends User implements Serializable {
    public Player(int id, String name, String gender, String email, LocalDate dob) {
        super(id, name, gender, email, dob);
    }

    @Override
    public String toString() {
        return "Player{" +
                "dob=" + dob +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
