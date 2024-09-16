package seminars;

import java.util.Scanner;

public class Hw001 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        /*Задание 1. Нахождение факториала числа
        Напишите метод factorial, который принимает число n и возвращает его
        факториал. Если число n < 0, метод должен вернуть -1.*/
        //int n = 5;
        //int fact = ans.factorial(n);
        //System.out.println("Factorial of " + n + " is: " + fact);

        /*Задача 2. Вывод всех четных чисел от 1 до 100
        Напишите метод printEvenNums, который выведет на экран все четные числа
        в промежутке от 1 до 100, каждое на новой строке.*/
        //ans.printEvenNums();

        /*Задача 3. Подсчет суммы цифр числа
        Напишите метод sumDigits, который принимает целое число n и возвращает
        сумму его цифр.
        */
        int n = 12345;
        System.out.println("Sum of digits in " + n + " is " + ans.sumDigits(n));
    }
}

class Answer {
    public int sumDigits(int num){
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public void printEvenNums(){
        for(int i = 2; i <= 100; i+=2){
            System.out.println(i);
        }
    }
    public int factorial(int n) {
        if(n < 0) return -1;
//        if(n == 1 || n == 0) return 1;
//        if(n == 2) return 2;
//        return n * factorial(n - 1);
        int res = 1;
        for(int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
