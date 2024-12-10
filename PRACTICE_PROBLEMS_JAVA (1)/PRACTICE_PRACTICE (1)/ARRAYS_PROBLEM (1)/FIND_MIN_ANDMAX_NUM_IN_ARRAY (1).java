package JAVAFULL.ARRAYS_PROBLEM;

import java.util.Scanner;

public class FIND_MIN_ANDMAX_NUM_IN_ARRAY {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int[] arr = new int[7];

        for (int i = 0 ; i< arr.length; i++){
            arr[i] = s.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0 ;i<arr.length-1;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("MAX VALUE: "+max+"\nMIN VALUE: "+min);
    }
}
