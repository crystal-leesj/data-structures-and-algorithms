package code401challenges.stacksandqueues;

public class Queue<T> {

    private Node<T> front;

    public Queue() {
        this.front = null;
    }

    public boolean isEmpty(){
        return this.front == null;
    }

    public Node<T> peek() {
        return front;
    }

    public int getSize() {
        int size = 0;
        Node<T> current = this.front;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
    public void enqueue(T new_value) {
        Node<T> new_node = new Node(new_value);
        new_node.next = null;

        if (this.front == null) {
            this.front = new_node;
        } else {
            Node<T> current = this.front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }
    }

    // Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
    public T dequeue() {
        Node<T> removedQueue = this.front;
        this.front = front.next;
        return removedQueue.value;
    }
}
