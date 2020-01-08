package code401challenges;
import java.util.Arrays;

public class ArrayShift {
    public static int[] insertShiftArray(int[] inputArray, int inputNumber) {

        int middleIndex = (int) Math.ceil((inputArray.length)/2.0);

        int[] newArr = new int[inputArray.length+1];
        for (int i = 0; i < newArr.length; i++) {
            if (i == middleIndex) {
                newArr[i] = inputNumber;
            } else if (i < middleIndex) {
                newArr[i] = inputArray[i];
            } else {
                newArr[i] = inputArray[i-1];
            }
        }

        return newArr;
    }
}
