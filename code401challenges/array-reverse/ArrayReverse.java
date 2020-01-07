import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    int[] startArr = new int[] {1,2,3,4,5,10};
    System.out.println(Arrays.toString(startArr));
    int[] endArr = reverseArray(startArr);
    System.out.println(Arrays.toString(endArr));
  }

  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArray) {
    if (inputArray.length == 0) {
      return inputArray; 
    } 
    else if (inputArray.length == 1) {
      return inputArray;
    }
    else {
      int[] newArr = new int[inputArray.length];
      int j = inputArray.length;
      for (int i = 0; i < inputArray.length; i++) {
        newArr[j - 1] = inputArray[i];
        j--;
      }
      return newArr;
    }
  }
}
