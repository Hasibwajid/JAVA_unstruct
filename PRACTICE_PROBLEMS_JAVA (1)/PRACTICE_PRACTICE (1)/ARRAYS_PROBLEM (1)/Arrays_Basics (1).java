package JAVAFULL.ARRAYS_PROBLEM;

import java.util.Scanner;

public class Arrays_Basics {
   public static void main(String[] args) {

       Scanner s=new Scanner(System.in);


      // 2D-ARRAY
       int[][] flate=new int[2][3];
       flate[0][0]=101;
       flate[0][1]=102;
       flate[0][2]=103;
       flate[1][0]=201;
       flate[1][1]=202;
       flate[1][2]=203;
       for (int i=0;i<flate.length;i++){
           for (int j=0;j<flate[i].length;j++){
               System.out.print(flate[i][j]+" ");
           }
           System.out.println("");
       }

//        QUESTION >> sum of 5 float in array
       float [] marks={1.2f,1.3f,2.4f,54.5f,45.5f};
       float sum=0;
       for (int i=0;i<marks.length;i++){
           sum +=marks[i];
       }
       System.out.println("sum = "+sum);


// QUESTION >>     write a program to check whether a given int is present in array or not
       float [] numbers={1.2f,1.3f,2.4f,54.5f,45.5f};
       System.out.println("Enter a num: ");
       float n=s.nextFloat();
       float check;
       boolean present=false;
      for (int i=0;i< numbers.length;i++){
          check=numbers[i];
          if(check==n){
              present=true;
          }
      }
      if (present!=false){
          System.out.println(n+" is present in array .");
      }else {
          System.out.println(n +" is not in array .");
      }


      // QUESTION >> AVERAGE OF PHYSICS MARKS OF STD


       int [] phy_marks={73,83,54,55,64};
       int sum1=0;
       for (int e:phy_marks){
           sum1 +=e;
       }
       System.out.println("Average = "+sum1/phy_marks.length);



      // QUESTION >> SUM OF TWO MATRIX OF ORDER 2*3

       int[][] a = {{1,2,3}
                ,{3,2,1}};
       int[][] b = {{1,2,3}
                ,{3,2,1}};
       int[][] c = {{0,0,0}
                ,{0,0,0}};
       System.out.println("RESULTANT MATRIX IS : ");
       for (int i=0;i<a.length;i++){
           for (int j=0;j<a[i].length;j++){
               c[i][j] = a[i][j]+ b[i][j];
               System.out.print(+c[i][j]+" ");
           }
           System.out.println("");
       }



       //QUESTION >>
       int [] a2={1,2,3,4,6,8};
       int l=a2.length;
       int num=Math.floorDiv(a2.length, 2);
       int temp;
       for (int i=0;i<=num;i++){
           temp=a2[i];
           a2[i]=a2[l-i-1];
           a2[l-i-1]=temp;
       }
       System.out.print("Reverse array is = "+a2[0]);
       System.out.print(a2[1]+"");
       System.out.print(a2[2]+" ");
       System.out.print(a2[3]+" ");
       System.out.print(a2[4]+" " );
       System.out.print(a2[5]);



      // QUESTION>> IF ARRAY IS SORTED OR NOT

       int[] arr={4,23,54,2,24,31,11};
       boolean is_sorted=true;
       for (int e:arr){
           if (e>arr[0]){
               is_sorted=false;
                 break;
           }
       }if (is_sorted){
           System.out.println("Array is sorted.");
       }else {
           System.out.println("Array is not sorted.");
       }


       //OR


       int[] arr3={4,5,6,7,8,9};
       boolean is_sorted2=true;
       for (int i=0;i<arr3.length-1;i++){
           if(arr3[i]>arr3[i+1]){
               is_sorted2=false;
               break;
           }
       }if (is_sorted2){
           System.out.println("Array is sorted.");
       }else {
           System.out.println("Array is not sorted.");
       }


     //  QUESTION>> INPUT FROM USER AND CREATE ARRAY

       System.out.println("Enter num of row of your array :");
       int row=s.nextInt();
       System.out.println("Enter a num of colomn of your array :");
       int column=s.nextInt();
       int [][] arr1=new int[row][column];
       for (int i=0;i<row;i++) {
           for (int j = 0; j < column; j++) {
               System.out.println("Enter an element at [" + i + "][" + j + "]");
               arr1[i][j] = s.nextInt();
//                System.out.println("ELE at "+i +j +"is : "+arr[i][j]);
           }
       }     //FOR PRINT AN CREATED ARRAY
           System.out.println("YOUR ARRAY IS: ");
       for (int i=0;i<row;i++){
           for (int j=0;j<column;j++){
               System.out.print(arr1[i][j] +" ");
           }
           System.out.println();
       }


//............................   QUESTION >> PRACTICE    ........................................


       String[] d={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ,"Saturday"};
       for (int i=0;i<d.length;i++){
           System.out.println(d[i]);
       }

//......................................................................................................

      // Write a program that creates an array of 10 elements size. Your program should
     //  prompt the user to input numbers in array and then display the sum of all array elements.


       int[] arr2=new int[10];
       int sum2=0;
       for (int i=0;i<arr.length;i++){
           System.out.println("ENTER AN ELEMENT AT "+i);
           arr2[i]=s.nextInt();
           sum2 +=arr2[i];
       }
       System.out.println("SUm of all element in an array is : "+sum);

     //  ......................................................................................................


      // QUESTION>> The variable list1 and list2 are reference arrays that each have 5 elements. Write code
     //  that copies the values in list1 to list2. Values in list1 are input by user.

       int size=5;
       int[] list1=new int[size];
       int[] list2=new int[size];

       //Ask for value of l1
       System.out.println("ENTER "+ size+" VALUES FOR LIST1 : ");
       for (int i=0;i<size;i++){
           list1[i]=s.nextInt();
       }
       for (int i=0;i<size;i++){
           list2[i]=list1[i];
       }
       //print list 2
       System.out.println("LIST2 is : ");
       for (int i=0;i<list2.length;i++){
           System.out.print(list2[i]+" ");
       }


//update value of array at any index
       int v[] = new int[2];
       v[0] = 1;
       v[1] = 13;
       //       here value at i =0 is 1
       System.out.println(v[0]);
       update(v);
       //       now value at i =0 updated and is 12
       System.out.println(v[0]);
   }

   static void update ( int a[]){
       a[0] = 12;
   }
}
