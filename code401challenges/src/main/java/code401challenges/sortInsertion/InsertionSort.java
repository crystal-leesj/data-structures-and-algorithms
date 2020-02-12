package code401challenges.sortInsertion;

public class InsertionSort {
    public static int[] selectionSort(int[] inputArray) {
        int n = inputArray.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (inputArray[j] < inputArray[min]) {
                    min = j;
                }
            }
            int temp = inputArray[min];
            inputArray[min] = inputArray[i];
            inputArray[i] = temp;
        }
        return inputArray;
    }
}
