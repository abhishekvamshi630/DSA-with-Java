public class findKeyElement{
    public static void keyElement(int arr[], int idx, int key){
        // basecase
        if(idx == arr.length){
            return;
        }

        if(arr[idx] == key){
            System.out.print(idx+" ");
        }

        keyElement(arr, idx+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        keyElement(arr, 0, key);
    }
}