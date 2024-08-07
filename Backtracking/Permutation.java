import java.io.FileNotFoundException;

public class Permutation {
    public static void FindPermutation(String str, String ans){
        //Base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // loop for Iteration on each charecter
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            // removing the ith value from String
            String newStr = str.substring(0, i) + str.substring(i+1);
            FindPermutation(newStr, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        FindPermutation(str, " ");
    }
}
