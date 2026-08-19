package arrayproblems;

import java.util.Arrays;

public class averageOfAllElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(getAverage(arr));

        System.out.println("After multiplying by 10: " + Arrays.toString(multiplyBy10(arr)));

        System.out.println(findElement(arr, 3));

        System.out.println("Max Element: " + findMaxElement(arr));


        int[] array = {1, 2, -3, 4, -5};
        int[] res = positiveAndNegativeSum(array);
        System.out.println("Positive sum "+ res[0] + " Negative sum " + res[1]);
    }

    static double getAverage(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    static int[] multiplyBy10(int[] arr) {
        int size = arr.length;
        int[] res = new int[size];

        for (int i = 0; i < size; i++) {
            res[i] = arr[i] * 10;
        }

        return res;
    }

    static String findElement(int[] arr, int element) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if(arr[i] == element){
                String str = "Element " + element + " found at index: " + i;
                return str;
            }
        }
        return "Element " + element + " not found";
    }

    static int findMaxElement(int[] arr) {
        int size = arr.length;
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i]>max) max = arr[i];
        }
        return max;
    }

    static int[] positiveAndNegativeSum(int[] arr) {
        int size = arr.length;
        int positiveSum = 0;
        int negativeSum = 0;
        for(int i:arr){
            if (i>0) positiveSum += i;
            else negativeSum += i;
        }
        int[] res = {positiveSum, negativeSum};
        return res;
    }
}