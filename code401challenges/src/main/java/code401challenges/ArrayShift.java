package code401challenges;

public class ArrayShift {
    public static int[] insertShiftArray(int[] inputArray, int inputNumber) {

        int middleIndex = (int) Math.ceil((inputArray.length)/2.0);

        int[] newArr = new int[inputArray.length+1];
        for (int j = 0; j < inputArray.length; j++) {
            newArr[j] = inputArray[j];
        }

        for (int i = newArr.length-1; i > middleIndex; i--){
            newArr[i] = newArr[i-1];
        }
        newArr[middleIndex] = inputNumber;
        return newArr;
    }
}
