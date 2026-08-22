package arrayproblems;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[99];

        int idx = 0;
        for (int i = 901; i <= 1000; i++) {
            if (i == 974) continue; // skip target missing number
            arr[idx++] = i;
        }

        int[] range = {901, 1000};
        long missingNumber = findMissingNumOfArray(arr, range);
        System.out.println("Missing number is: " + missingNumber);
    }

    public static long findMissingNumOfArray(int[] arr, int[] range) {
        double missingNumber = 0;
        int size = arr.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }


        double  originalSum = ((range[1]-range[0] + 1) * ((range[0] + range[1]) / 2.0));

        missingNumber = originalSum - sum;
        return (int)missingNumber;
    }
}