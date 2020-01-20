package code401challenges.stacksandqueues;

import java.util.EmptyStackException;

public class Stack<T> {
    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public Node<T> peek() {
        if (this.top == null) {
            throw new EmptyStackException();
        } else {
            return top;
        }
    }

    public void push(T new_value) {
        Node<T> node = new Node(new_value);
        node.next = this.top;
        this.top = node;
    }

    public T pop() {
        if (this.top == null) {
            throw new EmptyStackException();
        }
        Node<T> popped = this.top;
        this.top = top.next;
//        popped.next = null;
        return popped.value;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

}
