public class _1295CountEvenNumbers {
    public int findNumbers(int[] nums) {
        int evenCount = 0;

        // using for-each to iterate
        for (int i : nums) {
            if (Integer.toString(i).length() % 2 == 0)
                evenCount++;
        }

        // return no. of even
        return evenCount;
    }
}
