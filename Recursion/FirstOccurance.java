public class FirstOccurance {
    public static int Search(int arr[], int key, int i){
        // checking Base case
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return Search(arr, key, i+1);
        
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 1, 7, 9, 10};
        int key = 11;
        System.out.println(Search(arr, key, 0));
    }
}
