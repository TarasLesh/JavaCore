package lesson5;

//- создать массив с 20 числами.
//        -- при помощи метода sort и колбека  отсортировать массив.
//        -- при помощи метода sort и колбека отсортировать массив в ниспадающем напралении.
//        -- при помощи filter получить числа кратные 3
//        -- при помощи filter получить числа кратные 10
//        -- перебрать (проитерировать) массив при помощи foreach()
//        -- перебрать массив при помощи map() и получить новый массив в котором все значения будут в 3 раза больше
//
//        - создать массив со словами на 15-20 элементов.
//        -- отсортировать его по алфавиту в восходящем порядке.
//        -- отсортировать его по алфавиту  в нисходящем порядке.
//        -- отфильтровать слова длиной менее 4х символов
//        -- перебрать массив при помощи map() и получить новый массив в котором все значения будут со знаком "!" в конце
//
//        Все робити через функції масивів (foreach, map ...тд)
//        Дан масив :
//        let users = [ {name: 'vasya', age: 31, status: false}, {name: 'petya', age: 30, status: true}, {name: 'kolya', age: 29, status: true}, {name: 'olya', age: 28, status: false}, {name: 'max', age: 30, status: true}, {name: 'anya', age: 31, status: false}, {name: 'oleg', age: 28, status: false}, {name: 'andrey', age: 29, status: true}, {name: 'masha', age: 30, status: true}, {name: 'olya', age: 31, status: false}, {name: 'max', age: 31, status: true} ];
//        - відсортувати його за  віком (зростання , а потім окремо спадання)
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//        - пройтись по ньому та додати кожному юзеру поле id - яке характеризує унікальний індентифікатор (По якому принципу його створювати - ваше рішення), та зберегти це в новий масив (первинний масив залишиться без змін)
//        - відсортувати його за індентифікатором
//
//
//        -- наисать функцию калькулятора с 2мя числами и колбеком
//        -- наисать функцию калькулятора с 3мя числами и колбеком
//
//        =============================================
//        =============================================
//        =============КЛАССНАЯ РАБОТА=================
//        =============================================
//        =============================================
//
//
//
//
//        let cars = [ {producer:"subaru",model: "wrx",year: 2010, color:"blue",type: "sedan",engine: "ej204x",volume: 2,power: 400}, {producer:"subaru",model: "legacy",year: 2007, color:"silver",type: "sedan",engine: "ez30",volume: 3,power: 250}, {producer:"subaru",model: "tribeca",year: 2011, color:"white",type: "jeep",engine: "ej20",volume: 2,power: 300}, {producer:"subaru",model: "leone",year: 1998, color:"yellow",type: "sedan",engine: "ez20x",volume: 2,power: 140}, {producer:"subaru",model: "impreza",year: 2014, color:"red",type: "sedan",engine: "ej204x",volume: 2,power: 200}, {producer:"subaru",model: "outback",year: 2014, color:"red",type: "hachback",engine: "ej204",volume: 2,power: 165}, {producer:"bmw",model: "115",year: 2013, color:"red",type: "hachback",engine: "f15",volume: 1.5,power: 120}, {producer:"bmw",model: "315",year: 2010, color:"white",type: "sedan",engine: "f15",volume: 1.5, power: 120}, {producer:"bmw",model: "650",year: 2009, color:"black",type: "coupe",engine: "f60",volume: 6,power: 350}, {producer:"bmw",model: "320",year: 2012, color:"red",type: "sedan",engine: "f20",volume: 2,power: 180}, {producer:"mercedes",model: "e200",year: 1990, color:"silver",type: "sedan",engine: "eng200",volume: 2,power: 180}, {producer:"mercedes",model: "e63",year 2017, color:"yellow",type: "sedan",engine: "amg63",volume:3,power: 400}, {producer:"mercedes",model: "c250",year: 2017, color:"red",type: "sedan",engine: "eng25",volume: 2.5,power: 230} ];
//        Відфільтрувати масив за наступними крітеріями :
//        - двигун більше 3х літрів
//        - двигун = 2л
//        - виробник мерс
//        - двигун більше 3х літрів + виробник мерседес
//        - двигун більше 3х літрів + виробник субару
//        - сили більше ніж 300
//        - сили більше ніж 300 + виробник субару
//        - мотор серіі ej
//        - сили більше ніж 300 + виробник субару + мотор серіі ej
//        - двигун меньше 3х літрів + виробник мерседес
//        - двигун більше 2л + сили більше 250
//        - сили більше 250  + виробник бмв
//
//
//
//        - взять слдующий массив
//        let usersWithAddress = [{id: 1, name: 'vasya', age: 31, status: false, address: {city: 'Lviv', street: 'Shevchenko', number: 16}}, {id: 2, name: 'petya', age: 30, status: true, address: {city: 'Lviv', street: 'Shevchenko', number: 1}}, {id: 3, name: 'kolya', age: 29, status: true, address: {city: 'Lviv', street: 'Shevchenko', number: 121}}, {id: 4, name: 'olya', age: 28, status: false, address: {city: 'Lviv', street: 'Shevchenko', number: 90}}, {id: 5, name: 'max', age: 30, status: true, address: {city: 'Lviv', street: 'Shevchenko', number: 115}}, {id: 6, name: 'anya', age: 31, status: false, address: {city: 'Lviv', street: 'Shevchenko', number: 2}}, {id: 7, name: 'oleg', age: 28, status: false, address: {city: 'Lviv', street: 'Shevchenko', number: 22}}, {id: 8, name: 'andrey', age: 29, status: true, address: {city: 'Lviv', street: 'Shevchenko', number: 43}}, {id: 9, name: 'masha', age: 30, status: true, address: {city: 'Lviv', street: 'Shevchenko', number: 12}}, {id: 10, name: 'olya', age: 31, status: false, address: {city: 'Lviv', street: 'Shevchenko', number: 16}}, {id: 11, name: 'max', age: 31, status: true, address: {city: 'Lviv', street: 'Shevchenko', number: 121}}];
//        -- отсортировать его по id пользователей
//        -- отсортировать его по id пользователей в обратном опрядке
//        -- отсортировать его по возрасту пользователей
//        -- отсортировать его по возрасту пользователей в обратном порядке
//        -- отсортировать его по имени пользователей
//        -- отсортировать его по имени пользователей в обратном порядке
//        -- отсортировать его по названию улицы  в алфавитном порядке
//        -- отсортировать его по номеру дома по возрастанию
//        -- отфильтровать (оставить) тех кто младше 30
//        -- отфильтровать (оставить) тех у кого отрицательный статус
//        -- отфильтровать (оставить) тех у кого отрицательный статус и младше 30 лет
//        -- отфильтровать (оставить) тех у кого номер дома четный
//
//
//        ===========================
//        ======ДОПОЛНИТЕЛЬНО========
//        ===========================
//
//        Створити обєкт автомобіля з полями:
//        Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//        Власник автомобіля теж має бути обєкт, у якого є поля
//        Імя, вік, стаж водіння.
//        Створити не менше 7 та не більше 20 машинок.
//        Зробили половину автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
//        На відремонтовані автомобілі найняти нових водіїв (переприсвоїти змінну водій).
//        Для початку вкладіть всі наші створені автомобілі в масив cars.
//        Далі необхідно рати кожну другу машинку (цикл з кроком в 2), та робити їй підвищення потужності двигуна на 10% та ціну на 5%
//        Після того зробити перевірку досвіду ВСІХ наших водіїв. Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//        Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто в циклі
//

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        -- при помощи метода sort и колбека  отсортировать массив.
//        -- при помощи метода sort и колбека отсортировать массив в ниспадающем напралении.
//        -- при помощи filter получить числа кратные 3
//        -- при помощи filter получить числа кратные 10
//        -- перебрать (проитерировать) массив при помощи foreach()
//        -- перебрать массив при помощи map() и получить новый массив в котором все значения будут в 3 раза больше


