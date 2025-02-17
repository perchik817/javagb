package seminars.hw004;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        DelOddStr task1 = new DelOddStr();
        LinkedList<String> ll = new LinkedList<>();
        ll.add("apple");
        ll.add("banana");
        ll.add("pear");
        ll.add("grape");
        System.out.println(ll);
        task1.removeOddLengthStrings(ll);
        System.out.println(ll);
        */
        /*
        MyStack stack = new MyStack();

        stack.push("apple");
        stack.push("banana");
        stack.push("pear");
        stack.push("grape");

        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());
        */

        /*
        LinkedList<String> list = new LinkedList<>(List.of("apple", "banana", "apple", "pear", "banana", "banana"));
        String value = "banana";
        System.out.println("Occurrences of \"" + value + "\": " + ListUtils.countOccurrences(list, value));
        */

        /*
        Deque<Integer> deque = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int n = -3;
        DequeTasks.rotateDeque(deque, n);
        System.out.println(deque);
        */

        Deque<String> deque = new LinkedList<>(List.of("apple", "banana", "apple", "cherry"));
        String value = "apple";
        DequeTasks.removeAllOccurrences(deque, value);

    }
}
