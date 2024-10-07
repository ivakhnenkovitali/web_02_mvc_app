package by.tasksLaba.сравнение;

public class Main {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1.equals(obj2));   // false OBJECT cравнивает по ссылкам !!!!!!!!!
        System.out.println(obj1==obj2);          // false

        String str1 = new String("String");
        String str2 = new String("String");

        System.out.println(str1.equals(str2));   // true  equals переопределен  в string
        System.out.println(str1==str2);          // false

        String str3 = "String";
        String str4 = "String";

        System.out.println(str3.equals(str4));     // true
        System.out.println(str3==str4);            // true

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        System.out.println(i1.equals(i2));         // true
        System.out.println(i1==i2);                // false

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println(i3.equals(i4));          // true
        System.out.println(i3==i4);                // false  до 127  (127 - true)
    }
}
