package code401challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test
    public void testEnqueueDequeue() {
        AnimalShelter actual = new AnimalShelter();
        AnimalShelter.Dog d1 = new AnimalShelter.Dog();
        AnimalShelter.Dog d2 = new AnimalShelter.Dog();
        AnimalShelter.Dog d3 = new AnimalShelter.Dog();
        AnimalShelter.Cat c1 = new AnimalShelter.Cat();
        AnimalShelter.Cat c2 = new AnimalShelter.Cat();
        
        actual.enqueue(d1);
        actual.enqueue(d2);
        actual.enqueue(c1);
        actual.enqueue(d3);
        actual.enqueue(c2);

        assertEquals(d1, actual.dequeue(AnimalShelter.Dog.class));
        assertEquals(d2, actual.dequeue(AnimalShelter.Dog.class));
        assertEquals(c1, actual.dequeue(AnimalShelter.Cat.class));
        assertEquals(c2, actual.dequeue(AnimalShelter.Cat.class));
        assertEquals(d3, actual.dequeue(AnimalShelter.Dog.class));
    }

}
