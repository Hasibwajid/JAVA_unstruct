package DATA_STRUCTURE_AND_ALGO.Heap_DS;
public class MAX_HEAP {
    int[] arr ;
    int size;
    int maxSize;
    public MAX_HEAP(int max){
        this.maxSize = max;
        this.size = 0;
        this.arr = new int[maxSize+1];
        this.arr[0] = Integer.MAX_VALUE;
    }
//    swap val of two indexes of arr(heap)
    public void swap(int x , int y){
        int temp = arr[ x] ;
        arr[ x] = arr[y];
        arr[y] = temp;
    }
//    T_C :: O(log(n))
    public void insert(int data){
        if (size < maxSize){
            size += 1;
            int i = size;
            arr[i] = data;
//            keeping property of max heap ( from last to first element and comparing element with its parent if child is greater than parent replace with parent)
            while ( i > 1){
                int parent = i / 2;
                if ( arr[i] > arr[parent]){
                    swap(i , parent);
                    i = parent;
                }
                else {
                    return;
                }
            }
        }
    }

//    T_C :: O(log(n))
    public void deleteNode(){
        if (size != 0){
//            replace last element to top
            arr[1] = arr[size];
//            make last element un-reachable
            arr[size] = -1;
            size--;
            heapify();
        }
    }

//   T_C :: each call to heapify takes O(log(n)) build heap using heapify  takes O(n)
    public void heapify(){
        for (int i = size/2 ; i >= 1; i--){
            int left = i *2;
            int right = i *2+1;
            if (right< size && left < size && (arr[right] > arr[i] || arr[left] > arr[i])){
                if (arr[right] > arr[left]){
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
    public void printMaxHeap(){
        System.out.println("PARENT \t\tLEFT  \t\tRIGHT  ");
        for(int k = 1; k <= this.size / 2; ++k) {
            int left = k *2;
            int right = k *2 +1;
            System.out.println("" + this.arr[k] + "\t|\t\t" + this.arr[left] + "\t|\t\t" + this.arr[right]+"\t|");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MAX_HEAP h = new MAX_HEAP(5);
        h.insert(10);
        h.insert(20);
        h.insert(25);
        h.insert(22);
        h.insert(90);
        h.printMaxHeap();
        h.deleteNode();
        System.out.println("After Deletion From Max-Heap. \n");
        h.printMaxHeap();
    }
}
