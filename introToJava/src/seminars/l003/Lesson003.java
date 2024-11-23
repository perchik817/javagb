package seminars.l003;

import java.util.*;

public class Lesson003 {

    static List<ArrayList<String>> books = new ArrayList<>();
    public static void main(String[] args) {

        ArrayList<String> proza = new ArrayList<>();
        proza.addAll(List.of("proza", "war and piece", "buratino"));
        ArrayList<String> poezia = new ArrayList<>();
        poezia.addAll(List.of("poezia", "baradino", "evgeniy onegin"));
        ArrayList<String> fairytale = new ArrayList<>();
        fairytale.addAll(List.of("fairytale", "masha and bear", "red head"));
        books.addAll(List.of(proza, poezia, fairytale));
        System.out.println(books);

        //this list contains any type ob object bcs there is no <>
        //all in java is object
        /*List list = new ArrayList();
        list.add("string");
        list.add(888);
        list.add(88.7f);
        list.add('c');
        System.out.println(list);*/
        //если складываются символы в строки, то при запуске компилятор видит это и не будет создавать ячейки памяти для
        // каждого символа, а обращается к стрингбилдеру и под капотом соединяет их, а после складывает в стринг
        //при вызове метода of() у List создается иммутабельная коллекция => неизменяемая
        //не сработает
//        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println(integers);
        //integers.remove(3);

        /*List<Integer> integers = new ArrayList<>();
        integers.addAll(List.of(1,2,3,4));
        System.out.println(integers);
        integers.remove(2);
        System.out.println(integers);*/


        //Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
        Random rand = new Random();
        /*List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(22,100));
        }
        Collections.sort(list);
        System.out.println(list);*/
        //use err to print errors
        //System.err.println(list.get(11));


        //Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
        //Пройти по списку, найти и удалить целые числа.
        //внутри класса создается массив в 2р больше начального и все эл из старого скопируются в новый, а старый массив
        // удаляется
        //ссылка хранится в куче, а объект - в стэке
        /*ArrayList strings = new ArrayList<String>();
        strings.add("hello");
        strings.add("world");
        strings.add(23);
        strings.add(113);
        strings.add(3);
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i) instanceof Integer){
                strings.remove(i);
                i--;
            }
        }*/
        /*for (int i = 0; i < strings.size(); i++) {
            try{
                Integer.parseInt(strings.get(i));
                strings.remove(i);
                i--;
            } catch (NumberFormatException e){
                continue;
            }
        }*/

        /*Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            try {
                Integer.parseInt(element); // Проверяем, является ли элемент числом
                iterator.remove(); // Удаляем элемент безопасно через итератор
            } catch (NumberFormatException e) {
                // Игнорируем исключение, если элемент не является числом
            }
        }*/
        //System.out.println(strings);
    }
}
