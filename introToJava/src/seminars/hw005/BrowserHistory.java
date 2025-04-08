package seminars.hw005;

import java.util.Deque;
import java.util.LinkedList;

public class BrowserHistory {
    private Deque<String> history = new LinkedList<>();

    public void visitSite(String site) {
// Напишите свое решение ниже
        history.addFirst(site);
    }
    public String back(int steps) {
// Напишите свое решение ниже
        if (steps >= history.size()) {
            return null;
        }
        return history.stream().skip(steps).findFirst().orElse("website not found");
    }
    public Deque<String> getHistory() {
// Напишите свое решение ниже
        return history;
    }

}
