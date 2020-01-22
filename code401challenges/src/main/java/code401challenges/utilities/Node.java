package code401challenges.utilities;

public class Node<T> {
    public T value;
    public code401challenges.stacksandqueues.Node next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}
