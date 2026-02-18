package sorting;

public class SelectionSortC {

    public static void selectionSortMin(int[] arr){

        int n = arr.length;

        for(int i=0; i<n-1; i++){

            int minIndex = i;

            for (int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }


    }

    public static void selectionSortMax(int[] arr){

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

    public static void selectionSortMaxDesc(int[] arr){

        int n = arr.length;

        for(int i=0; i<n-1; i++){

            int maxIndex = i;

            for (int j=i+1; j<n; j++){
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
        int[] arr = {64,25,12,22,11};
//        selectionSortMin(arr);
//        selectionSortMax(arr);
        selectionSortMaxDesc(arr);

        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
