package code401challenges.utilities;

import java.util.LinkedList;

// I changed my code based on Michelle's solution.

public class AnimalShelter {
    static class Dog {};
    static class Cat {};

    private LinkedList<Dog> dogs;
    private LinkedList<Cat> cats;

    public AnimalShelter() {
        this.dogs = new LinkedList<>();
        this.cats = new LinkedList<>();
    }

    public void enqueue(Dog d) {
        this.dogs.add(d);
    }

    public void enqueue(Cat c) {
        this.cats.add(c);
    }

    public <T> T dequeue(Class<T> pref) {
        if (pref == Dog.class) {
            return (T) this.dogs.pop();
        }
        if (pref == Cat.class) {
            return (T)this.cats.pop();
        }
        else {
            throw new IllegalArgumentException("The shelter only accepts dogs and cats.");
        }
    }
}
