package DATA_STRUCTURE_AND_ALGO.TERMINAL_PREP;

import java.util.Scanner;

public class MergeSort {

    public void merge(int[] arr ,int start, int end ,int mid){
        int left = mid - start +1;
        int right = end - mid;

        int[] leftArr= new int[left];
        int[] rightArr= new int[right];

        for (int i=0; i< left; i++){
            leftArr[ i] = arr[start+i];
        }

        for (int i=0; i< right;i++){
            rightArr[i] = arr[mid+1+i];
        }

        int i=0, j=0, k=start;

        while (i < left && j < right){
            if (leftArr [i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < left) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
    }

    public void sort(int[] arr, int start, int end){
        if (start < end) {
            int mid = (start+ end)/2;
            sort(arr,start,mid);
            sort(arr,mid+1, end);
            merge(arr, start,end, mid);
        }
    }


    public static void main(String[] args) {
        int[] arr = { 20,15,100,30,10,12,5,12};
        MergeSort o = new MergeSort();
        o.sort(arr, 0, arr.length-1 );

        for (int e : arr){
            System.out.print(e+" ");
        }
    }

}
