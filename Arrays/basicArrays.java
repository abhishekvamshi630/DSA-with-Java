import java.util.*;
public class basicArrays {
    public static void main(String[] args) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Maths :"+ marks[0]);
        System.out.println("physic :"+ marks[1]);
        System.out.println("English :"+ marks[2]);

        int percentage = ( marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("Percentage : "+ percentage + "%");
    }
}
