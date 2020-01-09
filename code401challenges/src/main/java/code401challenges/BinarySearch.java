package code401challenges;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] inputArray, int inputNumber) {

        int leftIndex = 0;
        int rightIndex = inputArray.length-1;
        while (leftIndex <= rightIndex) {
            int middleIndex = (int) Math.ceil((leftIndex + (rightIndex - leftIndex))/2.0);
            if (inputArray[middleIndex] == inputNumber) {
                return middleIndex;
            }
            if (inputArray[middleIndex] < inputNumber) {
                leftIndex = middleIndex + 1;
            }
            else {
                rightIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
