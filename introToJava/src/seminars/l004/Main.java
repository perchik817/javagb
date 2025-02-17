package seminars.l004;

public class Main {
    public static void main(String[] args) {
        MyStack s1 = new MyStack();

        System.out.println(s1.empty());

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        System.out.println(s1);

        System.out.println(s1.peek());

        s1.pop();
        System.out.println(s1 + "\nsize " + s1.size());
    }
}
