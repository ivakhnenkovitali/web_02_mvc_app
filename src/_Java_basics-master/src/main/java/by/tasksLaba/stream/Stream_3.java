package by.tasksLaba.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Stream_3 {
    public static void main(String[] args) {
        //преобразуйте список строк в одну строку через запятую
        // при этом сначала отсортируйте по длинне, остальное уникальные
        List<String> words = Arrays.asList("осень", "лето","зима", "весна","лето");
        String str = words.stream()
                .distinct()
                .sorted((a,b) ->Integer.compare(a.length(),b.length()))
                .collect(Collectors.joining(", "));
        System.out.println(str);

    }
}
