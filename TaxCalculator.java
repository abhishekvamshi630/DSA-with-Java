import java.util.*;
public class TaxCalculator {
    public static void main(String args[]){
        double amount;
        double Tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Income amount :");
        amount = sc.nextDouble();

        if( amount < 500000){
            System.out.println("No Tax");
        }
        else if( (amount >= 500000) && (amount <= 1000000 ) ){
            Tax = amount * 0.2;
            System.out.println("Tax with 20% :"+ Tax);
        }else{
            Tax = amount * 0.3;
            System.out.println("Tax with 30% :"+ Tax);
        }
        
    }
}
