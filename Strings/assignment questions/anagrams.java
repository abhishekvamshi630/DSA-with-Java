import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";

        // converting to lower case

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check the lenght of the strings
        if(str1.length() == str2.length()){
            char[] str1ToChar = str1.toCharArray();
            char[] str2ToChar = str2.toCharArray();

            // sort the arraya
            Arrays.sort(str1ToChar);
            Arrays.sort(str2ToChar);

            // checking charecters equal or not

            boolean result = Arrays.equals(str1ToChar, str2ToChar);

            if(result){
                System.out.println(str1 + " and " + str2 + " are Anagrams");
            }else{
                System.out.println(str1 + " and " + str2 + " are  not Anagrams");
            }
        }
    }
}
