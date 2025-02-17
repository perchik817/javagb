package seminars.hw004;

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

        MyStack stack = new MyStack();

        stack.push("apple");
        stack.push("banana");
        stack.push("pear");
        stack.push("grape");

        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());

    }
}
