public class tripletNum {
    public static void triple_sum(int number[]){
        for(int i = 0; i < number.length -1 ; i++){
            for(int j= i+1; j < number.length; j++){
                for(int k = j + 1; k < number.length; k++){
                    int summ = number[i]+number[j]+number[k];
                    if(summ==0){
                        System.out.println(number[i] +"," + number[j]+ "," + number[k]);
                    }
                }
            }
        }
       
    }
    public static void main(String[] args) {
        int[] number = {-1, 0, 1, 2, -1, -4, 2};
        triple_sum(number);
    }
}
