package csc213.cse213_finalproject_group21_bksp.rafi;

public class TimeSlot {
    private int hour;
    private int minute;
    private String date;

    public TimeSlot(int hour, int minute, String date) {
        this.hour = hour;
        this.minute = minute;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TimeSlot{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", date='" + date + '\'' +
                '}';
    }
}
