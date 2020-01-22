package code401challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AnimalShelterTest {
    @Test
    public void testEnqueueDequeue() {
        AnimalShelter<String> actual = new AnimalShelter<>();
        actual.enqueue("cat");
        actual.enqueue("cat");
        actual.enqueue("dog");

        assertEquals("cat", actual.dequeue("cat"));
        assertEquals("cat", actual.dequeue("cat"));
        assertEquals("dog", actual.dequeue("dog"));
    }

    @Test
    public void testEnqueueDequeue_notExisting() {
        AnimalShelter<String> actual = new AnimalShelter<>();
        actual.enqueue("cat");
        actual.enqueue("cat");
        actual.enqueue("dog");

        assertNull(actual.dequeue("rabbit"));
        assertNull(actual.dequeue("panda"));
    }
}
