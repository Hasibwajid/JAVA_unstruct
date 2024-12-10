package DATA_STRUCTURE_AND_ALGO.TERMINAL_PREP;

public class MergeSort_B {

    public void merge(int s, int e, int[] arr){
        int mid = (s + e)/2;

        int left = (mid - s +1);
        int right = (e - mid);

//        create sub arrays
        int[] leftArr = new int[left];
        int[] rightArr = new int[right];



//        copying array elements in sub arrays
        for (int i = 0; i< left; i++){
            leftArr[i] = arr[s+i];
        }
        for (int i = 0; i< right; i++){
            rightArr[i] = arr[mid+1+i];
        }


//        sort sub arrays
//        Merge to sorted array
        int index1 = 0, index2 = 0;
        int k = s;

        while (index1 < left && index2 < right){
            if (leftArr[index1] < rightArr[index2]){
                arr[k] = leftArr[index1];
                index1++;
            }else {
                arr[k] = rightArr[index2];
                index2++;
            }
            k++;
        }
//        if left arr has
        while (index1 < left){
            arr[k++] = leftArr[index1++];
        }
        while (index2 < right){
            arr[k++] = rightArr[index2++];
        }



    }

    public void mergeSort(int s, int e, int[] arr){

//        Base case
        if (s>= e){
            return;
        }

        int mid = (s + e)/2;
//        left part sort karen
        mergeSort(s,mid , arr);
//        right part sort karen
        mergeSort(mid+1, e, arr);
//        merge
        merge( s, e, arr);

    }

    public static void main(String[] args) {
        int[] arr = { 20,15,100,30,10,12,5,12};
        MergeSort_B o = new MergeSort_B();
        o.mergeSort(0, arr.length-1,arr );

        for (int e : arr){
            System.out.print(e+" ");
        }
    }
}
