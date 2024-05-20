package code360.easy.BinarySearch;

public class SearchTargetElement {

    /**
     * https://www.naukri.com/code360/problems/binary-search_972?leftPanelTabValue=PROBLEM
     *
     * Problem statement
     *
     * You are given an integer array 'A' of size 'N', sorted in non-decreasing order. You are also given an integer 'target'.
     * Your task is to write a function to search for 'target' in the array 'A'. If it exists, return its index in 0-based indexing.
     * If 'target' is not present in the array 'A', return -1.
     *
     * Note: You must write an algorithm whose time complexity is O(LogN)
     *
     * Example:
     * Input: ‘N’ = 7 ‘target’ = 3
     * ‘A’ = [1, 3, 7, 9, 11, 12, 45]
     *
     * Output: 1
     * Explanation: A = [1, 3, 7, 9, 11, 12, 45],
     * The index of element '3' is 1.
     * Hence, the answer is '1'.
     */
    public static int searchTargetElement(int[] nums, int target){
        int start =0, end = nums.length-1;

        while(start <= end){
            int mid = start +(end-start)/2;
            if(nums[mid] == target){
                return mid;
            } else if(target < nums[mid] ){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(searchTargetElement(new int[]{1, 3, 7, 9, 11, 12, 45},3));
    }
}
