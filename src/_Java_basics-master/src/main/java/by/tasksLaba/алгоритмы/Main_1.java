package by.tasksLaba.алгоритмы;

public class Main_1 {
    public static void main(String[] args) {
        // как проверить есть ли там уникалые элементы

        int[] nums = {1, 5, 7, 0, 7, 9};

    }

    public static boolean containsDuplicat(int[] nums) {
        return true;
    }
}
// через  if сравнить элементы
// через for
// использоваьколлекцию set, и затем проверить размер если он изменился значит были дубликаты

 //  Arrays.stream(nums).distinct().forEach(System.out::println);