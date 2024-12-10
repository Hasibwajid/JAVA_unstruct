package JAVAFULL.ARRAYS_PROBLEM;

public class Find_Unique_And_Duplicate_Element {
    public static void main(String[] args) {
        int arr2[] = {1, 2, 3, 4, 5, 4, 12, 3, 2, 1, 2, 15, 20};
        int count[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};


//        Question: you will have array which have all elements with 2 occurrence except one of element which will have only one  you have to print that  unique element
        int ninja[] = {1,2,3,9,9,2,1};
       int ans =0;
        for (int i=0 ; i< ninja.length; i++){
//            ^ means XOR => 1^1 =0 ; 2^2 = 0 ; x^0 = x(x can be any real num)
            ans = ans^ninja[i];
        }
        System.out.println(ans);



         for (int i = 0; i< arr2.length ; i++){
            for (int j = 0; j < arr2.length ; j++){
                if (i != j) {
                    if (arr2[i] == arr2[j] ) {
                        count[i] ++;
                    }
                }
            }
        }


        System.out.println("The unique elements/element in an array are/is: ");
        for (int i =0 ; i< count.length ; i++){
//                For unique
            if (count[i] == 1){
                System.out.print(arr2[i]+" ");
            }
//                    For duplicates
            if (count[i] > 1){
                System.out.print(arr2[i]+" ");
            }
        }
//        DUPLICATE
        int[] ninja2 = {1, 2, 9,  2, 5, 5, 1};
        int ans1 = 0;
        for (int i=0 ; i< ninja2.length; i++){
//            ^ means XOR => 1^1 =0 ; 2^2 = 0 ; x^0 = x(x can be any real num)
            ans1 = ans1^ninja2[i];
        }

        System.out.println(ans1);
    }



}
