package JAVAFULL.Binary_search_practice_Q;

public class book_allocation_problem {


//    this function checks if mid is possiable to alloat num of pages to m students
    static boolean isPossible(int[] arr, int n, int m, int mid){
        int studentCount = 1;
        int pageSum = 0;

        for ( int i = 0 ; i < n; i++){
            if (pageSum + arr[i] <= mid){
                pageSum += arr[i];
            }
            else {
                studentCount++;
                if (studentCount > m || arr[i] > mid){
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }

    static int alloatPages(int[] arr, int n, int m){
        int sum =0;
        for (int i = 0; i < n ; i++){
            sum += arr[i];
        }
        int s = 0 , e = sum, mid = s + (e-s)/2, ans = -1;

        while ( s <= e) {
            if (isPossible(arr, n, m, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }

        return mid;
    }
    public static void main(String[] args) {
//        int arr[] = { 10,20,30,40};
//        int m = 2;
//        System.out.println("Minimum number of pages = " +alloatPages(arr,arr.length,m));

//        link of site:
//        https://www.geeksforgeeks.org/allocate-minimum-number-pages/

    }
}
