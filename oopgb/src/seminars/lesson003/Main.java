package seminars.lesson003;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //final var means that it can be init once, but els for ex in List can be changed
        /**
         * Задача 1 - Iterator
         * Создать класс Студент
         * Создать класс УчебнаяГруппа
         * Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
         * Реализовать его контракты (включая удаление)
         *
         * Задача 2 - Iterable
         * Модифицировать класс УчебнаяГруппа, заставив его реализовать интерфейс Iterable
         * Реализовать метод iterator() возвращающий экземпляр созданного нами итератора
         * Создать класс УчебнаяГруппаСервис, добавив в него метод удаления студента по ФИО
         * Создать класс Контроллер, добавив в него метод удаления студента и вызывать в нем созданный метод из
         * УчебнаяГруппаСервис
         * */

        StudentGroup studentGroup = new StudentGroup();
        studentGroup.addStudent(new Student("Alesya"));
        studentGroup.addStudent(new Student("Victor"));
        studentGroup.addStudent(new Student("Andrey"));
        studentGroup.addStudent(new Student("Milana"));
        studentGroup.addStudent(new Student("Alexander"));

        Iterator<Student> iterator = new StudentGroupIterator(studentGroup);
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }


        StudyGroupService service = new StudyGroupService(studentGroup);
        Controller controller = new Controller(service);
        controller.removeStudent("Alesya");

        for(Student s : studentGroup){
            System.out.println(s);
        }
    }
}
