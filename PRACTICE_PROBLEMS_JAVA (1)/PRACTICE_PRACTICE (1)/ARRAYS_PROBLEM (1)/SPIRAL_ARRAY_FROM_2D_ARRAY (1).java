package JAVAFULL.ARRAYS_PROBLEM;

import java.util.Scanner;

public class SPIRAL_ARRAY_FROM_2D_ARRAY {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("ENTER NUM OF ROWS: ");
        int n= s.nextInt();
        System.out.println("ENTER NUM OF COLUMNS: ");
        int m= s.nextInt();

        int matrix[][] = new int[n][m];

        System.out.println("ARRAY HAS CREATED ");
        System.out.println("NOW INPUT VALUES FOR EACH INDEX: ");
//        input
        for (int i =0 ;i< matrix.length; i++){
            for (int j =0; j<matrix.length; j++){
                System.out.println("ENTER VALUE FOR INDEX: ["+i+"]["+j+"] : ");
                matrix[i][j] = s.nextInt();
            }
        }

        int row_start = 0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = m-1;


        System.out.println("YOUR SPIRAL ARRAY IS:");
        while (row_start <= row_end && col_start <= col_end){

//            1
            for (int col = col_start; col <= col_end; col++){
                System.out.print(matrix[row_start][col]+" ");
            }

            row_start++;

//            2
            for (int row = row_start ; row <= row_end; row++){
                System.out.print(matrix[row][col_end]+" ");
            }
            col_end--;

//            3
            for (int col = col_end; col >= col_start; col--){
                System.out.print(matrix[row_end][col]+" ");
            }

            row_end--;


//            4
            for (int row = row_end; row >= row_start; row--){
                System.out.print(matrix[row][col_start]);
            }
            col_start++;

        System.out.println();
        }
    }
}
