package seminars.hw002;

/*Задача 3. Удаление пустых строк из текста
Дана строка с несколькими строками текста, разделенными переводами строки.
Напишите метод, который удаляет все пустые строки из текста.
Пример:
line1

line2

line3
Результат:
line1
line2
line3

\\s — это регулярное выражение, которое обозначает любой пробельный символ. Это может быть:

Пробел ( )
Табуляция (\t)
Символ новой строки (\n)
Возврат каретки (\r)
Вертикальная табуляция (\v)
*/

public class TextCleaner {

    public static void main(String[] args) {
        String text = "line1\n\nline2\n\nline3";
        System.out.println(cleanText(text));
    }

    public static String cleanText(String text) {
        String[]  lines = text.split("\n");
        StringBuilder cleanedText = new StringBuilder();
        for(String line : lines) {
            if(!line.trim().isEmpty()) {

                cleanedText.append(line).append("\n");
            }
        }
        return cleanedText.toString();


//        return text.replaceAll("\n\n", "\n");
    }
}
