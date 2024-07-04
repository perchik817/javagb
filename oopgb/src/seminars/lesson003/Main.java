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
         *
         *Home work
         * Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterator
         * Создать класс StreamComparator, реализующий сравнение количества групп входящих в Поток
         * Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator
         * Модифицировать класс Контроллер, добавив в него созданный сервис
         * Модифицировать класс Контроллер, добавив в него метод сортирующий список потоков, путем вызова созданного сервиса
         * */

        StudentGroup studentGroup = new StudentGroup();
        studentGroup.addStudent(new Student("Alesya", 3));
        studentGroup.addStudent(new Student("Victor", 1));
        studentGroup.addStudent(new Student("Andrey", 5));
        studentGroup.addStudent(new Student("Milana", 2));
        studentGroup.addStudent(new Student("Alexander", 4));

        StudentGroup studentGroup2 = new StudentGroup();
        studentGroup2.addStudent( new Student("Barbara", 1));
        studentGroup2.addStudent(new Student("Bob", 2));
        studentGroup2.addStudent( new Student("Boris", 3));

        Stream stream1 = new Stream();
        stream1.addGroup(studentGroup);

        Stream stream2 = new Stream();
        stream2.addGroup(studentGroup2);

        Stream stream3 = new Stream();
        stream3.addGroup(studentGroup);
        stream3.addGroup(studentGroup2);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        Iterator<Student> iterator = new StudentGroupIterator(studentGroup);
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println("studentId: " + s.getId() + ", name: " + s.toString());
        }

        StudyGroupService service = new StudyGroupService(studentGroup);
        StreamService streamService = new StreamService();

        Controller controller = new Controller(service);
        Controller controllerStream = new Controller(streamService);
//        controller.removeStudent("Alesya");
//        controller.sortStudentsById();
//        for(Student s : studentGroup){
//            System.out.println(s);
//        }

        controllerStream.sortStreams(streams);
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getGroupCount() + " group(s).");
        }

//        ArrayList<Student> students = new ArrayList<>(List.of(new Student("Alya", 1),
//                new Student("Andrey", 2),
//                new Student("Alexander", 3)));
//        Collections.sort(students);
//        System.out.println("sorted by name len: " + students);
////        Collections.sort(students, (s1, s2) -> s1.getId() - s2.getId());
//        Collections.sort(students, new StudentComparator());
//        System.out.println("sorted by id: " + students);
    }
}
