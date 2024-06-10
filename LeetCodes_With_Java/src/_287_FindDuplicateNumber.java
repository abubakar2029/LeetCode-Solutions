import DataStructures.Swap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _287_FindDuplicateNumber {
    public static void main(String[] args) {
//        int[] unsortedArray = {1, 3, 4, 2, 2};
        int[] unsortedArray = {4, 3, 1, 4, 2};

//        int[] unsortedArray = {1, 4, 3, 2, 7, 8, 2, 3, 1};

        sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static int sort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i] - 1;
//            if (i + 1 != array[i] && array[correctIndex] != array[i]) {
            if (i + 1 != array[i] && array[correctIndex] != array[i]) {

                if (array[correctIndex] == array[i]) {
                    return array[correctIndex];
                } else
                    Swap.swap(array, i, correctIndex);
            } else i++;
        }

        System.out.println("Duplicate : " + array[array.length - 1]);
        return array[array.length - 1]);
    }

}
