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
}
