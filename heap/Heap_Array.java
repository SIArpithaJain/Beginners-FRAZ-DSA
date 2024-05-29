//{ Driver Code Starts
import java.util.*;

/**
* https://www.geeksforgeeks.org/problems/heap-sort/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
*/
class Heap_Sort
{
    void printArray(int arr[],int n)
    {
        //int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        Heap_Sort hs = new Heap_Sort();
        int arr[] = new int[1000000];
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
                
            Solution ob=new Solution();
            ob.heapSort(arr,n);
            hs.printArray(arr,n);
            T--;
        }
    }
    
}



// } Driver Code Ends


class Solution
{
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
        // Your code here
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        // Your code here
        int parent =i;
        int left = 2*i+1;
        int right = 2*i+2;
        
        if(left <n && arr[left]> arr[parent]){
            parent = left;
        }
        
        if(right < n && arr[right] > arr[parent]){
            parent = right;
        }
        
        if(parent !=i){
            int temp = arr[i];
            arr[i] = arr[parent];
            arr[parent] = temp;
            
            heapify(arr,n,parent);
        }
    }
    
    private int remove(int[] arr){
        int size = arr.length;
        int parent = arr[0];
        int last = arr[size-1];
        
        if(arr.length !=0){
            arr[0]= arr[size-1];
            heapify(arr,size,0);
        }
        return parent;
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n) /*throws Exception*/
    {
       buildHeap(arr,n);
       
       for(int i= n-1;i>=0;i--){
           int temp = arr[0];
           arr[0] = arr[i];
           arr[i] = temp;
           
           heapify(arr,i,0);
       }
    }
 }
 
 
