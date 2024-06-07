import java.util.Arrays;

public class _268MissingNumber {
    public static void main(String[] args) {
        int[] unsortedArray = {2, 4, 0, 3, 5};
        sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(missingNumber(unsortedArray));
    }

    public static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i && nums[i] != nums.length) Swap.swap(nums, i, nums[i]);
            else i++;
        }
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i && i != nums.length) return i;
            else i++;
        }
        return nums.length;
    }
}
