public class binaryStrings {
    public static void binary_ns(int n, int lastPlace, String str){
        // base Case
        if(n == 0){
            System.out.println(str);
            return;
        }
        binary_ns(n-1, 0, str+"0");

        if(lastPlace == 0){
            binary_ns(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        binary_ns(3, 0, "");
    
    }
}
