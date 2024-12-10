//PRECTICE SET ON IF/ELSE CONDITIONALS
//
// package JAVAFULL;

// import java.util.Scanner;

// public class DAY_1 {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);

//
////        QUESTION 1
//
////        System.out.println("ENter marks per sub :");
////        int marks_per_sub=s.nextInt();
////        int math;
////        int english;
////        int computer;
////        System.out.println("Enter obtain marks in math : ");
////        float maths=s.nextFloat();
////        System.out.println("Enter obtain marks in english : ");
////        float eng=s.nextFloat();
////        System.out.println("Enter obtain marks in computer : ");
////        float comp=s.nextFloat();
////        float avg;
////        avg=(maths+eng+comp)/3.0f;
////        System.out.println("YOUR PERCENTAGE IS "+avg);
////        if (avg>=40 && maths>=33 && eng>=33 && comp>=33){
////            System.out.println("YOU ARE PASS. ");
////        }else {
////            System.out.println("YOU'RE FAIL. ");
////        }
//
//
//
////        QUESTION 2
//
    //    INCOME TAX CALCULATER
    //     double tax;
    //     int taxable =250000;
    //     double in_on_tax_is;
    //  double new_income;

    //    System.out.println("Enter your Annual income : ");
    //     double income=s.nextInt();
    //    if(income<250000){
    //        System.out.println(" our income is tax free .");
    //    }
    //    else if (income>=250000 && income<500000){
    //        in_on_tax_is=income-taxable;
    //        tax= (in_on_tax_is*0.05);
    //        System.out.println("Tax on your income is : "+tax);
    //        new_income=income-tax;
    //        System.out.println("AND YOUR INCOME AFTER TAX DEDUCTION : "+new_income);
    //    }
    //    else if (income<=500000 && income<1000000){
    //        in_on_tax_is=income-taxable;
    //        tax=(in_on_tax_is*0.2);
    //        System.out.println("Tex on your income is : "+tax);
    //        new_income=income-tax;
    //        System.out.println("AND YOUR INCOME AFTER TAX DEDUCTION : "+new_income);
    //    }
    //    else if (income<=1000000){
    //        in_on_tax_is=income-taxable;
    //        tax=(in_on_tax_is*0.3);
    //        System.out.println("Tex on your income is : "+tax);
    //        new_income=income-tax;
    //        System.out.println("AND YOUR INCOME AFTER TAX DEDUCTION : "+new_income);
    //    }



////        QUESTION 43
//
////        int day;
////        System.out.println("Enter num b/w 1 to 7 : ");
////        day=s.nextInt();
////        switch (day){
////            case 1-> System.out.println("Monday");
////            case 2-> System.out.println("Tuesday");
////            case 3-> System.out.println("Wednesday");
////            case 4-> System.out.println("Thursday");
////            case 5-> System.out.println("Friday");
////            case 6-> System.out.println("Saturday");
////            case 7-> System.out.println("Sunday");
////            default -> System.out.println("Sorry! you entered invalid num.");
//
//
////        QUESTION 4
//        //CHECK EITHER LEAP OR NO
//       // STEPS:
//        // To determine whether a year is a leap year, follow these steps:
//
////        1 If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
////        2 If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
////        3 If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
////        4 The year is a leap year (it has 366 days).
////        5 The year is not a leap year (it has 365 days).
////        System.out.println("ENTER YEAR TO CHECK EITHER LEAP OR NOT: ");
////        int year=s.nextInt();
////        if(year%4==0){
////            if (year%100==0){
////                if (year%400==0){
////                    System.out.println(year+ " IS a leap year (it has 366 days). ");
////                }else {
////                    System.out.println(year +" is not a leap year (it has 365 days).");
////                }
////            }else {
////                System.out.println(year + " is a leap year (it has 366 days).");
////            }
////        }else {
////            System.out.println(year+" is not a leap year (it has 365 days).");
////        }
// }}
// 