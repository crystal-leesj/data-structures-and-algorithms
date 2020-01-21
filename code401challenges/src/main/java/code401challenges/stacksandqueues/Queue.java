package code401challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {

    private Node<T> front;
    private Node<T> rear;

    public Queue() {
        this.front = null;
    }

    public boolean isEmpty(){
        return this.front == null;
    }

    public Node<T> peek() {
        if (this.front == null) {
            throw new NoSuchElementException();
        }
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
            this.rear.next = new_node;
        }
        this.rear = new_node;
    }

    // Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
    public T dequeue() {
        if (this.front == null) {
            throw new NoSuchElementException();
        } else {
            Node<T> removedQueue = this.front;
            this.front = this.front.next;
            if (this.front == null) {
                this.rear = null;
            }
            return removedQueue.value;
        }
    }
}
