package by.tasksLaba.task_2;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child);

        // первыми вызываются static блок
        // обычный блок
        // конструктор Child(), который вызовет конструктор родителя
        // затем сработает конструктор Child()
        // => 3 1 2 4


    }
}
