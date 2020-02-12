package code401challenges.sortMerge;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] startArr = new int[] {8,4,23,42,16,15};
        System.out.println(Arrays.toString(startArr));
        int[] endArr = mergeSort(startArr);
        System.out.println(Arrays.toString(endArr));
    }

    public static int[] mergeSort(int[] arr) {
        int n = arr.length;

        // edge case
        if (n < 2) {
            return arr;
        }

        int mid = n/2;
//        System.out.println("mid = " + mid);
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
//        System.out.println("Arrays.toString(left) = " + Arrays.toString(left));

        for (int j = mid; j < n; j++) {
            right[j-mid] = arr[j];
        }
//        System.out.println("Arrays.toString(right) = " + Arrays.toString(right));

        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] arr = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return arr;
    }

}
