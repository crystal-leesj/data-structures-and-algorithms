package code401challenges.sortInsertion;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class InsertionSortTest {
    @Test
    public void testSelectionSort_basic() {
        int[] actualArr = new int[] {8, 4, 23, 42, 16, 15};
        InsertionSort.selectionSort(actualArr);
        int[] expectedArr = new int[] {4, 8, 15, 16, 23, 42};
        assertEquals(Arrays.toString(expectedArr), Arrays.toString(actualArr));
    }

    @Test
    public void testSelectionSort_reverse_sorted() {
        int[] actualArr = new int[] {20, 18, 12, 8, 5, -2};
        InsertionSort.selectionSort(actualArr);
        int[] expectedArr = new int[] {-2, 5, 8, 12, 18, 20};
        assertEquals(Arrays.toString(expectedArr), Arrays.toString(actualArr));
    }

    @Test
    public void testSelectionSort_few_uniques() {
        int[] actualArr = new int[] {5, 12, 7, 5, 5, 7};
        InsertionSort.selectionSort(actualArr);
        int[] expectedArr = new int[] {5, 5, 5, 7, 7, 12};
        assertEquals(Arrays.toString(expectedArr), Arrays.toString(actualArr));
    }

    @Test
    public void testSelectionSort_nearly_sorted() {
        int[] actualArr = new int[] {2, 3, 5, 7, 13, 11};
        InsertionSort.selectionSort(actualArr);
        int[] expectedArr = new int[] {2, 3, 5, 7, 11, 13};
        assertEquals(Arrays.toString(expectedArr), Arrays.toString(actualArr));
    }

}
