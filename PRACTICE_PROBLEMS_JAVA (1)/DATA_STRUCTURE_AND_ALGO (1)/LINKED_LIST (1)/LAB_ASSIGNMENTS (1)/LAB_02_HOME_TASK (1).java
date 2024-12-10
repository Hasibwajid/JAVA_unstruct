package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.LAB_ASSIGNMENTS;

import java.util.ArrayList;
import java.util.Scanner;

public class LAB_02_HOME_TASK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        1 (FIND SMMALEST AND LARGEST)
        int arr[] = new int[10];
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i =0 ; i< 10; i++){
            System.out.println("Enter value "+(i+1) +" : ");
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < 10; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
            }
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("smallest is: "+smallest+" and largest is: "+largest);



//        2 ( store prime num in array also count num of primes in range(100 ==> 500)
        int count = 0;
        ArrayList<Integer> arrPrime = new ArrayList<>();
        for(int i =100 ; i < 500 ; i++){
            for(int j = 2; j < i ; j++){
                if (i % j == 0){
                    break;
                }else {
                    if (j == (i-1)){
                        count++;
                        arrPrime.add(i);
                    }}}}
//        to print array of prime
        System.out.println("all "+count+" prime ints from 100 to 500 are: ");
        for (int i = 0 ; i < arrPrime.size(); i++)
        {
            System.out.print(arrPrime.get(i)+" , ");
        }



//        3 ( input n from user and print all fibnochi series of that range and store all in array then print)
        System.out.println("enter a number: ");
        int n = s.nextInt();
        int first = 0;
        int second = 1;
        int third;
        int [] arrFib = new int[n];

//        System.out.print(first+" "+ second+" ");
        arrFib[0] = first;
        arrFib[1] = second;
        for (int i = 2; i< n; i++ ){
            third = first+second;
            arrFib[i] = third;
//            System.out.print(third+" ");
            first = second;
            second = third;
        }

//        print fibnochi from array
        for (int i = 0; i < arrFib.length; i++){
            System.out.print(arrFib[i]+" ");
        }


        int [] arrDuplicate = {1,2,35,2,2,7,89,54,2,35};

        for (int i = 0 ; i < arrDuplicate.length ; i++){
            for (int j = i+1 ; j < arrDuplicate.length ; j++){
                if (arrDuplicate[i] == arrDuplicate[j] ){
                    System.out.println(arrDuplicate[j]);
                    break;
                }
            }
        }


    }
}
