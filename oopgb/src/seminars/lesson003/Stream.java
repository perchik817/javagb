package seminars.lesson003;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudentGroup>, Iterable<StudentGroup> {
    private List<StudentGroup> groups;
    private int index;

    public Stream() {
        this.groups = new ArrayList<>();
        this.index = 0;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void addGroup(StudentGroup group){
        groups.add(group);
    }

    public int getGroupCount(){
        return groups.size();
    }

    @Override
    public boolean hasNext() {
        return index < groups.size();
    }

    @Override
    public StudentGroup next() {
        return groups.get(index++);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return this;
    }
}
