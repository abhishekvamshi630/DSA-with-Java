public class duplicateSting {
    public static void removeDuplicate(String str, StringBuilder newStr, int idx, boolean map[]){
        // base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        // storing string as charecter
        char currChar = str.charAt(idx);

        if(map[currChar - 'a'] == true){
            // remove duplicate
            removeDuplicate(str, newStr, idx+1, map);
        }else{
            map[currChar - 'a'] = true;
            //storing unique string
            removeDuplicate(str, newStr.append(currChar), idx + 1, map);
        }
    }
    public static void main(String[] args) {
        String str = "apnnacollege";
        removeDuplicate(str, new StringBuilder(" "), 0, new boolean[26]);
    }

}
