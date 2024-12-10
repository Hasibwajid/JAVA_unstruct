package JAVAFULL.Binary_search_practice_Q;
import java.util.Arrays;

public class aggressive_cows {

    static boolean isPossible(int[]  arr ,int n,int k, int mid ){
        int cowsCount = 1;
        int lastPos = arr[0];

        for (int i =0; i< n; i++){
            if ( arr[i] - lastPos >=  mid)
            {
                cowsCount++;
                lastPos = arr[i];
                if (cowsCount >= k){
                    return true;
                }
            }
        }
        return false;
    }

    static int findLargestDistance(int[]  arr ,int n,int k){

        //To sort array
        Arrays.sort(arr);

        int s = 0, max = Integer.MIN_VALUE,sum =0, ans = -1;

        for (int i =0; i < arr.length; i++){
            sum += arr[i];
        }

        //        here end value doesnot matter you can take max or sum
        int e = sum, mid = s + (e - s)/2;

        while (s <= e){
            if (isPossible(arr,n,k,mid)){
                ans = mid;
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }

            mid = s + (e - s)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 6,1,3,4,2};
        int k = 2;
        System.out.println("Maximum Distance B/W Aggressive Cows is = " +findLargestDistance(arr,arr.length,k));

    }
}
