import java.util.*;
public class palindrome {
    public static boolean check_palindrome(String name){
        int i = 0;
        int j = name.length()-1;

        while(i < j){
            if(name.charAt(i) == name.charAt(j)){
                return true;
            }
            i++;
            j--;

        }
        return false;
    }

    // second approach
    
    public static boolean sendApproach(String name){
        for(int i=0; i < name.length()/2; i++){
            int n = name.length();
            if(name.charAt(i) != name.charAt(n-1-i)){
                // not a palindrome
                return false;
            }
        }
        return true;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter name : ");
        String name = sc.nextLine();
        System.out.println(sendApproach(name));
     }
}