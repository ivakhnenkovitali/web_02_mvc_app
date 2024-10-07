package by.tasksLaba.stream.bigTask;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        People people1 = new People(1, "Том");
        people1.addFlat(new Flat(1, "123 Ооодлодл", 75.0, 250000));
        people1.addFlat(new Flat(2, "345 Тошсвд", 60.0, 160000));

        People people2 = new People(2, "Тим");
        people2.addFlat(new Flat(3, "678 Лллл", 85.0, 200000));
        people2.addFlat(new Flat(4, "910 Олглгг", 95.0, 300000));

        People people3 = new People(3, "Катя");
        people3.addFlat(new Flat(1, "112 Орлол", 100.0, 253000));
        people3.addFlat(new Flat(2, "132 Кпоррл", 60.0, 150000));

        List<People> people = List.of(people1, people2, people3);

        // Найти все квартиры площадь которых больше 80
        people.stream()
                .flatMap(p -> p.getFlats().stream())// зайди в людей и возми там все квартиры
                .filter(f -> f.getArea() > 80)
                //.collect(toList());
                .toList();

        // Найди всех людей у которых есть квартиры по адрессу 910 Олглгг
        people.stream()
                .filter(p -> p.getFlats().stream()
                        .anyMatch(f -> f.getAddress().equals("910 Олглгг")))
                .toList();

        // Получить список всех адрессов квартир
        people.stream()
                .flatMap(f -> f.getFlats().stream())
                .map(a -> a.getAddress())
                .distinct()
                .toList();

        // Найти общую площадь всех квартир для каждого человека
        // ключ - человек, значение - кол-во кв метров
        Map<String, Double> map =people.stream()
                // из листа делаем map
                .collect(Collectors.toMap(k->k.getName(), v->v.getFlats().stream()
                        .mapToDouble(ar -> ar.getArea()).sum())); // или reduce

        //Найти самую догорую квартиру из  всех
        Flat flat = people.stream()
                // из листа реrsona спустились до квартир
                .flatMap(p->p.getFlats().stream())
                // max возвращает optional
                        .max(Comparator.comparingDouble(Flat::getPrice))
                // когда берем get там может быть null.
                //поэтому делаем проверку используя orElse
                        .orElse(null);
        // orElse сработает если будет null в квартире и вернет просто null (не из квартиры)
        // это для того чтобы не выпала ошибка


        // Получить площади квартир отсортированных в порядке убывания
        List<Flat> flatSort = people.stream()
                .flatMap(f->f.getFlats().stream())
                //comparingDouble потомучто площадь это double
                .sorted(Comparator.comparingDouble(Flat::getArea).reversed())
                .toList();

    }
}
