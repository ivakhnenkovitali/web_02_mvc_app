package by.tasksLaba.алгоритмы;

public class Main_2 {
    public static void main(String[] args) {
        // есть строка проверить ваидна она или нет
        // "(((())))" - валидна
        // "()()()" - валидна
        // "(()" - не валидна
        // ")(" - не валидна
        System.out.println(checkString("(((())))"));
        System.out.println(checkString("()()()"));
        System.out.println(checkString("(()"));
        System.out.println(checkString(")("));

    }

    public static boolean checkString(String str) {
        if (str.startsWith(")")) return false;
        char[] str1 = str.toCharArray();
        int open = 0;
        int close = 0;

        for (char ch : str1) {
            if (ch == '(') {
                open += 1;
            }
            if (ch == ')') {
                close += 1;
            }
        }
        if (open==close){
            return true;
        }
        return false;
    }
}
