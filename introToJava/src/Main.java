import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Dein Vorname ist: ");
        String name = sc.nextLine();
        LocalTime localTime = LocalTime.now();
        if (localTime.isAfter(LocalTime.of(5, 0)) && localTime.isBefore(LocalTime.of(11, 59)))
            System.out.printf("Guten Morgen, %s!", name);
        else if (localTime.isAfter(LocalTime.of(12, 0)) && localTime.isBefore(LocalTime.of(17, 59)))
            System.out.printf("Guten Tag, %s!", name);
        else
            System.out.printf("Gute Nacht, %s!", name);
        sc.close();

         while (true) {
            live();
         }

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
