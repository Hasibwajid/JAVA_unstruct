package CodewithHarry;

import java.util.Scanner;

public class Do_While_Loop {
   public static void main(String[] args) {
   Scanner i=new Scanner(System.in);
   System.out.println("Enter a num  : ");
   int num=i.nextInt();
   int c=1;
   do{
       System.out.println(c);
       c++;
   }while (c<=num);



}}
