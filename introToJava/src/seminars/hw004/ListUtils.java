package seminars.hw004;
//Задача 3. Количество вхождений слова
//Реализуйте метод countOccurrences в классе ListUtils, который
//принимает LinkedList<String> и строку, и возвращает количество
//вхождений строки в список.

import java.util.LinkedList;

public class ListUtils {
    public static int countOccurrences(LinkedList<String> list, String value) {
        int count = (int) list.stream().filter(s -> s.equals(value)).count();
        return count;
    }
}
