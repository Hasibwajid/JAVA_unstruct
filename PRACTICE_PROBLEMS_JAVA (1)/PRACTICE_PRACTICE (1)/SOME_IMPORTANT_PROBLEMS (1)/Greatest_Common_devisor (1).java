package JAVAFULL.SOME_IMPORTANT_PROBLEMS;


import java.util.Scanner;

public class Greatest_Common_devisor {
//USING RECURSION
    static int GCD_Recursion(int n1, int n2){
        int min = Math.min(n1,n2);
        int max;
        if (min ==n1){
            max = n2;
        }
        else {
            max =n1;
        }
        if (min != 0){
            return GCD_Recursion(min, max%min);
        }else {
            return max;
        }
    }

//    WITHOUT RECURSION
    static void GCD(int n1, int n2){
        int result = 1 ;
        int min = Math.min(n1,n2);
        for (int i=2 ; i < min ;i++){
            if ((n1 % i ==0 && n2 % i ==0)){
                result = i;
            }else {
                continue;
            }
        }
        System.out.println("WITHOUT USING RECURSION: "+result);
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        With recursion
        int res = GCD_Recursion(60,366);
        System.out.println("USING RECURSION: "+res);


//        Without recursion
        GCD(366,60);

/*//        METHOD 3 (APNA COLLEGE)
        int a = s.nextInt(),b = s.nextInt();
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("GCD is : "+b);*/

    }
}
