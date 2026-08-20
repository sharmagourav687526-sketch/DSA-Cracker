// Shift array elements by k positions
package arrayproblems;

import java.util.Arrays;

public class question5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k =4;
        System.out.println("Original Array: "+ Arrays.toString(arr));
        shiftArrayElemementBykPosition(arr, k);
        System.out.println("Shifted by "+k+" elements: "+Arrays.toString(arr));
    }

    static void shiftArrayElemementBykPosition(int[] arr,int k) {
        int size = arr.length;
        k = k % size;
        int[] kSizeArray = new int[k];

        for (int i = size-k,j = 0; i < size; i++,j++) {
            kSizeArray[j] = arr[i];
        }


        for (int i = size -k -1; i >= 0 ; i--) {
            arr[k+i] = arr[i];
        }
        for (int i = 0; i < kSizeArray.length; i++) {
            arr[i] = kSizeArray[i];
        }
    }
}
