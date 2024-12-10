package OOPS;

import java.util.Scanner;

public class PS_ON_ERROR_AND_ACCEPTION {



    /*
    //Q : 1
    public static int meth(int a, int b){
        try {
            System.out.println("a * b is :"+a/b);
        }catch (IllegalArgumentException e){
            System.out.println("heheheh");
        }catch (ArithmeticException e){
            System.out.println("hahahha");
        }
        return 1;
    }*/


    //Q:3
    static class maxTriesException extends Exception{
        @Override
        public String toString() {
            return "max tries reached ";
        }

        @Override
        public String getMessage() {
            return "Make sure that you enter valid index";
        }
    }






    public static void main(String[] args) throws maxTriesException {
        //QUESTION  : Write a java program that prints "HaHa" during
        // Arithmetic exception and "HeHe" during an Illegal argument exception.

    /*    Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a=sc.nextInt();
        System.out.println("Enter value of b :");
        int b= sc.nextInt();
        meth(a,b);*/


        //Write a program that allows you to given. If max retries exceed 5 print "errors".

        // Problem 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner Sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
            throw new maxTriesException();
        }




    }
}
