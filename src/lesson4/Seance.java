package lesson4;

import java.util.Objects;
//    Seance:
//        - Movie movie, Time startTime, Time endTime;
//        - в конструктор має надходити параметрами значення для перших двох полів,
//        третє поле повинне обчислюватись (start + duration);

public class Seance implements Comparable<Seance> {

    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;

        int oneHour = 0;
        if ((this.startTime.getMin() + this.movie.getDuration().getMin()) >= 60) {
            oneHour = 1;
        }

        this.endTime = new Time(
                (this.startTime.getHour() + this.movie.getDuration().getHour() + oneHour) % 24,
                (this.startTime.getMin() + this.movie.getDuration().getMin()) % 60
        );
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance seance = (Seance) o;
        return Objects.equals(movie, seance.movie) &&
                Objects.equals(startTime, seance.startTime) &&
                Objects.equals(endTime, seance.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, startTime, endTime);
    }

    @Override
    public String toString() {
        return " \n Seance:" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime;
    }

    @Override
    public int compareTo(Seance o) {
        return this.startTime.getHour() - o.startTime.getHour();
    }
}
