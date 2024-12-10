package DATA_STRUCTURE_AND_ALGO.Other_Help;


import java.util.Scanner;

public class p1 {


public static void isEqualThree(int a,int b, int c){
    if(a == b && b==c){
        System.out.println("All numbers are equal");
        return;
    }
    if (a != b && a != c && b != c){
        System.out.println("All nums are different");
    }
    else {
        System.out.println("Neither all are same nor different");
    }
    }

    public static void isEqualFour(int a,int b, int c,int d){
        if(a == b && b==c && c ==d){
            System.out.println("All four are equal");
        }
        else  {
            System.out.println("Not equal");
        }
    }
    public static boolean isInRange(double a,double b){
        if(a > 0 && a < 1 && b > 0 && b < 1){
            return true;
        }
        return false;
    }

    public static void surname(String fName, String lName){
        System.out.println(lName.substring(0,1)+"."+fName);
    }

    public static void tax(int salary){
        double tax ;
        if (salary > 1000){
            tax = salary * 0.10;
        }else {
            tax = salary * 0.05;
        }
        System.out.println("Tax on "+ salary +" is :"+ tax);
        System.out.println("net salary is : " + (salary- tax) );
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Ques 1) Check three nums
        System.out.println("Enter num 1 :");
        int a = scan.nextInt();
        System.out.println("Enter num 2 :");
        int b = scan.nextInt();
        System.out.println("Enter num 3 :");
        int c = scan.nextInt();
        isEqualThree(a,b,c);


//        Ques 2) Check four nums
        System.out.println("Enter num 1 :");
        int num1 = scan.nextInt();
        System.out.println("Enter num 2 :");
        int num2 = scan.nextInt();
        System.out.println("Enter num 3 :");
        int num3 = scan.nextInt();
        System.out.println("Enter num 3 :");
        int num4 = scan.nextInt();
        isEqualFour(num1,num2,num3,num4);

//        Ques 3) is both numbers are between 0 and 1
        System.out.println("Enter first num: ");
        double n1 = scan.nextDouble();
        System.out.println("Enter second num: ");
        double n2 = scan.nextDouble();
        System.out.println(isInRange(n1,n2));

//        Ques 4) print surname
        System.out.println("Enter first name: ");
        String f = scan.next();
        System.out.println("Enter second name: ");
        String s = scan.next();
        surname(f, s);


//        Ques 5) tax and net salary
        System.out.println("Enter your salary: ");
        int sal = scan.nextInt();
        tax(sal);


    }
}
