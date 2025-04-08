package seminars.hw005;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentDirectory {
    private HashMap<String, ArrayList<Integer>> studentMap =
            new HashMap<>();
    // Добавляет или обновляет запись о студенте
    public void addStudent(String name, Integer grade) {
//        if(!studentMap.containsKey(name))
//            studentMap.put(name, new ArrayList<>(List.of(grade)));
//        else studentMap.get(name).add(grade);
        studentMap.computeIfAbsent(name, k -> new
                ArrayList<>()).add(grade);

    }
    public ArrayList<Integer> findStudent(String name) {
//        if(studentMap.containsKey(name)) return studentMap.get(name);
//        else throw new RuntimeException("Student not found");
        return studentMap.getOrDefault(name, new ArrayList<>());
    }
    // Возвращает весь справочник студентов
    public HashMap<String, ArrayList<Integer>> getAllStudents()
    {
        return studentMap;
    }
    // Удаляет запись о студенте по имени
    public void removeStudent(String name) {
        studentMap.remove(name);
    }

}
