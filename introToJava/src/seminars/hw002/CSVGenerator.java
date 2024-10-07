package seminars.hw002;

import java.util.Arrays;

public class CSVGenerator {

    /*Задача 2. Создание CSV-строки из массива объектов
    Дан массив объектов, где каждый объект представляет собой строку данных, и
    массив заголовков. Создайте строку CSV, где строки данных разделяются новой
    строкой, а значения в строках разделяются запятыми.
    Пример:
    String[] headers = {"Name", "Age", "City"};
    String[][] data = {
    {"John", "30", "New York"},
    {"Alice", "25", "Los Angeles"},
    {"Bob", "35", "Chicago"}
    };
    Результат:
    Name,Age,City
    John,30,New York
    Alice,25,Los Angeles
    Bob,35,Chicago
    */

    public static void main(String[] args) {
        String[] headers = new String[]{"Name", "Age", "City"};
        String[][] data = new String[][] {
                {"John", "30", "New York"},
                {"Alice", "25", "Los Angeles"},
                {"Bob", "35", "Chicago"}
        };

        System.out.println(generateCSV(headers, data));
    }

    public static String generateCSV(String[] headers,
                                     String[][] data) {
        StringBuilder csv = new StringBuilder();
        csv.append(String.join(", ", headers)).append(System.lineSeparator());

        for (String[] row : data) {
            csv.append(String.join(", ", row)).append(System.lineSeparator());
        }
//        csv.append(Arrays.toString(headers));
//        for (String[] row : data) {
//            csv.append(System.lineSeparator());
//            csv.append(Arrays.toString(row));
//        }

        return csv.toString();
    }

}
