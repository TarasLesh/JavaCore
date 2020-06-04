package lesson4;

import java.util.Objects;

public class Time {
    private int hour;
    private int min;

    public Time(int hour, int min) {
        if (min <= 59 && min >= 0 && hour >= 0 && hour <= 23) {
            this.hour = hour;
            this.min = min;
        } else {
            System.out.println("Invalid TIME!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour &&
                min == time.min;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, min);
    }

    @Override
    public String toString() {
        return "Time: " +
                hour + " : " + min;
    }
}
