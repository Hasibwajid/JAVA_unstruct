package CodewithHarry;

import java.util.Scanner;

public class variable_Argument {
    //if you want to make it compulsary that one argument pass then right as bellow
    //static int sum(int x,int[] ...arr) // after that it should be pass one argument
    static int sum(int ...arr){
        //avaliable as int[] arr
        int result=0;
        for(int a:arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of nothing is : "+sum());
        System.out.println("teh sum of 1 and 2 is : "+sum(1,2));
        System.out.println("teh sum of 1 ,2 and 3 is : "+sum(1,2,3));
        System.out.println("the sum of 1,2,3 and 4 is : "+sum(1,2,3,4));

    }
}
