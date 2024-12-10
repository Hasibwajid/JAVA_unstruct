//package JAVAFULL;
//
//
//import java.util.Scanner;
//
//public class METHODS_PS {
//
//    static Scanner s=new Scanner(System.in);
//    //MULTIPLICATION TABLE USING RECURSION
////    static void multiplication_table(int n, int till){
////        if(till>10){
////            return ;
////        }
////        System.out.println(n +" *  "+ till +" = "+n*till );
////        multiplication_table(n,till+1);
////    }
//
//    //METHOD 2
////    static void patern1(int n){
////        if(n>0){
////
////            for (int i=0;i<n;i++){
////                System.out.print("*"+ " ");
////            }
////            System.out.println(); patern1(n-1);
////        }
////    }
//
//
////    //Method 3:
////    static int sum(int n){
////        if(n==1){
////            return 1;
////        }return n + sum(n-1);
////    }
//
//
////    METHOD 4
////    static void  patern_loop(int n){
////        for (int i=0;i<n;i++){
////            for (int j=0;j<n-i;j++){
////                System.out.print("* "+ " ");
////            }
////            System.out.println();
////        }
//        // FOR REVERSE PATERN
////        for (int i=0;i<n;i++){
////            for (int j=0;j<i+1;j++){
////                System.out.print("* "+ " ");
////            }
////            System.out.println();
////        }
////    }
//
//
//
////    MEthod 5:
////    static int fib(int n){
////        if(n==1 || n==2){
////            return n-1;
////        }else {
////            return fib(n-1)+fib(n-2);
////        }
////    }
//
////    METHOD 6
////    static double fahrenheit(double cal){
////        double fahren;
////        fahren=(cal*9/5)+32;
////        return fahren;
////    }
//
//    public static void main(String[] args) {
////        //PROBLEM 1:       MULTIPLICATION TABLE
////        System.out.println("Enter a num : ");
////        int num=s.nextInt();
////        int till=1;
////        multiplication_table(num,till);
//
////        PROBLEM 2: PATERN print
////        System.out.println("Enter num for patern : ");
////        int n=s.nextInt();
////        patern1(n);
//
//
//
////        PROBLEM 3 :  calculate sum of n numbers using recursion
////        System.out.println("Enter value to calculate sum :");
////        int n=s.nextInt();
////        sum(n);
////        System.out.println(sum(n));
//
//
////        PROBLEM 4 :  DRAW PATERN USING LOOP
////        System.out.println("Enter num of row of patern : ");
////        int n=s.nextInt();
////        patern_loop(n);
//
//
//
////        PROBLEM 5 : print nth term of fibnocci numbers using recursion
////        System.out.println("Enter num: ");
////        int num=s.nextInt();
////        int res=fib(num);
////        System.out.println("num at "+num+ "in fibnucci numbers is : "+res);
//
//
//
////        PROBLEM 6:
////        System.out.println("Enter temp in celcius :");
////        double celcius=s.nextDouble();
////        double res=fahrenheit(celcius);
////        System.out.println(celcius +" celcius temp in fahrenheit is : "+res);
//
//
//
////        MCQS
////        String s1 = "abc";
////        String s2 = new String("abc");
////
////        if(s1 == s2)
////            System.out.println(1);
////        else
////            System.out.println(2);
////        if(s1.equals(s2))
////            System.out.println(3);
////        else
////            System.out.println(4);
//
//
//
