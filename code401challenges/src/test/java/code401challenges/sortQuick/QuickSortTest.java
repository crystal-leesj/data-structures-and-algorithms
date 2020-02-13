package code401challenges.sortQuick;

import org.junit.Test;

import java.util.Arrays;

import static code401challenges.sortQuick.QuickSort.quickSort;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class QuickSortTest {
    @Test
    public void testQuickSort_basic() {
        int[] actual = new int[] {8,4,23,42,16,15};
        int n = actual.length - 1;
        int[] expected = new int[] {4, 8, 15, 16, 23, 42};
//        System.out.println("expected = " + Arrays.toString(expected));
//        System.out.println("actual = " + Arrays.toString(quickSort(actual, 0, n)));
        assertArrayEquals(quickSort(actual, 0, n), expected);
    }

    @Test
    public void testQuickSort_reverse_sorted() {
        int[] actual = new int[] {20, 18, 12, 8, 5, -2};
        int n = actual.length - 1;
        int[] expected = new int[] {-2, 5, 8, 12, 18, 20};
//        System.out.println("expected = " + Arrays.toString(expected));
//        System.out.println("actual = " + Arrays.toString(quickSort(actual, 0, n)));
        assertArrayEquals(quickSort(actual, 0, n), expected);
    }

    @Test
    public void testQuickSort_few_uniques() {
        int[] actual = new int[] {5, 12, 7, 5, 5, 7};
        int n = actual.length - 1;
        int[] expected = new int[] {5, 5, 5, 7, 7, 12};
//        System.out.println("expected = " + Arrays.toString(expected));
//        System.out.println("actual = " + Arrays.toString(quickSort(actual, 0, n)));
        assertArrayEquals(quickSort(actual, 0, n), expected);
    }

    @Test
    public void testQuickSort_nearly_sorted() {
        int[] actual = new int[] {2, 3, 5, 7, 13, 11};
        int n = actual.length - 1;
        int[] expected = new int[] {2, 3, 5, 7, 11, 13};
//        System.out.println("expected = " + Arrays.toString(expected));
//        System.out.println("actual = " + Arrays.toString(quickSort(actual, 0, n)));
        assertArrayEquals(quickSort(actual, 0, n), expected);
    }

}
