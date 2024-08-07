public class vowelCount{
    public static String count_vowel(String str){
        StringBuilder sb = new StringBuilder(" ");
        Integer count = 0;
        
        for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                            count++;
                        }
                        
        }
        sb.append(count);

            
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "wtmn";
        System.out.println(count_vowel(str));
    }
}