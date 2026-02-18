package sorting;

public class SelectionSortC {

    public static void selectionSort(int[] arr){

        int n = arr.length;

        for(int i=n-1; i>0; i--){

            int maxIndex = i;

            for (int j=i-1; j>=0; j--){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

        }


    }

    static void main() {
        int[] arr = {64,25,12,22,11,99};
        selectionSort(arr);

        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
