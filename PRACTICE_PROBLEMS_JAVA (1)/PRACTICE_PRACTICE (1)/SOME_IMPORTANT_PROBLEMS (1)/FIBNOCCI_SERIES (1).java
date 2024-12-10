package JAVAFULL.SOME_IMPORTANT_PROBLEMS;

import java.util.Scanner;

public class FIBNOCCI_SERIES {

    /*    //    printFibonacci using recursion
    static int n1 = 0, n2 = 1, n3;
    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            printFibonacci(count - 1);
        }
    }*/
    public static void main(String[] args) {

        /*//Fibonacci without recursion
        int first = 0;
        int second = 1 ;
        int third ;
        System.out.print(first+" "+second+" ");
        for(int i = 2; i < 100; i++){
            third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }*/



/*//Fibonacci using recursion
        System.out.print(n1 + " " + n2 + " ");
        int count = 10;
        printFibonacci(count - 2);
        */

//        METHOD 3
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER NUM OF COUNTS FOR FIBNOCCI SERIES: ");
        int count = s.nextInt();
        int n1 = 0, n2 =1;
        System.out.print(n1+" ");
        if (count>1){
            for (int i = 2; i < count; i++){
                System.out.print(n2+" ");

                int temp = n2;
                n2 = n1 + n2;
                n1 = temp;
            }
        }

    }
}
