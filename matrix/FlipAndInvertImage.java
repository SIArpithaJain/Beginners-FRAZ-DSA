package leetcode.easy.matrix;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/flipping-an-image/
 *
 * Problem statement
 * 
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
 *
 * To flip an image horizontally means that each row of the image is reversed.
 *
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 *
 * For example, inverting [0,1,1] results in [1,0,0].
 *
 * Example 1:
 * Input: image = [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 *
 * Example 2:
 * Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 */
public class FlipAndInvertImage {

    public static int[][] flipAndInvertImage(int[][] image){
        if(image == null || image.length ==0 || image[0].length ==0){
            return null;
        }
        for(int[] row : image){
            int start = 0;
            int end = row.length -1;

            while(start <=end){
                if(row[start] == row[end]){
                    row[start] ^= 1;
                    row[end] = row[start];
                }
                start++;
                end--;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        int[][] res = flipAndInvertImage(nums);

        /*for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j] +",");
            }
            System.out.println();
        }*/

        /*for(int i=0;i<nums.length;i++){
            System.out.println(Arrays.toString(nums[i]));
        }*/

        for(int[] arr : res){
            System.out.println(Arrays.toString(arr));
        }
    }
}
