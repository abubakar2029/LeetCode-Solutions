import DataStructures.Swap;

import java.util.Arrays;

public class _448_FindAllDisappearedInArray {
    public static void main(String[] args) {

        int[] unsortedArray = {1, 4, 3, 2, 7, 8, 2, 3, 1};
        sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println("Hello java!");
    }

    public static void sort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i] - 1;
            if (i != array[correctIndex] && array[correctIndex] != array[i]) {
                Swap.swap(array, i, correctIndex);
            } else i++;
        }
    }

}