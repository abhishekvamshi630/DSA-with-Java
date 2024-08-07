public class subString {
    public static String sub_string(String str, int si, int ei){
        String subS = "";
        for(int i = si; i < ei; i++){
            subS += str.charAt(i);
        }
        return subS;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        // System.out.println(sub_string(str, 0, 5));

        // inbuilt function for Sub String

        System.out.println(str.substring(0,5));
    }
}
