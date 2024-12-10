
package DATA_STRUCTURE_AND_ALGO.GRAPH_DS.Sorting;

public class sorting {

    public static void Selsort(int[] arr){
        for(int i =0; i< arr.length; i++){
            int s = i;
            for (int j =i +1; j< arr.length;j++){
                if(arr[s] > arr[j]){
                    s = j;
                }
            }
            int temp = arr[s];
            arr[s] = arr[i];
            arr[i] = temp;
        }
    }
    public static void Insort(int[] arr){
        for(int i =0; i< arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j +1 ] = temp;
        }
    }

    public static void Bubsort(int[] arr){
        for (int i= 0; i< arr.length;i++){
            for(int j =0; j< arr.length-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }

        }
    }
    public static void main(String[] args) {
        int [] arr ={ 5,33,24,15,13,0,33};
//         Selsort(arr);
//         Insort(arr);
        Bubsort(arr);
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
