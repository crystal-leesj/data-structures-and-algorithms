package code401challenges.utilities;

import java.util.Stack;

public class AnimalShelter<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public AnimalShelter() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void enqueue(T animal) {
        stack1.push(animal);
    }

    public T dequeue(T pref) {
        if (pref != "cat" && pref != "dog") {
            return null;
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
