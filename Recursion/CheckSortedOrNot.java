public class CheckSortedOrNot {
    public static boolean isSorted(int arr[], int i){
        // checking base condition
        if(i == arr.length-1){
            return true;
        }
        //checking for 1st & 2nd Number
        if(arr[i] > arr[i + 1]){
            return false;
        }
        // increament i by 1 = i+1
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {5};
        System.out.println(isSorted(arr, 0));
    }
}
