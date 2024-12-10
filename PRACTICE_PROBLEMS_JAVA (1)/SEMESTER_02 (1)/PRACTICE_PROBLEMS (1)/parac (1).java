package PRACTICE_PROBLEMS;


import java.security.Permission;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.util.*;

/*
QUESTION NO 0:
class a{
    int phn =312345;
    double getPhn(){
        System.out.print("received");
        return phn;
    }
}*/
public class parac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*QUESTION NO 0:WHAT WILL BE OUTPUT OF PROGRAM
        a a = new a();
        System.out.print(a.getPhn());
*/



//        QUESTION NO 1
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////


        /*1  TABLE OF NUMBER

        System.out.println("Enter n: ");
        int N = s.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(N+" x "+i+" = "+N*i);
        }
        */


        //        QUESTION NO 2
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
//        2 SERIES like
//        s0= (a+ (2^0 *b)),
//        s1= (a + (2^1 *b) +s0)
//        and soo on .

        System.out.println("how much time you want to run?");
        int t =s.nextInt();#how much time you want to run
        for (int i =1; i<=t; i=i++) {
            int a =s.nextInt();
            int b= s.nextInt();
            int n= s.nextInt();

            for (int j=0;j<n;j++) {
                a += b;
                System.out.print(a+" ");
                b = b*2;
            }
            System.out.println("");
        }
//        2 6 14 30 62 126 254 510 1022 2046
         */

//        QUESTION NO 3
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
//      3 Given an input integer, you must determine which primitive data types are capable of properly storing that input
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte\n* short\n* int\n*long");
                else if(x>= -32768 && x<= 32767)System.out.println("* short \n* int\n* long");
                else if(x>= -2147483648 && x<= 2147483647)System.out.println("* int\n* long");
                else if(x>= -9223372036854775808l &&  x<= 9223372036854775807l)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
                }
*/                                                    //**OR**//
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
//        Instead of memorizing the values, you can do it in a better way:

import java.io.*;
import java.util.*;
        class Solution {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();

                for (int i = 0; i < t; i++) {
                    try {
                        long x = sc.nextLong();
                        System.out.println(x + " can be fitted in:");
                        if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* byte");
                        if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                        if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                        if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
                    } catch (Exception e) {
                        System.out.println(sc.next() + " can't be fitted anywhere.");
                    }

                }
                sc.close();
            }
        }

         */



//        QUESTION NO 5
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        n the code below, the nextDouble() method stops reading at the end of the second line of input, but does not move the Scanner object to the next (third) line. Because of this, the subsequent call to nextLine() reads the rest of the now-empty second line, consuming the newline and moving the Scanner to the beginning of the third line.
         */
        /*
            Scanner s=new Scanner(System.in);
            int i =s.nextInt();
            double d =s.nextDouble();
            sc.nextLine();
            String str =s.nextLine();

            System.out.println("String: " + str);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
         */



//        QUESTION NO 6
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
* ("%-15s%03d%n", s1, x) % : used as a formatter. '-' : minus sign used for left indentation of the string. 15s : here 15 denotes the string's minimum field width 15. '0' : pads the extra 0s in the integer. 3d : here 3 denotes integer's minimum field width 3. %n : prints the new line.
Hope, this helps!
* */
        /*

        Scanner scr=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=scr.next();
            int x=scr.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d %n", s1,x);
        }
        System.out.println("================================");
*/


//        QUESTION NO 7:
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
         * The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
         * */

//        Scanner scr=new Scanner(System.in);
//
//        System.out.println("YOU CAN ENTER AS MUCH LINES OF INPUT AS YOU WANT UNTILL YOU LEFT INPUT BLANK");
//        for (int i=0;scr.hasNextLine() ;i++){
//            String n = scr.nextLine();
//            if (n.isBlank()){
//                System.out.println("YOU LEFT INPUT BLANK! EXITING.....");
//                break;
//            }
//            System.out.println(i+1+" "+n);
//        }


//       QUESTION NO 8
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        You are given a date. You just need to write the method,findDay , which returns the day on that date.
         */
//        System.out.println(findDay(5,10,2022));



        //       QUESTION NO 9
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Currency in = Currency.getInstance("INR");
        Currency us = Currency.getInstance("USD");
        Currency ch = Currency.getInstance("CNY");
        Currency fr = Currency.getInstance("EUR");
//        System.out.println(cur.getCurrencyCode()+" "+cur.getDisplayName());

        System.out.println("US: " + us.getSymbol(Locale.US)+""+payment);
        System.out.println("India: " + "Rs."+payment);
        System.out.println("China: " + ch.getSymbol(Locale.CHINA)+""+payment);
        System.out.println("France: " + payment+""+fr.getSymbol(Locale.FRANCE));*/




//QUESTION 9(correct according to question)
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*                      :::STATEMENT:::
NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values. According to the appropriate Locale's currency.
Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).*/


       /* Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
         *//* Create custom Locale for India.
          I used the "IANA Language Subtag Registry" to find India's country code *//*
        Locale indiaLocale = new Locale("en", "IN");
        Locale pakLocale = new Locale("en","PK");
        *//* Create NumberFormats using Locales *//*
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat pak = NumberFormat.getCurrencyInstance(pakLocale);

        *//* Print output *//*
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
        System.out.println("PAKISTAN: " + pak.format(payment));*/




//        QUESTION NO 10
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
//       PROBLEM ::  Reverse an array upto a given position

//        int b = sc.nextInt();
//        int arr[] ={1,2,3,4,5,6};

//        //reversing
//        for(int i=0;i<b/2;i++){
//            int tem = arr[i];
//            arr[i] = arr[b-i-1];
//            arr[b-i-1] = tem;
//        }
//        //printing
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]+" ");
//        }

        //        QUESTION NO   (UNSOLVED)
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //PROBLEM ::  Reverse an array FROM A GIVEN INDEX TO THE END
//        System.out.println(arr.length);
//        if (b < arr.length) {
//            for (int i = arr.length-1; i >= (b); i--) {
//                int temp = arr[i];
//                arr[i] = arr[i - 1];
//                arr[i - 1] = temp;
//            }
//
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i]+" ");
//            }
//        }








    }




    //       QUESTION NO 8 :: FUNCTION DEFINED
     ////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();



    }
}