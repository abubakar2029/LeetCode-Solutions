import java.util.ArrayList;

class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> allCustomerData = new ArrayList<>();

        for (int i = 0; i < accounts.length; i++) {

            int totalBalance = 0;
            for (int j = 0; j < accounts[i].length; j++)
                totalBalance += accounts[i][j];

            allCustomerData.add(totalBalance);
        }

        int maxBalance = Integer.MIN_VALUE;
        for (Integer i : allCustomerData) {
            if (i > maxBalance)
                maxBalance = i;
        }

        System.out.println(maxBalance);
        return maxBalance;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println("The max wealth is : " + solution.maximumWealth(accounts));
    }
}