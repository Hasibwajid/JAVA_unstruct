package DATA_STRUCTURE_AND_ALGO.TERMINAL_PREP;

public class Sorting_Algos {

    private void swap(int a, int b, int [] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
//    Bubble
    public void bubbleSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            for (int j = 0; j < arr.length-i; j++){
                if (arr[j] > arr[j+1]){
                    swap(j, j+1, arr);
                }
            }
        }
    }
//    Selection
    public void selectionSort(int [] arr){
        for (int i = 0 ; i< arr.length ; i++){
            int minIdx = i;
            for (int j = i+1; j < arr.length ; j++){
                if (arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            swap(minIdx, i, arr);
        }
    }
//  Insertion
    public void insertionSort(int[] arr){
        for (int i = 1; i< arr.length; i++){
            int temp = arr[i];
            int j = i-1;
           while (j >= 0 && arr[j] > temp)
           {
               //Shift and make empty space for insert
                    arr[j+1] = arr[j];
                    j--;
                }
            //insert to right place
            arr[j+1] = temp;
        }
    }
//    Merge
    

    public static void main(String[] args) {
        int[] arr = {3,4,2,5,1,30,0};
        Sorting_Algos o = new Sorting_Algos();
/*
        o.bubbleSort(arr);
        o.selectionSort(arr);
*/

        o.insertionSort(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
