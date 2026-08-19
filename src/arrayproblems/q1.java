package arrayproblems;

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Array Before swapping " + Arrays.toString(array));
        System.out.println("Array After swapping " + Arrays.toString(swapAlternateElemements(array)));
    }

    static int[]  swapAlternateElemements(int[] arr){
        int size =  arr.length;
        int[] res = new int[size];
        for (int i = 0; i < size; i += 2) {
            res[i] = arr[i+1];
            res[i+1] = arr[i];
        }
        return res;
    }
}
