package JAVAFULL.Binary_search_practice_Q;

import java.util.Random;
import java.util.Scanner;

public class cont {
    public static void main(String[] args) {
       Scanner s =  new Scanner(System.in);
        int A, B, X,t,count;
        Random rand = new Random();
        t = s.nextInt();
        for (int i = 0 ; i < t; i++){
            A = s.nextInt();
            B = s.nextInt();


            count = 1;


            // if (B> A){
                X = Math.abs(B - (A+i));
            System.out.println(X);

            // }
            // else {
            //     X = A - B;
            // }
            A = A|X;

            while (true) {
                if(A == B){
                    break;
                }
                else{
                     if(A>B){
                         B = B+1;
                     }else{
                        A = A+1;
                     }

                    count++;
                }
            }
            System.out.println(count);
        }



    }
}
