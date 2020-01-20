package code401challenges.stacksandqueues;

public class Stack<T> {
    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public Node<T> peek() {
        return top;
    }

    public void push(T new_value) {
        Node<T> node = new Node(new_value);
        node.next = this.top;
        this.top = node;
    }

    public T pop() {
        Node<T> popped = this.top;
        this.top = top.next;
//        popped.next = null;
        return popped.value;
    }

    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        } else {
            return false;
        }
    }

}