//        1
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> integerList = arrayList
                .stream()
                .sorted(((o1, o2) -> o1 - o2))
                .collect(Collectors.toList());

//        2
        List<Integer> integerListDown = arrayList
                .stream()
                .sorted(((o1, o2) -> o2 - o1))
                .collect(Collectors.toList());
//        3
        List<Integer> integerList3 = arrayList
                .stream()
                .filter(integer -> integer % 3 == 0)
                .collect(Collectors.toList());

//        4
        List<Integer> integerList4 = arrayList
                .stream()
                .filter(integer -> integer % 10 == 0)
                .collect(Collectors.toList());

//        5
        integerList4.forEach(integer -> System.out.println(integer));

//        6
        List<Integer> integerList6 = arrayList
                .stream()
                .map(integer -> integer * 3)
                .collect(Collectors.toList());

//        - создать массив со словами на 15-20 элементов.
//        -- отсортировать его по алфавиту в восходящем порядке.
//        -- отсортировать его по алфавиту  в нисходящем порядке.
//        -- отфильтровать слова длиной менее 4х символов
//        -- перебрать массив при помощи map() и получить новый массив в котором все значения будут со знаком "!" в конце

        ArrayList<String> stringArrayList = new ArrayList<>();

//        1
        Stream<String> stringStream = stringArrayList
                .stream()
