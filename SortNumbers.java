import java.util.*;

public class SortNumbers {
    public static void main(String[] args){
        System.out.printf("Enter in 3 numbers to sort: ");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);

    }
    public static void displaySortedNumbers (double num1, double num2, double num3){
        double[] numbers = { num1, num2, num3};
        int n = numbers.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    //swap
                    double holdV = numbers[j];
                    numbers[j] = numbers[j +1];
                    numbers[j+1] = holdV;

                }
            }
        }
        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));
    }
    //.sort function
    /*public static void displaySortedNumbers(double num1, double num2, double num3){
        double[] numbers ={  num1, num2, num3};
        Arrays.sort(numbers);
        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));
    } */
}


