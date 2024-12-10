package JAVAFULL.Binary_search_practice_Q;

import java.util.Scanner;

public class square_root_using_binary_search {
    static int squareRootIntPart(int num){
        int start = 0;
        int end = num;
        long sqr = -1;
        long mid = start + (end - start)/2;

        while (start <= end){

            if (mid*mid == num){
                return (int) mid;
            }
            else if( mid * mid > num){
                end = (int)(mid -1);
            }
            else {
                sqr = mid;
                start = (int) mid +1;
            }

            mid = start + (end - start)/2;
        }
        return (int)sqr;
    }
    static double morePrecision(int num, int upTO, int digitPart ){
        double ans = digitPart;
        double factor = 1;

        for (int i = 0 ; i < upTO ; i++){
            factor = factor/10;

            for (double j = ans; j*j < num ; j = j+factor){
                ans = j;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int  digitPart = squareRootIntPart(num);
        System.out.println(morePrecision(num,3,digitPart));

    }
}
