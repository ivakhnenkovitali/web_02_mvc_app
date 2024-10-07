package by.tasksLaba.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class KS {
    public static void main(String[] args) {
        List<String> list = List.of("f", "z", "y", "k", "t", "r", "s", "a");
        System.out.println(makeKsFirstAndSort(list));
        System.out.println(makeKsFirstAndSort1(list));
    }

    // преобразовать входной список так,
    // чтобы первым вывелся символы k s а потом в отсортированном виде
    public static List<String> makeKsFirstAndSort(List<String> list) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (String s : list) {
            if (s.equals("k") || s.equals("s")) {
                list1.add(s);
            } else {
                list2.add(s);
            }
        }
       // Collections.sort(list2);
        sort(list2);
        list1.addAll(list2);
        return list1;
    }

    // делим лист на два листа
    // в одном будет k и s
    // в другом остальные
    // объединяем
    //[k, s, a, f, r, t, y, z]


    public static List<String> makeKsFirstAndSort1(List<String> list) {
        List<String> ksFirst = list.stream()
                .filter(s -> s.equals("k") || s.equals("s"))
                .collect(Collectors.toList());//????????????????

        List<String> sortedRest = list.stream()
                .filter(s -> !s.equals("k") && !s.equals("s"))
                .sorted()
                .collect(Collectors.toList());

        ksFirst.addAll(sortedRest);
        return ksFirst;
    }
}
