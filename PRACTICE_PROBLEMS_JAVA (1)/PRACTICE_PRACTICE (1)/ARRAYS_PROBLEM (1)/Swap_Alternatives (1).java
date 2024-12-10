package JAVAFULL.ARRAYS_PROBLEM;

public class Swap_Alternatives {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,9,6,16};

        for (int i =0; i< arr.length ; i = i+2){
            if (i+1 < arr.length) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("Sorted(Alternatives) of array is: ");
        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
