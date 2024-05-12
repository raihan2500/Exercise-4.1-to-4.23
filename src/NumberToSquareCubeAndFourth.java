import java.util.Scanner;

public class NumberToSquareCubeAndFourth {
    public static void main(String[] args) {
        //Input
        Scanner newInput = new Scanner(System.in);
        double number = newInput.nextDouble();

        //Calculation
        double square = number * number;
        double cube = square * number;
        double fourth = Math.pow(number, 4);

        //Output
        System.out.printf("Square = %.4f \n", square);
        System.out.printf("Cube = %.4f \n", cube);
        System.out.printf("Fourth = %.4f \n", fourth);
    }
}
