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
    

public static void displaySortedNumbers(double num1, double num2, double num3){
    double[] numbers ={  num1, num2, num3};
    Arrays.sort(numbers);
    System.out.println("Sorted Numbers: " + Arrays.toString(numbers));
}
}


