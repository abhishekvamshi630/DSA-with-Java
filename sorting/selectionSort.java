public class selectionSort {
    public static void selection_sort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
                
            }
            // swapping
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
            
            
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        selection_sort(arr);
    }
}
