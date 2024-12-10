package JAVAFULL.ARRAYS_PROBLEM;

public class BINARY_SEARCH {
    public static void main(String[] args) {

//        Array should be in monotonic form (sorted)
//        time complexity of binary search is = (log N)
         int num = 119;
         boolean found = false;
         int[] arr = {1,2,3,46,98,119,230};
         int start = 0;
         int end = arr.length-1;
         int mid = start + (end - start)/2;


         while(start <= end){
             if (arr[mid] == num){
                 System.out.println(num +" is present at index "+mid);
                 found = true;
             }

             if (arr[mid] > num){
                 end = mid-1;
             }else {
                 start = mid+1;
             }

//             mid = (start+ end)/2; //OR
             mid = start + (end - start)/2;

         }
         if (!found){
             System.out.println("not found");
         }

    }
}
