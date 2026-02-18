package sorting;

public class BubbleSortC {

    private static void swapC(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr){

        int n = arr.length-1;

        for(int i=0; i < n; i++){
            for(int j = 0; j<n-i; j++){
                if(arr[j] > arr[j+1]){

                    swapC(arr, j, j+1);
                }
            }
        }

    }

    static void main() {
        int[] arr = {64, 25, 12, 22, 11};
        bubbleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
