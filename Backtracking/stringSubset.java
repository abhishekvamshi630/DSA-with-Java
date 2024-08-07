public class stringSubset {
    public static void subSests(String str, int i, String ans){
        // Base case
        if(i == str.length()){
            System.out.print(ans+" ");
            return;
        }
        // There are two possible answers for each charecter either Yes or No
        // For Yes
        subSests(str, i+1, ans+str.charAt(i));
        // For no
        subSests(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str = "abcd";
        subSests(str, 0, " ");
    }
}
