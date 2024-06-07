import DataStructures.Swap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _448_FindAllDisappearedInArray {
    private static int j;

    public static void main(String[] args) {

        int[] unsortedArray = {1, 1};
//        int[] unsortedArray = {1, 4, 3, 2, 7, 8, 2, 3, 1};

        sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
//        System.out.println("Hello java!");
    }

    public static void sort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i] - 1;
            if (i != array[correctIndex] && array[correctIndex] != array[i]) {
                Swap.swap(array, i, correctIndex);
            } else i++;
        }

        List<Integer> disappearedList=new ArrayList<>();
        for (int j = 0; j < array.length; j++) {
            if (array[j]-1!=j)disappearedList.add(j+1);
        }
        System.out.println(disappearedList);
    }

}