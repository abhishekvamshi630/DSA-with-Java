// public class revNum {
//     public static void main(String[] args) {
//         int num = 120801;

//         while (num > 0){
//             int lastDigit = num %10;
//             System.out.print(lastDigit);
//             num/=10;
//         } {
            
//         }
//     }
// }


public class revNum {
    public static void main(String[] args) {
        int num = 120801;
        int rev = 0;

        while (num > 0){
            int lastDigit =num %10;
            rev = (rev * 10) + lastDigit;
            num /= 10;
           
        } 
        System.out.println(rev);
    }
}
