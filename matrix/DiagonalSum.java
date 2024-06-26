package leetcode.easy.matrix;

/**https://leetcode.com/problems/matrix-diagonal-sum/description/
 *
 * Given a square matrix mat, return the sum of the matrix diagonals.
 *
 * Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal
 * that are not part of the primary diagonal.
 *
 * Example 1:
 * Input: mat = [[1,2,3],
 *               [4,5,6],
 *               [7,8,9]]
 * Output: 25
 * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 * Notice that element mat[1][1] = 5 is counted only once.
 *
 * Example 2:
 * Input: mat = [[1,1,1,1],
 *               [1,1,1,1],
 *               [1,1,1,1],
 *               [1,1,1,1]]
 * Output: 8
 *
 * Example 3:
 * Input: mat = [[5]]
 * Output: 5
 */
public class DiagonalSum {

    /** TC : O(n^2)
    public static int diagonalSum(int[][] arr){
        int sum=0, m= arr.length,n=arr[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == j || (i+j) ==n-1){
                    sum +=arr[i][j];
                }
            }
        }
        return sum;
    } */

    /**
     *  TC : O(n)
     */
    public static int diagonalSum(int[][] mat){
        int sum =0, m = mat.length, mid = m/2;

        for(int i=0;i<m;i++){
            sum += mat[i][i] +mat[i][m-i-1];
        }

        if(m %2 !=0 || m ==1) { sum -= mat[mid][mid]; }
        return sum;
    }

    public static void main(String[] args) {
        //int[][] arr =new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr =new int[][]{{6,3,1,10,7,4},{4,10,1,9,5,10},{5,5,7,3,8,5},{2,7,6,4,7,6},{7,9,6,1,8,5},{1,7,9,5,8,4}};
        System.out.println(diagonalSum(arr));
    }
}

