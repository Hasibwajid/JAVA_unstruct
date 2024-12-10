package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.DOUBLY_LL.ARRAYS.Arrays;

public class ArraysOperation {
    public static void insertAtStart(int[] arr, int val){
        int ind = arr.length-2;
        for (int i = ind; i >= 0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = val;
    }
    public static void print(int[] arr){
        System.out.print("Your array elements : ");
        for (int i = 0 ; i< arr.length ; i++){
            if (arr[i] != -1) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public static void insertEnd(int[] arr, int val){
        arr[arr.length-1] = val;
    }
    public static void insertBetween(int[] arr, int val , int pos){
        int ind = arr.length-2;

        while (ind >= pos){
            arr[ind+1] = arr[ind];
            ind--;
        }
        arr[pos] = val;
    }

    public static void delete(int[] arr,int ind){
        System.out.println(arr[ind] + " is deleted from index "+ind);

        for (int i = ind; i< arr.length-1; i++){
            arr[i] = arr[i+1];
        }
    }

    public static void search(int[] arr, int val){
        for (int i =0; i< arr.length; i++){
            if (arr[i] == val){
                System.out.println(val+" is found at index "+i);
                return;
            }
        }
        System.out.println(val+" not found in array.");
    }


    public static void reverse(int[] arr){
        System.out.print("Reverse of array is: ");
        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i] != -1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void sortArray(int[] arr){
        for (int i = 0 ; i< arr.length ;i++){
            for (int j = 0 ; j <= i ; j++){
                if (arr[i] < arr[j] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,-1,-1,-1,-1,-1};
        insertAtStart(arr,10);
        insertAtStart(arr,11);
        insertEnd(arr,111);
        insertBetween(arr,999,10);

        delete(arr,5);
        print(arr);
        search(arr,999);

        reverse(arr);

        sortArray(arr);
        print(arr);
    }
}
