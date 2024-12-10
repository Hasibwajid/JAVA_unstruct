//package CodewithHarry;
//
//import java.util.Scanner;
//
//public class PS_ON_LOOPS {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);


        //                                    //QUESTION NO 1 #
        //                                 print the folowing patren

//    ****
//    ***
//    **
//    *
        //with while loop

//        System.out.println("Enter  num of rows : ");
//        int n=s.nextInt();
//        int i = n;
//        while (i > 0) {
//            int j = 0;
//            while (j < i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println("\n");
//            i--;
//        }

        //with for loop

//        System.out.println("ENTER NUM OF ROWS : ");
//        int num=s.nextInt();
//        for (int i = num; i > 0; i-- )
//        {
//            for (int j =0 ; j < i ; j++){
//                System.out.print("#");
//            }
//            System.out.println("\n");
//
        //......................................##########################>>>>>>>>>>>>>>>>>>>>>>>>........>>>>>>>>>>>>>>>>>>>>

        //QUESTION NO 2 #
        //                        print  Sum of all even number from 0 to n
//
//        System.out.println("Enter end num : ");
//        int num = s.nextInt();
//        int i = 0;
//        int sum = 0;
//        while( i <= num ) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//            i++;
//        }
//        System.out.println(" THE SUM OF ALL NUMBERS FROM 0 To "+num +" ARE :  "+ sum);
//        sum=sum+(i*2);       //For generate even num
//        sum +=(n*2-1);       //For generate even num

//......................................................../////////.....................................................................

        //QUESTION NO 3 #
        //   Multiplication table

//
//        System.out.println("Enter a num to check its table : ");
//        int n=s.nextInt();
//        System.out.println("Also check for another num   : ");
//        int d=s.nextInt();
//        int i = 1;
//        System.out.println("TABLE OF "+ n+"\t\t\tTABLE oF "+d);
//        while (i <= 10){
//            System.out.println(n +" * "+ i +" = "+ (n*i)+ "   \t|\t  " +d +" * "+ i +" = "+ (d*i) );
//            i++;
//        }
        //sout can also right as bellow
        //System.out.printf("%d X %d = %d \n", n , i ,  n*i );


//............................................................/////////////////////.........................................................................

        //QUESTION NO 4 #
//                       factorial of num

//        System.out.println("Enter a num : ");
//        int n=s.nextInt();
//        int i=1;
//        int fact=1;
//        for (;i<=n;){
//            fact*=i;
//            i++;
//        }
//        System.out.println("Factorial of "+n +" is : "+fact);


//............................................................/////////////////////.........................................................................

        //QUESTION NO 5 #
//                            sum of all the num accuring in multiplu=ication table of 8

//        int n = 8;
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += n * i;
//        }
//        System.out.println(sum);
//
//
//    }}
//............................................................/////////////////////.........................................................................
