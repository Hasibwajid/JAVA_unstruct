package JAVAFULL.PATTERNS_PROBLEMS;

public class PART_01 {

    static void heading(int q, String n){
        System.out.println("\t\t\t\t QUESTION NO : "+q+" -->> ( "+n+" )");
    }

    static void solidRectangle(int r, int c){
        for(int i=1; i<=r; i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


     static void hollowRectangle(int r, int c) {
        for(int i=1; i<=r; i++){
            for(int j=1;j<=c;j++){
                if( i == 1 || j == 1 || i == r || j == c ){
                    System.out.print("*");
                } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
            }
        }

        static void halfPyramid(int r ){
            for (int i=1; i<=r; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        static void invertedHalfPyramid(int r){
        for (int i = r; i >= 1; i--){
            for (int j = 1; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        }

        static void halfPyramidRotated180Deg(int r){
            for (int i = 1 ;i<= r; i++){
                //for spaces
                for (int j=1; j<=r-i ; j++){
                    System.out.print(" ");
                }
                //for stars
                for( int j = 1 ; j <= i ; j++  ){
                    System.out.print("*");
                }

                System.out.println();
            }
        }


        static void halfPyramidWithNum(int r ) {
            for(int i=1; i<=r; i++){
                for (int j=1; j<= i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }


        static void invertedHalfPyramidWithNum(int r){
                for (int i=r; i>=1; i--){
                    for (int j=1; j<=i; j++){
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
        }

        static void floydsTriangle(int r){
                int k = 1;
            for (int i = 1; i<=r ; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print(k+" ");
                    k++;
                }
                System.out.println();
            }
        }


    static void zeroOneTriangle(int r){
        int k ;
        for (int i = 1; i<=r ; i++){
            for (int j = 1; j <= i; j++){
                if((i+j) % 2 == 0 ){
                    k = 1;
                }else {
                    k = 0;
                }
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        heading(1,"SOLID RECTANGLE");
        solidRectangle(4,5);


        heading(2,"HOLLOW RECTANGLE");
        hollowRectangle(4,5);


        heading(3,"HALF PYRAMID");
        halfPyramid(4);


        heading(4,"INVERTED HALF PYRAMID");
        invertedHalfPyramid(4);


        heading(5, "HALF PYRAMID ROTATED 180 DEGREES");
        halfPyramidRotated180Deg(4);


        heading(6,"HALF PYRAMID WITH NUMBERS");
        halfPyramidWithNum(4);


        heading(7, "INVERTED HALF PYRAMID WITH NUMBERS");
        invertedHalfPyramidWithNum(4);


        heading(8,"FLOYD's TRIANGLE");
        floydsTriangle(5);


        heading(9,"O - 1 TRIANGLE ");
        zeroOneTriangle(5);
    }


}
