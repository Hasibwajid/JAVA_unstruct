package PRACTICE_BASIC;

import Laptop.hpLaptops;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);

        int cout = 0;
        String s=ss.nextLine();
        for (int i=0;i<s.length();i++){
            if (isVowel(s.charAt(i))){
                cout++;
            }
        }
        System.out.println(cout);
    }
    public static boolean isVowel(char i){
        boolean istrue;

        if(i=='a'||i=='i'||i=='o'||i=='u'||i=='e'){
            istrue=true;
        }else{
            istrue=false;
        }
        return istrue;
}}