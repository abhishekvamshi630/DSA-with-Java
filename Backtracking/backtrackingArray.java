public class backtrackingArray{
    public static void changeArr(int arr[], int i, int value){
        //Base Case
        if(i == arr.length){
            printArr(arr);
            return;
        }

        // Recursion
        // Assining  the value to the arr[i] Index
        arr[i] = value;
        //moving to the next Index and assing the new Value
        changeArr(arr, i+1, value+1);
        arr[i] = arr[i]-2;

    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}