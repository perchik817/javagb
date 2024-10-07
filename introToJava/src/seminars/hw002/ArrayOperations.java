package seminars.hw002;

/*Задача 4. Логирование операций с массивом во время поиска
минимального и максимального элементов
Реализуйте метод поиска минимального и максимального элементов массива.
После нахождения каждого элемента (минимального и максимального),
сделайте запись в лог-файл log.txt в формате год-месяц-день
час:минуты {минимальный элемент}, {максимальный элемент}.
*/

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ArrayOperations {
    private static final String LOG_FILE_PATH = "introToJava/src/seminars/hw002/log.txt";

    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 8, 3, 1};
        findMinMax(arr);

        try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findMinMax(int[] arr) {
        try (FileWriter fileWriter = new FileWriter(LOG_FILE_PATH, true)) {
            int max = arr[0], min = arr[0];
            for (int value : arr) {
                if (max < value) max = value;
                if (min > value) min = value;
            }
            logStep(fileWriter, min, max);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logStep(FileWriter fileWriter, int min, int max) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String date = LocalDateTime.now().format(formatter);
            fileWriter.write(date + " минимальный элемент: {" + min + "}, максимальный элемент: {" + max + "}" +
                    System.lineSeparator());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

