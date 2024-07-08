package seminars.lesson004.util;

import seminars.lesson004.models.User;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
