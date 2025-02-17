package seminars.l004;

import java.util.EmptyStackException;

/**
 * Реализовать стэк с помощью массива и методы size(), empty(), push(), peek(), pop().
 * */
public class MyStack {
    private int capacity = 3; // volume in general
    private int size = 0;
    private int[] stack = new int[capacity];
    private int top = -1;

    private void addCapacity(){
        if (size == capacity) {
            capacity *= 2;
            int[] temp = new int[capacity];
            System.arraycopy(stack, 0, temp, 0, stack.length);
            stack = temp;
        }
    }

    public int pop(){
        if (empty()){ throw new EmptyStackException();}
        peek();
        size--;
        return stack[top--];
    }

    public int peek(){
        return stack[top];
    }

    public void push(int item){
        addCapacity();
        stack[++top] = item;
        size++;
    }

    public int size(){
        return size;
    }

    public boolean empty(){
        return top == -1;
    }

    @Override
    public String toString() {
        if (empty()) return "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            builder.append(stack[i]).append(", ");
        }

        builder.delete(builder.length() - 2, builder.length());
        return String.format("[%s]", builder);
    }
}