//                .sorted((o1, o2) -> o1.compareTo(o2));
                .sorted(Comparator.naturalOrder());

//        2
        Stream<String> stringStream1 = stringArrayList
                .stream()
//                .sorted((o1, o2) -> o2.compareTo(o1));
                .sorted(Comparator.reverseOrder());

//        3
        Stream<String> stringStream2 = stringArrayList
                .stream()
                .filter(s -> s.length() > 4);

//        4
        List<String> stringList = stringArrayList
                .stream()
                .map(s -> s + "!").collect(Collectors.toList());

//        Все робити через функції масивів (foreach, map ...тд)
//        Дан масив :
//        let users = [ {name: 'vasya', age: 31, status: false}, {name: 'petya', age: 30, status: true}, {name: 'kolya', age: 29, status: true}, {name: 'olya', age: 28, status: false}, {name: 'max', age: 30, status: true}, {name: 'anya', age: 31, status: false}, {name: 'oleg', age: 28, status: false}, {name: 'andrey', age: 29, status: true}, {name: 'masha', age: 30, status: true}, {name: 'olya', age: 31, status: false}, {name: 'max', age: 31, status: true} ];
//        - відсортувати його за  віком (зростання , а потім окремо спадання)
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//        - пройтись по ньому та додати кожному юзеру поле id - яке характеризує унікальний індентифікатор (По якому принципу його створювати - ваше рішення), та зберегти це в новий масив (первинний масив залишиться без змін)
//        - відсортувати його за індентифікатором

        ArrayList<User> users = new ArrayList<>();

//        1
        List<User> sorted = users
                .stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
//        users.stream().sorted((o1, o2) -> o2.getAge() - o1.getAge());

//        2
        List<User> collect = users
                .stream()
                .sorted(Comparator.comparingInt(o -> o.getName().length()))
//                .sorted((o1, o2) -> o2.getName().length() - o1.getName().length())
                .collect(Collectors.toList());

//        3
        List<User> userList = users
                .stream()
                .map(user -> {
                    user.setId(new Random().nextInt(100500));
                    return user;
                }).collect(Collectors.toList());

//        4
        List<User> collect1 = userList
                .stream()
//                .sorted((o1, o2) -> o1.getId() - o2.getId())
                .sorted(Comparator.comparingInt(User::getId))
                .collect(Collectors.toList());


    }
}
