package lesson4;

//Даний проект має такі сутності: Days, Time, Movie, Seance, Schedule, Cinema.
//enum Days:
//        - прописати дні тижня;
//        Time:
//        - int min, int hour;
//        - передбачити межі для цих полів (для min 0..59, для hour 0..23);
//        Movie:
//        - String title, Time duration;
//        Seance:
//        - Movie movie, Time startTime, Time endTime;
//        - в конструктор має надходити параметрами значення для перших двох полів,
//        третє поле повинне обчислюватись (start + duration);
//        Schedule:
//        - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
//        - Сортування по startTime.
//        - методи: addSeance (Seance), removeSeance (Seance);
//        Cinema:
//        - TreeMap<Days, Schedule>, Time open, Time close;
//        - врахувати час відкриття і закриття при формуванні сеансів!
//        - методи: addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день),
//        addSeance (Seance, String) (додає один сеанс в конкретний день),
//        removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу),
//        removeSeance (Seance, String) (видаляє конкретний сеанс фільму в конкретний день,
//        який задається параметром String).
//
//
//        Main class:
//        - створення об'єкту Cinema;
//        - викликаємо всі методи Cinema
//
//        Для кожного класу зробити адекватний toString, щоб все було читабельно і доступно.
//        Там де потрібно, зробити compareTo(). Маєте якісь власні ідеї для розробки - будь-ласка.
//        Це моделювання роботи кінотеатру, тому все що наблизить програму до реальності вітається.

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Movie gentlemen = new Movie("The Gentlemen", new Time(1, 45));
        Movie titanic = new Movie("Titanic", new Time(1, 45));
        Movie americanPie = new Movie("American Pie", new Time(1, 55));

        Seance gentelmenSeance = new Seance(gentlemen, new Time(10, 15));
        Seance titanicSeance = new Seance(titanic, new Time(11, 25));
        Seance americanPieSeance = new Seance(americanPie, new Time(19, 35));

        Schedule sundaySchedule = new Schedule();
        sundaySchedule.addSeance(gentelmenSeance);
        sundaySchedule.addSeance(titanicSeance);

        Schedule mondaySchedule = new Schedule();
        mondaySchedule.addSeance(gentelmenSeance);
        mondaySchedule.addSeance(americanPieSeance);

        TreeMap<Days, Schedule> daysSchedule = new TreeMap<>();
        daysSchedule.put(Days.Sunday, sundaySchedule);
        daysSchedule.put(Days.Monday, mondaySchedule);


        Cinema myCinema = new Cinema(new Time(10, 00), new Time(21, 00), daysSchedule);

        System.out.println(myCinema.toString());

        myCinema.addSeance("Sunday", new Seance(gentlemen, new Time(13,00)));
        myCinema.addSeance("Sunday", new Seance(americanPie, new Time(20,00)));
        myCinema.addSeance("Monday", new Seance(americanPie, new Time(11,00)));

//        myCinema.removeMovieByTitle("Titanic");
//        myCinema.removeMovie(gentlemen);

//        myCinema.removeSeance(gentelmenSeance, Days.Sunday);

        System.out.println(myCinema.toString());

    }
}
