package CONTEST_PREP;

import java.io.IOException;
import java.util.ArrayList;

public class file1 {
    public static void main(String[] args) throws IOException {

        int[] a = new int[3];
//        reverse arr
       /*
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        for (int i =0 ; i< a.length/2; i++){
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }

        for (int i = 0 ; i< a.length; i++){
            System.out.println(a[i]);
        }*/



//        max of arr
     /*   int max = a[0];
        for (int i =0 ; i< a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println(max);*/



//        sorted or not
      /*  int sort = a[0];
        boolean issort = true;
        for (int i = 0 ; i< a.length; i++){
            if (a[i] < sort){
                issort = false;
            }
        }
        if (issort){
            System.out.println("yes ");
        }else{
            System.out.println("not");
        }*/




//        reverse digit
  /*       int  n = 132;
         Long result = 0l;

         while (n != 0 ){
             Long lastD = n %10l;
             result = result*10 + lastD;
             n = n/10;
         }
        System.out.println("reverse of " +n+ " is "+result);*/


        String p = "geeksforgeeksmadamisapalindrome";
        System.out.println(longestPalSubstr(p));





    }
    static int longestPalSubstr(String str)
    {
        int n = str.length(); // calculcharAting size of string
        if (n < 2)
            return n; // if string is empty then size will be 0.
        // if n==1 then, answer will be 1(single
        // character will always palindrome)

        int maxLength = 1,start=0;
        int low, high;
        for (int i = 0; i < n; i++) {
            low = i - 1;
            high = i + 1;
            while ( high < n && str.charAt(high) == str.charAt(i)) //increment 'high'
                high++;

            while ( low >= 0 && str.charAt(low) == str.charAt(i)) // decrement 'low'
                low--;

            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high) ){
                low--;
                high++;
            }

            int length = high - low - 1;
            if (maxLength < length){
                maxLength = length;
                start=low+1;
            }
        }
        System.out.print("Longest palindrome substring is: ");
        System.out.println(str.substring(start, start + maxLength ));
        return maxLength;

    }

}
