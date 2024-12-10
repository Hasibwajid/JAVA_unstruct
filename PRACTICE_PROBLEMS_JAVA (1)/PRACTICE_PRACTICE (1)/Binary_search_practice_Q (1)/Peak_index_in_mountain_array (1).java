package JAVAFULL.Binary_search_practice_Q;

public class Peak_index_in_mountain_array {
    public static int peakIndexInMountainArray(int[] arr) {
        int start =0; int end = arr.length-1;
        int mid = start + (end - start )/2;

        while (start < end ){

//            if mid is less than mid+1 element than move start to mid+1 index
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }

            mid = start + (end - start)/2;
        }

        return start;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println("index of peak element is: "+peakIndexInMountainArray(arr));

    }
}
