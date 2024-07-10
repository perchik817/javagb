package seminars.lesson005.com.ex.demo.service;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    // final у примитива = константа, у ссылочных - ссылка не меняется, но содержимое изменяемое

    private final List<Integer> groups = new ArrayList<>();
    public void addGroupId(int id){
        groups.add(id);
    }
}
