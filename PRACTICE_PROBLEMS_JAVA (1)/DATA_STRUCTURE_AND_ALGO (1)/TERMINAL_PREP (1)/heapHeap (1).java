package DATA_STRUCTURE_AND_ALGO.TERMINAL_PREP;

import java.util.Scanner;

public class heapHeap {
    static class heap {
        int size;
        int mazSize;
        int arr[];

        public heap(int size){
            this.mazSize = size;
            this.arr = new int[mazSize+1];
            this.size = 0;
            arr[0] = Integer.MAX_VALUE;
        }

        private void swap(int[] arr, int a , int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b]= temp;
        }

        public void insert(int data){
            if (size < mazSize ){
                arr[++size] = data;
            }

            for (int curr = size; arr[curr] > arr[curr/2]; curr = (curr/2)){
                swap(arr,curr, (curr/2));
            }
        }

        public void heapify(){
            for (int i = size/2 ; i >0; i--){
                int left = i *2;
                int right = i*2+1;
                if (left < mazSize && right< mazSize && arr[left] > arr[i] || arr[right] > arr[i]){
                    if (arr[left] > arr[right]){
                        swap(arr, left,i);
                        i = left;
                    }
                    else {
                        swap(arr, right,i);
                        i = right;
                    }
                }
            }
        }

        public void remove(){
            if (arr.length > 0){
                arr[1] = arr[size];
                arr[size] = -1;
                size--;
                heapify();
            }
        }
        public void print() {
            System.out.println("Parent\t Left \t Right");
            for (int i = 1; i <= size / 2; i++) {
                int left = i * 2;
                int right = i * 2 + 1;


                System.out.println(arr[i] + "\t\t\t" +arr[left] + "\t\t\t"+ arr[right]);
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        heapHeap.heap h = new heapHeap.heap(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of min heap");
        int heapSize = sc.nextInt();

        for(int i = 0; i < heapSize; ++i) {
            System.out.println("Enter " + i + " element: ");
            int data = sc.nextInt();
            h.insert(data);
        }

        sc.close();
        h.heapify();
        System.out.println("The Min Heap is");
        h.print();
        System.out.println("After removing the min element(RootNode) ,Min heap is: ");
        h.remove();
        h.print();
    }

}
