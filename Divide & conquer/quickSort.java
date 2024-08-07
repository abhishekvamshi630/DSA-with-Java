public class quickSort {
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quick_sort(int arr[], int si, int ei){
        //Base Case
        if(si >= ei){
            return;
        }

        //partition
        int pId = partition(arr, si, ei);
        quick_sort(arr, si, pId-1); // for left
        quick_sort(arr, pId+1, ei); // for Right
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
            //Swapping
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            }
        }
        i++;
            //Swapping , setting the pivot element in correct p[osition]
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
    public static void main(String[] args) {
        int arr[] = {6, 4, 2, 3, 7, 6, 8, 1, 9};
        quick_sort(arr, 0, arr.length-1);
        printArr(arr);

    }
}
