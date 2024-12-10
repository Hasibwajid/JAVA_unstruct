package DATA_STRUCTURE_AND_ALGO.Heap_DS;

import java.util.Scanner;

class Heap {
    private int[] heapData;
    private int sizeOfHeap;
    private int heapMaxSize;
    private static final int FRONT = 1;

    public Heap(int heapMaxSize) {
        this.heapMaxSize = heapMaxSize;
        this.sizeOfHeap = 0;
        this.heapData = new int[this.heapMaxSize + 1];
        this.heapData[0] = Integer.MIN_VALUE;
    }

    private int getParentPosition(int position) {
        return position / 2;
    }

    private int getLeftChildPosition(int position) {
        return 2 * position;
    }

    private int getRightChildPosition(int position) {
        return 2 * position + 1;
    }

    private boolean checkLeaf(int position) {
        return position > this.sizeOfHeap / 2 ;
    }

    private void swap(int firstNode, int secondNode) {
        int temp = heapData[firstNode];
        this.heapData[firstNode] = this.heapData[secondNode];
        this.heapData[secondNode] = temp;
    }

//    private void minHeapify(int position) {
    public void minHeapify() {
//        if (!this.checkLeaf(position) && (this.heapData[position] > this.heapData[this.getLeftChildPosition(position)] || this.heapData[position] > this.heapData[this.getRightChildPosition(position)])) {
//            if (this.heapData[this.getLeftChildPosition(position)] < this.heapData[this.getRightChildPosition(position)]) {
//                this.swap(position, this.getLeftChildPosition(position));
//                this.minHeapify(this.getLeftChildPosition(position));
//            } else {
//                this.swap(position, this.getRightChildPosition(position));
//                this.minHeapify(this.getRightChildPosition(position));
//            }
//        }
        for (int i = sizeOfHeap/2 ; i >= 1; i--){
            int left = i *2;
            int right = i *2+1;
            if (right < sizeOfHeap && left < sizeOfHeap && (heapData[right] < heapData[i] || heapData[left] < heapData[i])){
                if (heapData[right] < heapData[left]){
                    swap(right , i);
                    i = right;
                }
                else {
                    swap(left , i);
                    i = left;
                }
            }
        }
    }

    public void insertNode(int data) {
        if (this.sizeOfHeap < this.heapMaxSize) {
            this.heapData[++this.sizeOfHeap] = data;

            for (int curr = sizeOfHeap; heapData[curr] < heapData[getParentPosition(curr)]; curr = getParentPosition(curr)){
                swap(curr, getParentPosition(curr));
            }
        }
    }

    public void displayHeap() {
        System.out.println("PARENT NODE\tLEFT NODE\tRIGHT NODE");

        for(int k = 1; k <= this.sizeOfHeap / 2; ++k) {
            System.out.println("" + this.heapData[k] + "\t\t" + this.heapData[2 * k] + "\t\t\t" + this.heapData[2 * k + 1]);
            System.out.println();
        }

    }

//    public void designMinHeap() {
//        for(int position = this.sizeOfHeap / 2; position >= 1; --position) {
////            this.minHeapify(position);
//        }
//    }

    public int removeRoot() {
//        int popElement = this.heapData[1];
//        this.heapData[1] = this.heapData[this.sizeOfHeap--];
////        this.minHeapify(1);
//        minHeapify();
//        return popElement;
        if (sizeOfHeap != 0){
//            replace last element to top
            int h = heapData[1];
            heapData[1] =heapData[sizeOfHeap];
//            make last element un-reachable
            heapData[sizeOfHeap] = -1;
            sizeOfHeap--;
            minHeapify();
            return h;
        }
        return -1;
    }
}


public class MinHeap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of min heap");
        int heapSize = sc.nextInt();
        Heap heapObj = new Heap(heapSize);

        for(int i = 0; i < heapSize; ++i) {
            System.out.println("Enter " + i + " element: ");
            int data = sc.nextInt();
            heapObj.insertNode(data);
        }

        sc.close();
//        heapObj.designMinHeap();
        heapObj.minHeapify();
        System.out.println("The Min Heap is");
        heapObj.displayHeap();
        System.out.println("After removing the min element(RootNode) " + heapObj.removeRoot() + ",Min heap is: ");
        heapObj.displayHeap();

    }
}
