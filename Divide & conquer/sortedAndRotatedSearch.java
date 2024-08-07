public class sortedAndRotatedSearch {
    public static int searchArrayIndex(int arr[], int target, int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }

        // find the mid value
        int mid = si + (ei-si)/2;

        if(arr[mid] == target){
            return mid;
        }

        // casr-1 on line 1
        if(arr[si] <= ei){
            // case-a on left side of mid on line 1
            if(arr[si] <= target && target <= arr[mid]){
                return searchArrayIndex(arr, target, si, mid);
            }else{
                // right side of line-1
                if(arr[mid] <= target && target <= arr[ei]){
                    return searchArrayIndex(arr, target, mid+1, ei);
                }
            }
        }
        //csae-2 on line-2
        else{
            // right side of line 2
            if(arr[mid] <= arr[ei]){
                return searchArrayIndex(arr, target, mid+1, ei);
            }else{
                //left side of line-2
                return searchArrayIndex(arr, target, si, mid-1);
            }
        }
        return arr[target];
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int target = 6;
        int tarIdx = searchArrayIndex(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
