// finding the union of the two arrays
package arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class question6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 7, 9, 26};
        int[] arr2 = {1, 2, 3, 4, 5, 8, 26};

        System.out.println("Original Array1: " + Arrays.toString(arr1));
        System.out.println("Original Array2: " + Arrays.toString(arr2));
        ArrayList<Integer> union = unionOfTwoArray(arr1, arr2);
        System.out.println("Union: " + union);
    }

    static ArrayList<Integer> unionOfTwoArray(int[] arr1, int[] arr2) {
        int sizeOfArray1 = arr1.length;
        int sizeOfArray2 = arr2.length;

        ArrayList<Integer> union = new ArrayList<>();


        int i = 0, j = 0, k = 0;
        while ((i < sizeOfArray1) && (j < sizeOfArray2)) {
            if (arr1[i] == arr2[j]) {
                union.add(arr1[i++]);
                //union[k++] = arr1[i++];
                j++;
            } else if (arr1[i] < arr2[j]) {
                union.add(arr1[i++]);
                //union[k++] = arr1[i++];
            } else {
                union.add(arr2[j++]);
                //union[k++] = arr2[j++];
            }
        }

        while (i < sizeOfArray1) {
            union.add(arr1[i++]);
            //union[k++] = arr1[i++];
        }

        while (j < sizeOfArray2) {
            union.add(arr2[j++]);
            //union[k++] = arr2[j++];
        }
        return union;
    }
}
