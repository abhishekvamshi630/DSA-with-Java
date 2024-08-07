class averageOfNum{
    public static void AverageOfThreeNum(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println("The average of three number is ="+ average);
    }

   

    public static void main(String[] args) {
        AverageOfThreeNum(0, 0, 0);
    }
}