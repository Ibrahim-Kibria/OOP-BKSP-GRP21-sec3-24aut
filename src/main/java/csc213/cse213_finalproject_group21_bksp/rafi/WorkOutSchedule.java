package csc213.cse213_finalproject_group21_bksp.rafi;

import java.util.Date;

public class WorkOutSchedule {
    private Date date;
    private int hour;
    private int minute;
    private String workoutType;

    public WorkOutSchedule(Date date, int hour, int minute, String workoutType) {
        this.date = date;
        this.hour = hour;
        this.minute = minute;
        this.workoutType = workoutType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    @Override
    public String toString() {
        return "WorkOutSchedule{" +
                "date=" + date +
                ", hour=" + hour +
                ", minute=" + minute +
                ", workoutType='" + workoutType + '\'' +
                '}';
    }
}
