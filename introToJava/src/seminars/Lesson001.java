package seminars;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Lesson001 {
    public static void main(String[] args) {
        //compiler reads instructions from top to bottom

        //static - keeps all vars and methods which knows ur compiler/interpreter before the launching program
        //init before program starts
        //bsp: link of calling static main is in static memory

        //stack - compiler has access only to the first el in stack, and it's fast
        //stores all methods' calls, all primitive vars and addresses/links of reference data type

        //heap - stores all complex obj

        //compiler goes to the stack -> takes necessary address of an obj -> goes to the heap by that address


        //Настроить проект, вывести в консоль “Hello world!”.
        //Вывести в консоль системные дату и время.
        //System.out.println("Hello World\n" + LocalDateTime.now());

        //В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
        //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
        //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
        //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        // "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Dein Vorname ist: ");
//        String name = sc.nextLine();
//        LocalTime localTime = LocalTime.now();
//        if (localTime.isAfter(LocalTime.of(5, 0)) && localTime.isBefore(LocalTime.of(11, 59)))
//            System.out.printf("Guten Morgen, %s!", name);
//        else if (localTime.isAfter(LocalTime.of(12, 0)) && localTime.isBefore(LocalTime.of(17, 59)))
//            System.out.printf("Guten Tag, %s!", name);
//        else if (localTime.isBefore(LocalTime.of(18, 0)) && localTime.isAfter(LocalTime.of(22, 59)))
//            System.out.printf("Guten Abend %s!", name);
//        else
//            System.out.printf("Gute Nacht, %s!", name);
//        sc.close();
//
//         while (true) {
//            live();
//         }

        //Задание №2
        //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
        //максимальное количество подряд идущих 1.
        int[] arr = {1,1,0,1,1,1};
        //int[] arr = new int[]{1,1,0,1,1,1};
        //int[] arr = new int[5];
        //arr[2] = 10;
        System.out.println("Sum of elements in array: " + Arrays.stream(arr).sum());
        int count = 0;
        for (int num : arr){
            if (num == 1) count++;
            else count = 0;
        }
        System.out.println("The maximum number of consecutive runs 1: " + count);


        //Задание №5 (доп)
        //Во фразе "Добро пожаловать на курс по Java" переставить слова
        //в обратном порядке.
        String str = "Добро пожаловать на курс по Java";
        String[] array = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            String temp = array[i];
            sb.append(temp).append(" ");
        }
        System.out.println(sb);
    }


    public static void live() {
        System.out.println("Сколько вам лет?");
        Scanner scanner = new Scanner(System.in);
        int age;
        try {
            age = scanner.nextInt();
            if (age < 10) {
                System.out.println("Вот вам конфетка :) ");
            } else if (age < 18) {
                System.out.println("Вот вам книга! ");
            } else if (age < 70) {
                System.out.println("Вот вам очки! ");
            } else {
                System.out.println("Вы прожили долгую жизнь... ");
            }

        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число,пргорамма закрывается!");
            System.exit(0);
        }
    }
}
