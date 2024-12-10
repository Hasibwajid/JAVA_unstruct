package JAVAFULL.Binary_search_practice_Q;

public class find_pivot_element {
static int getPivot(int[] arr){
    int s =0, e = arr.length-1, mid = s + (e - s)/2;
    while (s < e){
        if (arr[mid] >= arr[0]){
            s = mid+1;
        }
        else {
            e = mid;
        }
        mid = s + (e - s)/2;
    }

    return arr[s];
}


    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,2,4,5};
        System.out.println(getPivot(arr));


    }
}
