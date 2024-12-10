package JAVAFULL.ARRAYS_PROBLEM;
import java.util.Scanner;
public class ARRAY_PRATICE_Q {

/*QUESTION
        Write a menu driven Java program with following option
        a. Accept elements of an array
        b. Display elements of an array
        c. Search the element within array given by user
        d. Sort the array using bubble sort method
        Write methods for all options. The methods should be static and have one parameter name of the arra
*/


    static Scanner s=new Scanner(System.in);
    static int size;
    static int index;


    public static void accept_in(int[] a){
        System.out.println("Enter "+size+" elements :");
        for(int i=0;i<size;i++) {
            a[i] = s.nextInt();
        }

    }


    public static void Display(int[] a){

        for (int i=0;i<size;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }


    public static void search(int[] a){

        System.out.print("Enter element you want to search : ");
        int e=s.nextInt();
        boolean is_found=false;
        for (int i=0;i<size;i++) {
            if (a[i]==e){
                is_found=true;
                index=a[i];

            }
            }if(is_found){
            System.out.println("Search found at position "+ index);
        }else {
            System.out.println("Search not found  ");
        }
    }


    public static void reverse(int[] a){
        int temp;
        int l=a.length;

        int n=Math.floorDiv(l,2);
        for (int i=0;i<n;i++) {
            temp=a[i];
            a[i]=a[l-i-1];
            a[l-i-1]=temp;
        }
        System.out.println("Reverse array is : ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void sort(int[] a){
        int temporary;
        System.out.println("Sorted array is : ");
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1;j++){
            if(a[j]>a[j+1]){
                    temporary=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temporary;
            }
        }}
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
//        System.out.println("Enter the size of array : ");
//        size=s.nextInt();
        int [] list= {30,23,22,55,2,5,4,5};

//        int option;
//
//
//        do {
//            System.out.println("Manu ");
//            System.out.println("1. Accept Array.");
//            System.out.println("2. Display Array.");
//            System.out.println("3. Search element.");
//            System.out.println("4. Get reverse of array.");
//            System.out.println("5. Get sorted array.");
//            System.out.println("6. Exit.");
//
//            System.out.println("Choose option: ");
//            option=s.nextInt();
//            switch (option) {
//                case 1 -> accept_in(list);
//                case 2 -> Display(list);
//                case 3 -> search(list);
//                case 4 -> reverse(list);
//                case 5 -> sort(list);
//
//
//            }
//        }while (option != 6) ;
        sort(list);
    }
//
//
////        QUESTION>>
////
//    //USER DEFINE FUNCTION
//    public static void merge(int[] x,int[] y,int[] z){
//        int temp;
//        //SORT ARRAY Y
//        for (int i=0;i<y.length-1;i++){
//            for (int j=0;j<y.length-1;j++){
//            if(y[j] > y[j+1]) {
//                temp = y[j];
//                y[j] = y[j + 1];
//                y[j + 1] = temp;
//            }
//            }}
//        //PRINT ARRAY X
//        System.out.println("ARRAY x is :");
//        for (int i=0;i<x.length;i++){
//            System.out.println(x[i]);
//        }
//        //PRINT ARRAY Y
//        System.out.println("ARRAY y is after sorting :");
//        for (int i=0;i<y.length;i++){
//            System.out.println(y[i]);
//        }
//
////        // METHOD 1 : MERGING ARRAY X AND Y IN Z
////        System.arraycopy(x,0,z,0,x.length);
////        System.arraycopy(y,0,z,x.length,y.length);
//
//        //ANOTHER METHOD TO MERGING ARRAYS USING FOR EACH LOOP
//        int position=0;
//        for (int e:x){
//            z[position]=e;
//            position++;
//        }for (int e:y){
//            z[position]=e;
//            position++;
//        }
//
//
//        System.out.println("mergeing array of X and Y is : ");
//        for (int i=0;i<z.length;i++){
//            System.out.print( z[i] +" ");
//            }
//    }
//
//        public static void main(String[] args) {
//
//            System.out.println("Enter size of array X :");
//            int size_X=s.nextInt();
//            System.out.println("Enter size of array Y :");
//            int size_Y=s.nextInt();
//            int [] y=new int[size_Y];
//            int [] x=new int[size_X];
//            int [] z=new int[size_X+size_Y];
//
//            System.out.println("Enter element of array X in assending order :");
//           for (int i=0;i<size_X;i++) {
//               x[i] = s.nextInt();
//            }
//            System.out.println("Enter element of array Y in decending order :");
//            for (int i=0;i<size_Y;i++) {
//                y[i] = s.nextInt();
//            }
//            merge(x,y,z);
//

//    QUESTION >>
                     //java Program To Count Total Number Of Notes in Given Amount
//
//    public static void main(String[] args) {
//        int amount;
//
//        int [] notes={1000,500,100,50,20,10,5,1};
//            System.out.println("ENTER AMOUNT : ");
//            amount = s.nextInt();
//        for (int i=0;i<notes.length;i++){
//            System.out.println("Notes of "+notes[i]+" in ammount are : "+amount/notes[i]);
//            amount=amount%notes[i];
//
//        }




//    QUESTION >>









        }

