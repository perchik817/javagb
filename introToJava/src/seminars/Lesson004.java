package seminars;

import java.util.*;

public class Lesson004 {
    // List - это интерфейс, некая абстракция, у к-ой есть несколько реализаций, но часто используемы - Array-, LinkedList
    //к примеру вставка элемента в массив при вставке в Arraylist элемента, компилятор создает массив длиной
    // количеством тех элементов + 1, которые предшествуют индексу вставки, копирует из старого элементы, вставляет
    // нужный элемент и копирует оставшуюся часть старого при этом копируемый массив удаляет.
    // но данная операция РЕСУРСОЗАТРАТНАЯ => очень долго увеличивается массив, а также вставка/удаление элемента в
    // середине происходит дольше НО быстрая вставка/удаление элемента в конце массива + поиск эл по индексу, зная,
    // какие элементы хранятся в массиве (к примеру, Integer => 32 бита * длина массива), компилятор примерно понимает,
    // какой элемент хранится в памяти под определенным индексом скорость о(1)
    // в отличие от массива, к-ый хранится в памяти одним куском, неизвестно в какой части памяти расположены элементы
    // (Nodes) у связанного списка => неизвестен адрес, поиск по связанному списку происходит очень долго o(w)
    // а также + связанного списка в том, что после добавления эл размер списка не увеличивается как при arraylist
    // эффективно работает вставка/удаление элементов в середину массива по ссылке - ЭКОНОМИЯ ПАМЯТИ
    // у ArrayList под капотом массив, а у LinkedList - связанные между собой элементы по ссылкам (на соседние элементы)
    //Stack - такой тип данных, в котором первый элемент оказывается последним при обращении к данному массиву - LIFO
    // к примеру, есть l = {1, 2, 3, 4, 5}, нужно его развернуть. в таком случае можно использовать Stack, в который
    // кладутся элементы 1, 2, 3, 4, 5, а на при чтении массива получим 5, 4, 3, 2, 1 - разворот структур данных

    //В ПРОГРАММИРОВАНИИ ЧТОБЫ ЧТО-ТО ПОЛУЧИТЬ, НУЖНО ЧЕМ-ТО ПОЖЕРТВОВАТЬ


    private static int LENGTH = 1_000_000;

    public static void getTime(List<Integer> list){

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < LENGTH; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time of adding elements into list: " + totalTime + " ms");

        int count = 0;
        long startTime2 = System.currentTimeMillis();
        Random rand = new Random();
        while (count <= 1000) {
            list.add(40000 + rand.nextInt(10));
            count += 2;
        }
        long endTime2 = System.currentTimeMillis();
        long totalTime2 = endTime2 - startTime2;
        System.out.printf("Total time of adding elements in the middle of the list: %s %s %n", totalTime2," ms");
    }

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList();
        //т.к. добавление элементов идет в конец списка, то времени уходит больше на поиск адреса последнего элемента
        //в arraylist этот процесс проходит быстрее, т.к. компилятор знает адрес последнего элемента в памяти
        System.out.println("ArrayList");
        getTime(arrList);
        System.out.println("LinkedList");
        getTime(linkedList);

    }
}
