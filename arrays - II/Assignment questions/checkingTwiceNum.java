public class checkingTwiceNum {
    public static boolean checking_Number(int number[]){
        

        for(int i = 0; i < number.length - 1; i++){
            for(int j = i+2; j < number.length; j++){
                if(number[j] == number[i]){
                    return true;
                }
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        int number[] = {2, 1, 5, 4, 9, 2};
        System.out.println(checking_Number(number));

    }
}