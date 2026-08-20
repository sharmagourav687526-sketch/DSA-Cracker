// Print Alternate Extreme elememnts of an Array

package arrayproblems;

public class q3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        printAlternativeElememnts(array);
    }

    static void printAlternativeElememnts(int[] array) {
        int size = array.length;
        for (int i = 0,j = size - 1; i < j; i++,j--) {
            System.out.println(array[i]+","+array[j]);
        }
    }
}
