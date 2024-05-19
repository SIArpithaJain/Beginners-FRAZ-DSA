package code360.easy;

/**
 * https://www.naukri.com/code360/problems/move-zeros-to-left_1094877?leftPanelTabValue=PROBLEM
 *
 * Approach : Two pointer Approach
 *
 * TC : O(n)
 *
 * Problem statement :
 * You are given an array 'ARR' of integers. Your task is to modify the array so that all the array elements having zero values get pushed to the left and all the array elements having non-zero value come after them while maintaining their relative order.
 *
 * For example :
 * Consider the array { 1, 1, 0, 2, 0 }. 
 * For the given array the modified array should be {0,0,1,1,2} . 
 * Arrays { 0, 0, 1, 2, 1 } and  { 0, 0, 2, 1, 1 } are not the correctly reorganized array even if they have all the zero values pushed to the left as in both the arrays the relative order of non-zero elements is not maintained.
 * Follow Up :
 * Can you solve the problem in linear time, and constant space?
 */
public class moveZerosToLeft {

    public static void moveZerosToLeftOrStart(int[] arr) {
        int size = arr.length-1;
        int z = size, nz = size;
        if(size ==0 ){
            return;
        }
        while(nz >=0) {
            if(arr[nz]!=0) {
                int temp = arr[z];
                arr[z] = arr[nz];
                arr[nz] = temp;
                nz--;
                z--;
            } else {
                nz--;
            }
        }
    }

    public static void main(String[] args) {
       // int[] arr = new int[]{10, 0, 22, 8, 0, 5, 0};
        int[] arr = new int[]{1,0};
        moveZerosToLeftOrStart(arr);
        for (int res : arr) {
            System.out.print(res + " ");
        }
    }
}
