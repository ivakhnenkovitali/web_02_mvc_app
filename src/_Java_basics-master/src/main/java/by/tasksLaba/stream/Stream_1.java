package by.tasksLaba.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Москва", "Архангельск", "Астрахань", "Минск", "Антверпень");
        //получить список городов начинающихся на А в Uppercase, отсортированными
        List<String> listRes = list.stream()
                .filter(s -> s.startsWith("А")) //фильтруем
                .map(String::toUpperCase)       // переводим в вверхний регистр
                .sorted()                         // сортируем
                .collect(Collectors.toList());    //собирает элементы вашего стрима в список

        System.out.println(listRes);

        // =>[АНТВЕРПЕНЬ, АРХАНГЕЛЬСК, АСТРАХАНЬ]

        //collect - преобразования элементов потока в другую коллекцию,
        // Это терминальная операция
        // нужно создать список и добавить в него элементы.
        // возращает список

    }

}
