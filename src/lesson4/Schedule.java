package lesson4;

//    Schedule:
//        - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
//        - Сортування по startTime.
//        - методи: addSeance (Seance), removeSeance (Seance);

import java.util.Objects;
import java.util.TreeSet;

public class Schedule {

    private TreeSet<Seance> seances;

    public Schedule() {
        this.seances = new TreeSet<>();
    }

    public void addSeance(Seance seance) {
        this.seances.add(seance);
    }

    public void removeSeance(Seance seance) {
        this.seances.remove(seance);
    }

    public TreeSet<Seance> getSeances() {
        return seances;
    }

    public void setSeances(TreeSet<Seance> seances) {
        this.seances = seances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(seances, schedule.seances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seances);
    }

    @Override
    public String toString() {
        return "\n Schedule: " +
                "seances: " + seances;
    }
}