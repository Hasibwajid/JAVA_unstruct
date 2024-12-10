package DATA_STRUCTURE_AND_ALGO.TERMINAL_PREP;


import java.util.Scanner;

public class Heap {
   static class minHeap {
       int[] heap;
       int size;
       int maxSize;

       public minHeap(int max) {
           this.size = 0;
           this.maxSize = max;
           this.heap = new int[max+1];
           this.heap[0] = Integer.MIN_VALUE;
       }

       public void swap(int a, int b) {
           int temp = heap[a];
           heap[a] = heap[b];
           heap[b] = temp;
       }

       private int parentPos(int i) {
           return (i / 2);
       }

       private int leftPos(int i) {
           return (i * 2);
       }

       private int rightPos(int i) {
           return (i * 2 + 1);
       }

       public void insert(int d) {
           if (size < maxSize) {
               heap[++size] = d;

               for (int curr = size; heap[curr] < heap[parentPos(curr)]; curr = parentPos(curr)){
                   swap(curr, parentPos(curr));
               }
           }
       }

       public void heapify() {
//           Bottom --> Up heapify
           for (int i = size/2; i >= 1; i--) {
               int left = i * 2;
               int right = i * 2 + 1;

               if (right < size && left < size & heap[right] < heap[i] || heap[left] < heap[i]) {
                   if (heap[left] < heap[right]) {
                       swap(left, i);
                       i = left;
                   } else {
                       swap(right, i);
                       i = right;
                   }
               }
           }
       }

       public int removeRoot( ){
           if (heap.length > 1){
               int deleted = heap[1];
               heap[1] = heap[size];
               heap[size]= -1;
               size--;
               heapify();
               return deleted;
           }
           return -1;
       }

       public void print() {
           System.out.println("Parent\t Left \t Right");
           for (int i = 1; i <= size / 2; i++) {
               int left = i * 2;
               int right = i * 2 + 1;


               System.out.println(heap[i] + "\t\t\t" + heap[left] + "\t\t\t"+ heap[right]);
               System.out.println();
           }
       }
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of min heap");
        int heapSize = sc.nextInt();
        minHeap h = new minHeap(heapSize);

        for(int i = 0; i < heapSize; ++i) {
            System.out.println("Enter " + i + " element: ");
            int data = sc.nextInt();
            h.insert(data);
        }

        sc.close();
        h.heapify();
        System.out.println("The Min Heap is");
        h.print();
        System.out.println("After removing the min element(RootNode) " + h.removeRoot() + ",Min heap is: ");
        h.print();

    }

}

