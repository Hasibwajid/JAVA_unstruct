package JAVAFULL.PATTERNS_PROBLEMS;

public class PART_03 {

    static void heading(int q, String n){
        System.out.println("\t\t\t\t QUESTION NO : "+q+" -->> ( "+n+" )");
    }


    static void butterflyPattern(int r){
        for (int i = 1; i <= r; i++){
//            left stars
            for(int j = 1; j<=i; j++){
                System.out.print("*"+" ");
            }
//            spaces
            for(int j = 1 ; j<=2*(r-i); j++){
                System.out.print("  ");
            }
//            right stars
            for(int j = 1; j<=i; j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
//       Bottom part
        for (int i = r; i >= 1; i--){
//            left stars
            for(int j = 1; j<=i; j++){
                System.out.print("*"+" ");
            }
//          spaces
            for(int j = 1 ; j<=2*(r-i); j++){
                System.out.print("  ");
            }
//            right stars
            for(int j = 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }


    static void diamondShape(int r){
        for (int i = 1 ; i <= r; i++ ){
            for (int j = 1 ; j <= (r-i); j++){
                System.out.print("  ");
            }
            for (int j =1; j <= (2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = r ; i >= 1; i-- ){
            for (int j = 1 ; j <= (r-i); j++){
                System.out.print("  ");
            }
            for (int j =1; j <= 2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    static void printA(int r){
        for (int i = r ; i >= 1; i--){
//            for spaces
            for (int j = 1 ; j <= i-1 ; j++){
                System.out.print(" ");
            }
//            for stars
            for (int j = 1; j<= 1; j++){
                System.out.print("* ");
            }

            if (i==2){
                for (int j=1; j<=2;j++){
                    System.out.print("* ");
                }
            }
//            for spaces
            for (int j = 1; j <= (r-i)*2 ; j++){
                if (i==2){
                    continue;
                }else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j<= 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }



    static void paternPalindrome(int r){
        for (int i =1 ; i <= r; i++){
//            for spacees
            for (int j = 1; j <= r-i; j++){
                System.out.print("  ");
            }
//            for right numbers
            int k = 1;
            for (int j = 1; j <= i; j++){
                System.out.print(k+" ");
                k *= 2;
            }
//            for left numbers
            k /=2;
            for (int j = 1; j < i; j++){
                k/=2;
                System.out.print(k + " ");
            }
            System.out.println();
        }


    }




    public static void main(String[] args) {
        heading(1, "BUTTERFLY PATTERN");
        butterflyPattern(4);

        heading(2,"DIAMOND SHAPE");
        diamondShape(4);

        heading(3,"PRINT A");
        printA(4);

        heading(4,"PATERN PALINDROME");
        paternPalindrome(5);
    }
}
