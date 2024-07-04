package seminars.lesson003;

import java.util.*;

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
         *
         * Задача 3 - Comparable
         * Модифицировать класс Студент, заставив его реализовать интерфейс Comparable
         * Реализовать контракт compareTo () со сравнением по какому-либо параметру (пример studentId)
         * Модифицировать класс УчебнаяГруппаСервис, добавив в него метод сортировки списка студентов по id
         * Модифицировать класс Контроллер, добавив в него метод сортировки списка студентов по id и вызывать в нем
         * созданный метод из УчебнаяГруппаСервис
         * */

        StudentGroup studentGroup = new StudentGroup();
        studentGroup.addStudent(new Student("Alesya", 3));
        studentGroup.addStudent(new Student("Victor", 1));
        studentGroup.addStudent(new Student("Andrey", 5));
        studentGroup.addStudent(new Student("Milana", 2));
        studentGroup.addStudent(new Student("Alexander", 4));

        Iterator<Student> iterator = new StudentGroupIterator(studentGroup);
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println("studentId: " + s.getId() + ", name: " + s.toString());
        }


        StudyGroupService service = new StudyGroupService(studentGroup);
        Controller controller = new Controller(service);
//        controller.removeStudent("Alesya");
        controller.sortStudentsById();
        for(Student s : studentGroup){
            System.out.println(s);
        }
        /*
        ArrayList<Student> students = new ArrayList<>(List.of(new Student("Alya", 1),
                new Student("Andrey", 2),
                new Student("Alexander", 3)));
        Collections.sort(students);
        System.out.println("sorted by name len: " + students);
//        Collections.sort(students, (s1, s2) -> s1.getId() - s2.getId());
        Collections.sort(students, new StudentComparator());
        System.out.println("sorted by id: " + students);

         */
    }
}
