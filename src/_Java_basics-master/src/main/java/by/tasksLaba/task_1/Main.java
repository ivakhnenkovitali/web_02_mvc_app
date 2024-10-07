package by.tasksLaba.task_1;

public class Main {
    public static void main(String[] args) {
        new B();

        // вызываем конструктор B а он вызовет А
        //в конструкторе А вызоветля метод из В
        // попросит вывести длинну строки, но переменная еще не проиницализировалась
        // => NullPointerException
    }
}
