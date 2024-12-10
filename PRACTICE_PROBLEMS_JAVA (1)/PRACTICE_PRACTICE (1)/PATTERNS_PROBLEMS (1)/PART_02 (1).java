package JAVAFULL.PATTERNS_PROBLEMS;

public class PART_02 {

    static void heading(int q, String n){
        System.out.println("\t\t\t\t QUESTION NO : "+q+" -->> ( "+n+" )");
    }

    static void solidRhombus(int r){
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= r-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= r; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void numberPyramid(int r) {
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= r-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void palindromicNumberPyramid(int r, int c){
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= r-i ; j++){
                System.out.print("  ");
            }
            for (int j = i ; j >=1  ; j--){
                System.out.print(j+" ");
            }
            for (int j = 2 ; j <= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
    }
    }



    public static void main(String[] args) {

        heading(1,"SOLID RHOMBUS");
        solidRhombus(5);

        heading(2,"NUMBER PYRAMID");
        numberPyramid(5);

        heading(3,"PALINDROME NUMBER PYRAMID");
        palindromicNumberPyramid(5,5);

    }
}
