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

        return url.toString();
    }
}
