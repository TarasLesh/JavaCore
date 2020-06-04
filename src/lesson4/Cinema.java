package lesson4;

//        - TreeMap<Days, Schedule>, Time open, Time close;
//        - врахувати час відкриття і закриття при формуванні сеансів!
//        - методи: addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день),
//        addSeance (Seance, String) (додає один сеанс в конкретний день),
//        removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу),
//        removeSeance (Seance, String) (видаляє конкретний сеанс фільму в конкретний день,
//        який задається параметром String).

import java.util.*;

public class Cinema {
    private TreeMap<Days, Schedule> scheduleTreeMap;
    private Time timeOpen;
    private Time timeClose;

    public Cinema(Time timeOpen, Time timeClose, TreeMap<Days, Schedule> scheduleTreeMap) {

        this.timeOpen = timeOpen;
        this.timeClose = timeClose;

        this.scheduleTreeMap = scheduleTreeMapValidator(scheduleTreeMap);
    }

    public TreeMap<Days, Schedule> getScheduleTreeMap() {
        return scheduleTreeMap;
    }

    public void setScheduleTreeMap(TreeMap<Days, Schedule> map) {
        this.scheduleTreeMap = map;
    }

    public Time getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(Time timeOpen) {
        this.timeOpen = timeOpen;
    }

    public Time getTimeClose() {
        return timeClose;
    }

    public void setTimeClose(Time timeClose) {
        this.timeClose = timeClose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(scheduleTreeMap, cinema.scheduleTreeMap) &&
                Objects.equals(timeOpen, cinema.timeOpen) &&
                Objects.equals(timeClose, cinema.timeClose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleTreeMap, timeOpen, timeClose);
    }

    @Override
    public String toString() {

        return "--------------------\n CINEMA TimeOpen=" + timeOpen + ", TimeClose=" + timeClose +
                " \n Seance schedule :" + scheduleTreeMap+ "\n--------------------";
    }

    public void addSeance(String day, Seance... seances) {
        try {
            Days[] values = Days.values();
            Days choosenDay = null;
            for (Days value : values) {
                if (value.name().equals(day)) {
                    choosenDay = value;
                }
            }
            Schedule schedule = scheduleTreeMap.get(choosenDay);
            for (Seance seance : seances) {
                if (this.validateSeances(seance)) {
                    schedule.addSeance(seance);
                }
            }
        } catch (Exception e) {
            System.out.println("Unable to add seance. Invalid DAY");
        }
    }

    public void removeMovie(Movie movie) {
        Set<Map.Entry<Days, Schedule>> entrySet = scheduleTreeMap.entrySet();
        Iterator<Map.Entry<Days, Schedule>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Days, Schedule> next = iterator.next();
            Schedule schedule = next.getValue();
            TreeSet<Seance> seances = schedule.getSeances();
            Iterator<Seance> seanceIterator = seances.iterator();
            while (seanceIterator.hasNext()) {
                Seance seance = seanceIterator.next();
                if (seance.getMovie().equals(movie)) {
                    seanceIterator.remove();
                    System.out.println("Deleted " + movie);
                }
            }
        }
    }

    public void removeMovieByTitle(String movie) {
        Set<Map.Entry<Days, Schedule>> entrySet = scheduleTreeMap.entrySet();
        Iterator<Map.Entry<Days, Schedule>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Days, Schedule> next = iterator.next();
            Schedule schedule = next.getValue();
            TreeSet<Seance> seances = schedule.getSeances();
            Iterator<Seance> seanceIterator = seances.iterator();
            while (seanceIterator.hasNext()) {
                Seance seance = seanceIterator.next();
                if (seance.getMovie().getTitle().equals(movie)) {
                    seanceIterator.remove();
                    System.out.println("Deleted " + movie);
                }
            }
        }
    }

    public void removeSeance(Seance seance, Days day) {
        Set<Map.Entry<Days, Schedule>> entrySet = scheduleTreeMap.entrySet();
        for (Map.Entry<Days, Schedule> entry : entrySet) {
            if (entry.getKey().equals(day)) {
                entry.getValue().removeSeance(seance);
                System.out.println("REMOVED from " + day + seance);
            }
        }
    }

    public TreeMap<Days, Schedule> scheduleTreeMapValidator(TreeMap<Days, Schedule> scheduleTreeMap) {
        Set<Map.Entry<Days, Schedule>> entries = scheduleTreeMap.entrySet();
        for (Map.Entry<Days, Schedule> entry : entries) {
            TreeSet<Seance> seances = entry.getValue().getSeances();

            try {
                for (Seance seance : seances) {
                    if (!this.validateSeances(seance)) {
                        seances.remove(seance);
                        System.out.println("Seance time NOT VALID" + seance);
                    } else {
                        System.out.println("Seance added \n--------------------");
                    }
                }
            } catch (Exception e){
                System.out.println("Seance NOT added \n--------------------");
            }
        }
        return scheduleTreeMap;
    }

    public boolean validateSeances(Seance seance) {
        boolean valid = true;
            if (seance.getStartTime().getHour() > timeOpen.getHour()
                    || seance.getStartTime().getHour() == timeOpen.getHour()
                    && seance.getStartTime().getMin() > timeOpen.getMin()
            ) {
                System.out.println("Seance start time OK!");
            } else {
                valid = false;
                System.out.println("ERROR seance start time! "+ seance.getMovie()+"NOT added");
            }

            if (seance.getEndTime().getHour() < timeClose.getHour()
                    || seance.getEndTime().getHour() == timeClose.getHour()
                    && seance.getEndTime().getMin() < timeClose.getMin()
            ) {
                System.out.println("Seance end time OK!");
            } else {
                valid = false;
                System.out.println("ERROR seance end time! "+ seance.getMovie()+" NOT added");
            }
        return valid;
    }
}

