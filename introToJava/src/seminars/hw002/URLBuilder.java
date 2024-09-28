package seminars.hw002;

import java.util.Arrays;

public class URLBuilder {

    /*Задание 1. Формирование URL с параметрами
    Дана строка базового URL:
    https://example.com/search?
    Сформируйте полный URL, добавив к нему параметры для поиска. Параметры
    передаются в виде строки, где ключи и значения разделены =, а пары
    ключ-значение разделены &. Если значение null, то параметр не должен
    попадать в URL.
    Пример:
    params = "query=java&sort=desc&filter=null"
    Результат:
    https://example.com/search?query=java&sort=desc*/

    public static void main(String[] args) {
        String baseURL = "https://example.com/search?";
        String params = "query=java&sort=desc&filter=null";
        URLBuilder ans = new URLBuilder();
        System.out.println(ans.buildURL(baseURL, params));
    }

    public String buildURL(String baseURL, String params) {
        StringBuilder url = new StringBuilder(baseURL);

        String[] paramArray = params.split("&");
        System.out.println("params: " + Arrays.toString(paramArray));
        boolean first = true;
        for (String param : paramArray) {
            String[] keyValue = param.split("=");
            if (keyValue.length == 2 && !"null".equals(keyValue[1])) {
                if (!first) {
                    url.append("&");  // Добавляем символ & перед каждым новым параметром
                } else {
                    first = false;
                }
                url.append(keyValue[0]).append("=").append(keyValue[1]);
            }
            System.out.println("keyValue: " + Arrays.toString(keyValue));
        }


        //reference solution
        /*Подсказка № 1
        Разделите строку параметров на части, используя символ & в качестве разделителя.
        Это даст вам массив строк, каждая из которых представляет собой пару
        "ключ=значение".
        Подсказка № 2
        Для каждой строки, представляющей пару "ключ=значение", разделите её на ключ и
        значение с помощью символа =. Это позволит вам обработать ключ и значение
        отдельно.
        Подсказка № 3
        Проверьте, если значение после символа = равно "null". В этом случае, этот параметр
        не должен добавляться к итоговому URL.
        Подсказка № 4
        Используйте StringBuilder для построения итогового URL. Начните с базового URL
        и добавляйте параметры, разделяя их символом &, если это необходимо.
        Подсказка № 5
        При добавлении первого параметра в URL, не забудьте проверить, есть ли уже символ
        ? в базовом URL. Если он присутствует, параметры должны быть добавлены после
        него. Если его нет, начните с ?.*/

        /*String[] pairs = params.split("&");
        for (int i = 0; i < pairs.length; i++) {
            String[] keyValue = pairs[i].split("=");
            if (!"null".equals(keyValue[1])) {
                if (i > 0) {
                    url.append("&");
                }
                url.append(keyValue[0]).append("=").append(keyValue[1]);
            }
        }*/


        return url.toString();
    }
}
