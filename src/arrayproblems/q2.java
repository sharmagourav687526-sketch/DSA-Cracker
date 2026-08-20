// Print Array intersection Element

package arrayproblems;

import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 7, 4, 5, 8};
        int[] array2 = {1, 2, 3, 5, 8, 9};

        intersectionOfElememnts(array1, array2);
    }

    static void intersectionOfElememnts(int[] arr1, int[] arr2) {
        int sizeOfArray1 = arr1.length;
        int sizeOfArray2 = arr2.length;

        Arrays.sort(arr2);

        for (int i = 0; i < sizeOfArray1; i++) {

            int index = Arrays.binarySearch(arr2, arr1[i]);
            if (index >= 0) {
                System.out.println(arr1[i]);
            }
        }
    }
}
