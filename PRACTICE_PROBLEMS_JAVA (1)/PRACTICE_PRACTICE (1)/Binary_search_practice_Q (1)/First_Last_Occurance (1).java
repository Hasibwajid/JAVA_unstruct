package JAVAFULL.Binary_search_practice_Q;

import java.util.ArrayList;
import java.util.Scanner;

public class First_Last_Occurance {

    static int firstOccurance(ArrayList<Integer> arr , int element){
        int start =0 ;
        int end = arr.size()-1;
        int mid = start +(end - start)/2;
        int ans = -1;


        while (start <= end ){
            if (arr.get(mid) == element){
                ans = mid;
                end = mid -1 ;
            }
            else if (arr.get(mid) > element){
                end = mid -1 ;
            }
            else if (arr.get(mid) < element){
                start = mid + 1 ;
            }
            mid = start +(end - start)/2;
        }
        return ans;


    }
    static int lastOccurance(ArrayList<Integer> arr , int element){
        int start =0 ;
        int end = arr.size()-1;
        int mid = start +(end - start)/2;
        int ans = -1;


        while (start <= end ){
            if (arr.get(mid) == element){
                ans = mid;
                start = mid +1 ;
            }
            else if (arr.get(mid) > element){
                end = mid -1 ;
            }
            else if (arr.get(mid) < element){
                start = mid + 1 ;
            }
            mid = start +(end - start)/2;
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//       1: find first and last occurance of element in sorted array
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int element = s.nextInt();
        /*int first = 0;
        int last = 0;

        for (int i = 0 ; i< arr.size(); i++){
            if (arr.get(i) == element){
                first = i;
                break;
            }
        }
        int j =first;
        while (arr.get(j +1) == element){
            last = j+1;
            j++;
        }
        System.out.println( first+" "+ last);*/

        System.out.println("first occurance: "+firstOccurance(arr, element));
        System.out.println("last occurance: "+lastOccurance(arr,element));
    }

}
