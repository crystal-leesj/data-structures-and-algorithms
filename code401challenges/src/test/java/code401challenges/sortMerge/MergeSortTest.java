package code401challenges.sortMerge;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {

    @Test
    public void testMergeSort_basic() {
        int[] expectedArr = new int[] {4, 8, 15, 16, 23, 42};
        int[] actualArr = new int[] {8, 4, 23, 42, 16, 15};
        MergeSort.mergeSort(actualArr);
        assertEquals(Arrays.toString(expectedArr), Arrays.toString(MergeSort.mergeSort(actualArr)));
    }

    @Test
    public void testMergeSort_reverse_sorted() {
        int[] expectedArr = new int[] {-2, 5, 8, 12, 18, 20};
        int[] actualArr = new int[] {20, 18, 12, 8, 5, -2};
        MergeSort.mergeSort(actualArr);
        assertEquals(Arrays.toString(expectedArr), Arrays.toString( MergeSort.mergeSort(actualArr)));
    }

    @Test
    public void testMergeSort_few_uniques() {
        int[] expectedArr = new int[] {5, 5, 5, 7, 7, 12};
        int[] actualArr = new int[] {5, 12, 7, 5, 5, 7};
        MergeSort.mergeSort(actualArr);
        assertEquals(Arrays.toString(expectedArr), Arrays.toString( MergeSort.mergeSort(actualArr)));
    }

    @Test
    public void testMergeSort_nearly_sorted() {
        int[] expectedArr = new int[] {2, 3, 5, 7, 11, 13};
        int[] actualArr = new int[] {2, 3, 5, 7, 13, 11};
        MergeSort.mergeSort(actualArr);
        assertEquals(Arrays.toString(expectedArr), Arrays.toString( MergeSort.mergeSort(actualArr)));
    }
}
