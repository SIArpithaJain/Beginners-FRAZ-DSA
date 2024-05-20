/**
 * https://leetcode.com/problems/richest-customer-wealth/
 *
 * Problem statement
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the 
 * customer has in the bank. Return the wealth that the richest customer has.
 *
 * A customer's wealth is the amount of money they have in all their bank accounts. 
 * The richest customer is the customer that has the maximum wealth.
 *
 * Example 1:
 *
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 * Explanation:
 * 1st customer has wealth = 1 + 2 + 3 = 6
 * 2nd customer has wealth = 3 + 2 + 1 = 6
 * Both customers are considered the richest with a wealth of 6 each, so return 6.
 * Example 2:
 *
 * Input: accounts = [[1,5],[7,3],[3,5]]
 * Output: 10
 * Explanation: 
 * 1st customer has wealth = 6
 * 2nd customer has wealth = 10 
 * 3rd customer has wealth = 8
 * The 2nd customer is the richest with a wealth of 10.
 */
public class MaximumWealth {
    public static void maximumWealth(int[][] accounts) {
        int m= accounts.length, n= accounts[0].length;
        int res = 0;
        for(int i=0;i<m;i++){
            int result =0;
            for(int j=0;j<n;j++){
                result+= accounts[i][j];
            }
            res= Math.max(result,res);
        }
        System.out.println("=="+res);

    }

    public static void main(String[] args) {

        maximumWealth(new int[][] {{1,5},{7,3},{3,5}});

    }
}
