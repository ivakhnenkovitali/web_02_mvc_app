package by.tasksLaba.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_2 {
    public static void main(String[] args) {
        // сгрупировать данные в map, где ключ - длинна строки, значение - СПИСОК строк такой длинны
        List<String> strings = List.of("string", "apple", "banane", "cat", "dog", "Java",
                "hello", "world", "car", "home");

        Map<Integer, List<String>> map = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        //метод `String::length`, который определяет, как будет извлекаться ключ для каждой строки.
        // В вашем случае ключ — это длина строки, которая возвращается методом `length()`.
        //groupingBy` собирает элементы потока
        //Вычисляют ключ с помощью предоставленного вами метода (длину строки).
        //- Если ключ уже существует в мапе, он добавляет текущую строку в список по этому ключу.
        //- Если ключа еще нет, он создает новую запись в мапе с ключом и списком, содержащим текущую строку.

        //=>{3=[cat, dog, car], 4=[Java, home], 5=[apple, hello, world], 6=[string, banane]}
        System.out.println(map);
//`groupingBy` удобно использовать, когда нужно собирать данные в `Map` по какому-либо критерию.
//- Метод `collect` - это терминальная операция, которая завершает работу со стримом и
// предоставляет готовый результат (в данном случае `Map`).


        // сгруппировать данные в map, где ключ - длинна строки, значение КОЛИЧЕСТВО строк с такой длинной
        List<String> strings1 = List.of("string", "apple", "banane", "cat", "dog", "Java",
                "hello", "world", "car", "home");
        Map<Integer, Long> map1 = strings1.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map1);
        // =>{3=3, 4=2, 5=3, 6=2}



        // что выведет?
        List<Integer> list = List.of(1, 2, 3, 4);
        list.stream()
                .filter(i -> i % 2 == 0)
                .peek(System.out::println);
        // ничего , т. к. нет тернального метода

    }
}
