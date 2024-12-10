package JAVAFULL.STRINGS;

import org.w3c.dom.ranges.Range;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class STRING_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       /*
       1 PROBLEM STATEMENT:
       Given two strings of lowercase English letters,  and , perform the following operations:
        Sum the lengths of  and .
                Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
        Capitalize the first letter in  and  and print them on a single line, separated by a space.

        * * a.compareto(b) is : * *
        Character a comes before b alphabetically. Hence output is -ive
        Character b comes after a alphabetically. Hence output is +ive
        Character b are equivalent, hence output is 0.
        */

/*//        SOLUTION

        String a = s.next();
        String b = s.next();

        System.out.println(a.length()+b.length());
        System.out.println(a.compareTo(b) >0 ? "YES" : "NO");
        String A = a.substring(0,1).toUpperCase()+a.substring(1,a.length());
        String B = b.substring(0,1).toUpperCase()+b.substring(1,b.length());
        System.out.println(A+" "+B);*/




        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
       2 PROBLEM STATEMENT:
       remove the whitespaces from outsides the string
       */
       /* String str1 = s.nextLine();
        System.out.println(str1.trim());//All leading and trailing space removed*/


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*//SUBSTRING METHOD
        String A = s.nextLine();
        int st_index  = s.nextInt();
        int en_index  = s.nextInt();
        System.out.print(A.substring(st_index,en_index));*/


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
   3 PROBLEM STATEMENT:
                 *Given a string,s , and an integer,k , complete the function so that it finds the lexicographically smallest
     and largest substrings of length K*/
//        System.out.println(getSmallestAndLargest("welcometojava",3));


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        4 PROBLEM STATEMENT:
        /* */

//        System.out.println(isPalindrome("hah"));

/*//        OR
        String A ="madam";
        int count = 0;
        for(int i=0; i<A.length()/2;i++)
            if( A.charAt(i) == A.charAt(A.length()-i-1)) count++;
        System.out.println( (count == A.length()/2) ? "Yes" : "No") ;*/
/*//        OR
        System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? "YES": "NO");
        */


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       /* 5 PROBLEM STATEMENT:
        if same frequency of each char present and both strings has the same charters contain then strings are anagrams*/

//        System.out.println(isAnagrams("anagramm","marganaa"));


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*//         6 PROBLEM STATEMENT: USE OF SPLIT AND TRIM FUNC
        String str = s.nextLine();
        String delims = "[ !,?._'@]+";
        str = str.trim();
        String[] arrOfStr = str.split(delims);

        int sum =0;
        if (!(str.equals(""))){
        for (String a : arrOfStr) {
                sum++;
            }
        }
        System.out.println(sum);
        for (String a : arrOfStr) {
            System.out.println(a);
        }*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/* // PROBLEM STATEMENT 7:
  //    In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

        int testCases = Integer.parseInt(s.nextLine());
        while(testCases > 0){
            String a = s.nextLine();
            //Write your code
            try{
                Pattern.compile(a);
                System.out.println("Valid");

            }catch(Exception e){
                System.out.println("Invalid");
            }
            testCases--;
        }*/




    }




//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%     SELF DEFINE METHOD     %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//
//    __________________________________________________ OUTSIDE _______________________________________________________//

//    METHOD FOR PROBLEM 3
    public static String getSmallestAndLargest(String s, int k) {
        String sequence = s.substring(0,k);
        String smallest = sequence;
        String largest = sequence;

        for(int i=1 ; i<= s.length()-k ; i++){
            sequence = s.substring(i,(i+k));
            if (sequence.compareTo(smallest) < 0){
                smallest = sequence;
            }else if(sequence.compareTo(largest) > 0){
                largest = sequence;
            }
        }
        return "lexicographically Smallest : "+smallest + "\n" +"lexicographically largest : "+ largest;
    }


//    METHOD FOR PROBLEM 4
    public static boolean isPalindrome(String A){
        String B ="";
        for (int i =A.length()-1 ; i>=0;i--){
            B += A.charAt(i);
        }
        return B .equals(A) ;
    }




//    METHOD FOR PROBLEM 5
    public static boolean isAnagrams(String a,String b){
        if (a.length() != b.length()){
            return false;
        }
      // METHOD 1 USING SORTING
      /*  else{
         if(A != null && B != null) {//v
            char[] a1 = str1.toCharArray();
            char[] a2 = str2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            return Arrays.equals(a1,a2);}
            else{
            return false;
            }
        }*/
      // METHOD 2 USING COUNTING the char in both if same frequency of each char present then anagrams
        else {
            a = a.toLowerCase();
            b = b.toLowerCase();
            int  sum =0;
            for(char ch = 'a'; ch<='z'; ch++){
                for (int i=0;i<a.length(); i++){
                    if (a.charAt(i) == ch){
                        sum++;
                    }if(b.charAt(i) == ch){
                        sum--;
                    }
                }
            if(sum!=0){
                return false;
            }
            }
            return true;
    }
    }



    //METHOD FOR PROBLEM 7



}
