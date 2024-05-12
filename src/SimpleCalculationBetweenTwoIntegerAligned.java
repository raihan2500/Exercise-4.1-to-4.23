import java.util.Scanner;

public class SimpleCalculationBetweenTwoIntegerAligned {
    public static void main(String[] args) {

        //Input
        Scanner newInput = new Scanner(System.in);
        int firstInteger = newInput.nextInt();
        int secondInteger = newInput.nextInt();

        //Calculation
        int sum = firstInteger + secondInteger;
        int difference = firstInteger - secondInteger;
        int product = firstInteger * secondInteger;
        int average = sum / 2;
        int distance = Math.abs(difference);
        int maximum = Math.max(firstInteger, secondInteger);
        int minimum = Math.min(firstInteger, secondInteger);

        //Print
        System.out.printf("Sum: \t\t %d \n", sum);
        System.out.printf("Difference: %d \n", difference);
        System.out.printf("Product: \t %d \n", product);
        System.out.printf("Average: \t %d \n", average);
        System.out.printf("Distance: \t %d \n", distance);
        System.out.printf("Maximum: \t %d \n", maximum);
        System.out.printf("Minimum: \t %d \n", minimum);

    }

}
