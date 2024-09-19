package seminars;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lesson002 {
    private static Logger LOGGER = Log.log(Lesson002.class.getName());
    public static void main(String[] args) {
        //private methods are not in api, bcs others can't use them in their program
        //api is all that makes possible to use and make to others
        //ui - a convenient wrapper over a complex application
        //String is immutable == unchanging. when u concatenating strs => new link in stack
        //File stores file's meta-info (all file's info: address in the sys, size, name, ...
        //File in java can be dir or file
        //jar - java archive, appears when u compile and assemble ur program
        //.java - java file that is already interpreted to machine code
        //у процесса одна память и в нем несколько потоков, потоки могут обращаться к другим потокам на уровне одного
        // процесса, а процессы не могут обращаться друг к другу, так как используют разную память
        //потоки - минимальные единицы обработки процесса, не может существовать без процесса
        //процессы принимают виртуальные ядра и обраб их и система сама решает какому потоку дать больше времени на
        // обработку (можно настроить, но тяжело). можно дать потоку приоритет, чтобы с большей вероятностью операционка
        //дала больше вр на его обработку
        //info - простая инфа о приложении
        //error - уровень логирования для критических ошибок приложения (закончилась память, отвалилась бд и т.п.)
        // debug - уровень логирования, к-ый следуют использовать для фиксирования отладочной инфо
        //warning - н-р, вы используете устаревшую версию библ, которая может вызвать проблемы в будущем, пжл обновите
        //logging - журналирование всевозможных ошибок. логами нужно покрывать узкие (проблемные) места кода

        /*Напишите метод, который вернет содержимое текущей папки в виде массива строк.
        Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
        Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в
        лог-файл.*/

        LOGGER.log(Level.INFO, "App is launched");
        readFileNames("C:\\aaa");
        String out = "C:\\Users\\User\\Desktop\\Kyz Saikal";
        System.out.println(Arrays.toString(readFilesNamesInDir(out)));
        writeFilesNamesInFile("introToJava/src/seminars/lesson002.txt",out);
    }

    public static void writeFilesNamesInFile(String into, String out) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(into);
            String[] files = readFilesNamesInDir(out);
            for (String file : files) {
                fileWriter.write(file + "\n");
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error writing to file", e);
            throw new RuntimeException(e);
        }finally {
            try{
                fileWriter.close();
            }catch (IOException e){
                LOGGER.log(Level.SEVERE,"Error closing file writer", e);
                throw new RuntimeException("Error closing file writer");
            }
        }
    }

    public static String[] readFilesNamesInDir(String path) {
        File file = new File(path);
        if(file.isDirectory()){
            File[] files = file.listFiles();
            String[] names = new String[files.length];
            for(int i = 0; i < files.length; i++){
                names[i] = files[i].getName();
            }
            return names;
        }else {
            LOGGER.log(Level.SEVERE, "File is not a directory");
            throw new RuntimeException("File is not a directory");
        }
    }

    public static void readFileNames(String path) {
        File file = new File(path);
        try {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (files != null) {
                    for (File f : files) {
                        readFileNames(f.getName());
                    }
                }
            } else {
                LOGGER.log(Level.SEVERE, "File is not a directory");
                throw new RuntimeException("File is not a directory");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
