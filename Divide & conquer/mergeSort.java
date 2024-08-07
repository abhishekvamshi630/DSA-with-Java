public class mergeSort{
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void merge_sort(int arr[], int si, int ei){
        // Base case
        if(si >= ei){
            return;
        }
        // taking Mid value
        int mid = si + (ei - si)/2;
        // for left side of arr
        merge_sort(arr, si, mid);
        //for right side of arr
        merge_sort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        // Creating temparary Array
        //(left 0,3 = 4), (Right 4,6) --> 6-0+1
        int tempArr[] = new int[ei - si + 1];
        int i = si; // for left Iterartion
        int j = mid+1; // For Right Iteration
        int k = 0; // Iteration for temparary Array

        // loop for assign sorted array into temparary array
        while (i <= mid && j <= ei) {
            if(arr[i] < arr[j]){
                tempArr[k] = arr[i];
                i++;
            }else{
                tempArr[k] = arr[j];
                j++;
            }
            k++;
        }

        // For remaining sorted Array
        //For left
        while ((i <= mid)) {
            tempArr[k] = arr[i];
            k++;
            i++;
        }
        //For Right
        while ((j <= ei)) {
            tempArr[k] = arr[j];
            k++;
            j++;
        }

        // Copying temparary Arrays to Original Array
        for(k = 0, i = si; k < tempArr.length; k++, i++){
            arr[i] = tempArr[k];
        }
    }
    public static void main(String[] args) {
        int arr [] = {6, 3, 9, 5, 2, 8};
        merge_sort(arr, 0, arr.length-1);
        printArr(arr);
    }
}