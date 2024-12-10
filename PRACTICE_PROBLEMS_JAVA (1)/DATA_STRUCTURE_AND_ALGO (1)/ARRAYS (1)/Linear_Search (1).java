package DATA_STRUCTURE_AND_ALGO.ARRAYS;

import java.util.Scanner;

public class Linear_Search {
    static Scanner s = new Scanner(System.in);

    static void linearSearch(int arr[]){
        System.out.println("Enter key: ");
        int key = s.nextInt();
        boolean is_present = false;
        for (int i =0 ; i< arr.length; i++){
            if (arr[i] == key){
                is_present = true;
            }
        }
        if (!is_present){
            System.out.println(key+" is not present in array ");
        }else{
            System.out.println(key+" is present in array ");
        }
    }



    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        linearSearch(arr);




    }
}
