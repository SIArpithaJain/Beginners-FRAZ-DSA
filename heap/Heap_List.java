package samples.heap;

import java.util.ArrayList;

/**
* https://www.youtube.com/watch?v=RU08pp_VPSs&list=PLEJXowNB4kPyP2PdMhOUlTY6GrRIITx28
*/
public class Heap_List {

    static ArrayList<Integer> list;

    public Heap_List(){
        list = new ArrayList<>();
    }
    private static void swap(int first, int second){
        int temp = list.get(first);
        list.set(first ,list.get(second));
        list.set(second,temp);
    }
    public static void heapify(ArrayList<Integer> list, int i){
        int size = list.size();
        int parent = i; // first non-leaf node i.e from down the tree
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < size && list.get(left) > list.get(parent)){
            parent = left;
        }

        if(right < size && list.get(right) > list.get(parent)){
            parent = right;
        }

        if(parent != i){
            swap(parent,i);
            /*int temp = list.get(i);
            list.set(i ,list.get(parent));
            list.set(parent,temp);*/
            heapify(list,parent);
        }
    }

    public static void buildHeap(ArrayList<Integer> list ,int newNum){
        int size = list.size();
        if(size ==0){
            list.add(newNum);
        } else {
            list.add(newNum);
            for (int i = size / 2-1; i >= 0; i--) {
                heapify(list,  i);
            }
        }
    }

    // deleting single data from list/tree
    private static void delete(ArrayList<Integer> list,int num){
        int size = list.size();
        int i;
        for (i = 0; i < size; i++)
        {
            if (num == list.get(i))
                break;
        }
        swap(i,size-1);
        /*int temp = list.get(i);
        list.set(i, list.get(size-1));
        list.set(size-1, temp);*/

        list.remove(size-1);
        for (int j = size / 2 - 1; j >= 0; j--)
        {
            heapify(list, j);
        }
    }

    private static int delete() throws Exception{
        int parent = list.get(0);
        int last =list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            heapify(list,0);
        }
        return parent;
    }

    private static /*ArrayList<Integer>*/void heapSort() throws Exception {
        ArrayList<Integer> data = new ArrayList<>();

       /* while(!list.isEmpty()){
            data.add(delete());
        }
        return data;*/
        for(int i=list.size()-1;i>-1;i--){
            swap(0,i);
            heapify(list,0);
        }
    }

    public static void printList(ArrayList<Integer> list){
        System.out.print("[");
        list.stream().forEach(a -> System.out.print(a +" "));
        System.out.print("]");
    }

    public static void main(String[] args) throws Exception {
        Heap_List heap = new Heap_List();
        heap.buildHeap(list,10);
        heap.buildHeap(list,30);
        heap.buildHeap(list,50);
        heap.buildHeap(list,20);
        heap.buildHeap(list,35);
        heap.buildHeap(list,15);

        printList(list);
        System.out.println();
        heapSort();
        printList(list);
    }
}
