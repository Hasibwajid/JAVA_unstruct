package JAVAFULL.OTHERS;

import java.util.Scanner;

public class Decimal_to_binary_Conversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter Decimal number: ");
      /*  int n = s.nextInt();
        int bit ;
        int ans =0;
        int i =0;

         while(n!=0){
             bit = n&1;//this will return 1 fit right most bit is 1 if 0 then return 0
             // now we right shift n upto 1 place so we can check second last bit
             n = n>>1;
             ans += (bit*(Math.pow(10,i)));
             i++;
         }
        System.out.println(ans);*/



//        BINARY TO DECIMAL

        int n = s.nextInt();
        int digit ;
        int ans =0;
        int i =0;

        while(n!=0){
            digit = n%10;//this will return 1 fit right most bit is 1 if 0 then return 0
            // now we right shift n upto 1 place so we can check second last bit
            n = n/ 10;
            if (digit == 1){
            ans += (digit*(Math.pow(2,i)));
            }
            i++;
        }
        System.out.println(ans);
    }
}
