//package JAVAFULL;
//
//import java.util.Scanner;
//
//public class LOOP_PRACTICE {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//
////       QUESTION     //REVERSE A NUM
////    int rev=0;
//
////        System.out.println("ENter any num : ");
////        int n=s.nextInt();
////        for (int i=0;n>0;i++) {
////            rev = (rev * 10) + n % 10;
////            n = n / 10;
////        }
////        System.out.println("Reverse of num is "+rev);
//
////        while (n>0){
////            rev=(rev*10)+n%10;
////            n=n/10;
////        }System.out.println("Reverse of "+n +" is "+rev);
//
//
////        QUESTION
////        int result=1;
////        System.out.println("ENTER BASE NUM : " );
////        int base=s.nextInt();
////        System.out.println("ENTER POWER NUM : ");
////        int power=s.nextInt();
////        for(int i=0;i<power;i++){
////             result *=base;
////        }
////        System.out.println(base+" of power "+power +" is :"+result);
////
//
////        System.out.println("ENter a num :");
////        int n=s.nextInt();
////        int e_sum=0;
////        int o_sum=0;
////        for (int i=0;i<n;i++){
////            if(i%2!=0){
////                o_sum +=i;
////            }else {
////                e_sum +=i;
////            }
////        }
////        System.out.println("SUm of all even no is = "+e_sum);
////        System.out.println("Sum of all odd no is = "+o_sum);
//
//
////        QUESTION  :    Write a program that reads a set of integers, and then prints the
////                       sum of the even and odd integers.
////        int n;
////        int e_sum=0;
////        int o_sum=0;
////        char choice;
////        do {
////            System.out.println("Enter a num: ");
////            n=s.nextInt();
////
////            if(n %2==0){
////                e_sum +=n;
////            }else {
////                o_sum +=n;
////            }
////
////            System.out.println("Do you want to continue y/n ? ");
////            choice=s.next().charAt(0);
////        }while (choice=='y' || choice=='Y');
////
////        System.out.println("Sum of even nums : "+e_sum);
////        System.out.println("sum of odd nums : "+o_sum);
//
//
////        Write a program that prompts the user to input a positive integer. It should then output
////        a message indicating whether the number is a prime number.
////        System.out.println("Enter a positive num to check if prime.");
////        int num=s.nextInt();
////        boolean is_prime=true;
////        for (int i=2;i<=num/2;++i){
////            //condition for non prime
////            if (num%i==0){
////                is_prime=false;
////                break;
////            }
////        }
////        if (is_prime==true){
////            System.out.println(num+" is a prime");
////        }else {
////            System.out.println(num+ " is not prime ");
////        }
//
//
////        QUESTION
//        //FIND HCF OF TWO NUMBERS GIVEN BY USER
////        int devidend,devisor;
////        System.out.println("Enter first num : ");
////        devidend=s.nextInt();
////        System.out.println("ENter second num : ");
////        devisor=s.nextInt();
////        int reminder=0;
////        int hcf=0;
////
////         do{
////            reminder=devidend % devisor;
////            if(reminder==0){
////                hcf=devisor;
////            }else {
////                devidend=devisor;
////                devisor=reminder;
////            }
////        }while (reminder!=0);
////        System.out.println("Hcf is : "+hcf);
//
//
////        QUESTION
////        Write a program to enter the numbers till the user wants and at
////        the end the program should display the largest and smallest numbers entered.
////        int max=Integer.MIN_VALUE;
////        int min=Integer.MAX_VALUE;
////
////        char choice;
////        for (int i=0;;i++){
////            System.out.println("enter a num : ");
////            int n=s.nextInt();
////            if(n>max){
////                max=n;
////            }if(n<min) {
////                min=n;
////            }
////            System.out.println("Do you want to continue y/n ? ");
////            choice=s.next().charAt(0);
////            if(choice=='n' || choice =='N'){
////                break;
////            }
////        }
////        System.out.println("Max of numbers is : "+max);
////        System.out.println("Min of numbers is : "+min);
//
//
////        Fibonacci series
//
////        0 1 1 2 3 5 8 13.......
////        int number;
////        number=s.nextInt();
////        int first_term=0;
////        int second_term=1;
////        int third_trem;
////        System.out.print(first_term+" "+second_term+" ");
////        for ( int i=0;i<number;i++){
////            third_trem=first_term+second_term;
////            System.out.print(third_trem+" ");
////            first_term=second_term;
////            second_term=third_trem;
////        }
//
//
//
////        QUESTION
//
////        ARMSTRONG SERIES
////        int number=s.nextInt();
////        int copy_n=number;
////        int x=number;
////        int cout=0;
////        while (copy_n>0){
////            cout +=1;
////            copy_n=copy_n/10;
////        }
////        int digit;
////        int sum=0;
////
////        for(int i=0;number>0;i++){
////          digit=number%10;
////          int pro=1;
////          for(int j=0;j<cout;j++){
////              pro *=digit;
////          }
////          sum +=pro;
////          number=number/10; // it'll deduct the right most digit of number
////
////
////        }if(sum==x){
////            System.out.println(x+" is armstrong number ");
////        }else {
////            System.out.println(x+" is not armstrong number.");
////        }
////
//
//
////        QUESTION
////        Write a program to calculate the sum of following series where n is input by user.
////        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
//
////        System.out.println("enter a series of num : ");
////        int n=s.nextInt();
////        double sum=0;
////        for (int i=1;i<=n;i++){
////            sum +=1.0/i;
////        }
////        System.out.println("sum of series : "+sum);
////
//
//
//
////        QUESTION  >> Compute the natural logarithm of 2, by adding up to n terms in the series
////                     1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
////                     where n is a positive integer and input by user.
//
////        System.out.println("Enter a num : ");
////        int num=s.nextInt();
////        double sum=0;
////        int sign=1;
////        for (int i=1;i<=num;i++){
////           sum +=(0.1*sign)/i;
////           sign *=-1;
////        }
////
////        System.out.println("LN 2 IS "+sum);
//
//
////        QUESTION >> GUESS A NUM
////        int num=13;
////
////        for (int i=0;i!=num;i++) {
////            System.out.println("GUESS A NUM : ");
////            int g_n=s.nextInt();
////            if(g_n==num){
////                System.out.println("YOU GUESS A CORRECT. AND THE NUM WAS : "+g_n);
////                break;
////            }else if(g_n>num){
////                System.out.println("you guess a larger num please guess again .");
////            }else {
////                System.out.println("you guess a smaller num please guess again .");
////            }
////        }
//
//
////        QUESTION >> patern draw
////**********
////**********
////**********
////**********
//
//
////        for(int i=0;i<5;i++){
////            for (int j=0;j<10;j++){
////                System.out.print("*"+ " ");
////            }
////            System.out.println("\n");
////        }
//
//
//
//
////        QUESTION >> patern draw
////*
////**
////***
////****
////*****
////
////        for(int i=1;i<=5;i++){
////            for (int j=0;j<i;j++){
////                System.out.print("*"+ " ");
////            }
////            System.out.println("\n");
////        }
//
//
//
////        QUESTION >> patern draw
////* * * * *
////-
////* * * *
////
////* * *
////
////* *
////
////*
//
////        for(int i=1;i<=5;i++){
////            for (int j=0;j<5-i+1;j++){
////                System.out.print("*"+ " ");
////            }
////            System.out.println("\n");
////        }
//
//
//
//
////        QUESTION >> patern draw
////    *
////   **
////  ***
//// ****
////*****
////        for(int i=1;i<=5;i++){
////            for (int sp=1;sp<5-i+1;sp++){
////                System.out.print(" ");}
////                for (int j=0;j<i;j++){
////                System.out.print("*");
////            }
////            System.out.println("\n");
////        }
//
//
////        QUESTION >> patern draw
////       *
////      ***
////     *****
////    *******
////   *********
////        for (int i=1;i<=5;i++){
////            for (int k=1;k<=5-i+1;k++){
////                System.out.print(" ");
////            }for (int j=0;j<i*2-1;){
////                System.out.print("*");
////                j=j+1;
////            }
////            System.out.println("\n");
//
//
//
////        QUESTION >> patern draw
////          1
////         222
////        33333
////       4444444
////      555555555
////
//
////
////         1
////        212
////       32123
////      4321234
////     543212345
//
//
//        }
//
//
//    }
