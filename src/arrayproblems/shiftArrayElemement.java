// Shift array elements by 1 position
package arrayproblems;

import java.util.Arrays;

public class shiftArrayElemement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original Array: "+ Arrays.toString(arr));
        shiftArrayElemementBy1(arr);
        System.out.println("Shifted by one element: "+Arrays.toString(arr));
    }

    static void shiftArrayElemementBy1(int[] arr) {
        int size = arr.length;

        int tempPrevious = arr[0];
        arr[0] = arr[size - 1];
        int tempNext;
        for (int i = 1; i < size; i++) {
            tempNext = arr[i];
            arr[i] = tempPrevious;
            tempPrevious = tempNext;
        }
    }
}
