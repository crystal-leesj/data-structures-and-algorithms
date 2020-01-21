package code401challenges.stacksandqueues;

import java.util.EmptyStackException;

public class PseudoQueue<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public PseudoQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }


    public void enqueue(T new_value) {
        stack1.push(new_value);
    }

    public T dequeue() {
        while (!stack1.isEmpty()) {
//            System.out.println("stack1 = " + stack1.peek().value);
            stack2.push(stack1.pop());
        }
//        System.out.println("stack2 = " + stack2.peek());
        return stack2.pop();
    }

}
