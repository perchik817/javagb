package seminars.hw004;

//Задание 1. Удаление нечетных строк
//Дан LinkedList с несколькими элементами. В методе
//removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
//которых нечетная. Используйте LinkedList и стандартные методы.

import java.util.LinkedList;

public class DelOddStr {

    public static void removeOddLengthStrings(LinkedList<String> ll) {
        //ll.removeIf(s -> s.length() % 2 == 1);
        LinkedList<String> toRemove = new LinkedList<>();
        for (String s : ll) {
            if (s.length() % 2 != 0) {
                toRemove.add(s);
            }
        }
        ll.removeAll(toRemove);
    }
    public static void main(String[] args) {
        DelOddStr task1 = new DelOddStr();
        LinkedList<String> ll = new LinkedList<>();
        ll.add("apple");
        ll.add("banana");
        ll.add("pear");
        ll.add("grape");
        System.out.println(ll);
        task1.removeOddLengthStrings(ll);
        System.out.println(ll);

    }
}
