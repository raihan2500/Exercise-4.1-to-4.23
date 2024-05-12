import java.util.Scanner;

public class RectangleCalculation {
    public static void main(String[] args) {

        //Input
        Scanner newInput = new Scanner(System.in);
        double height = newInput.nextDouble();
        double width = newInput.nextDouble();

        //Calculation
        double area = height * width;
        double perimeter = 2  * (height + width);
        double diagonalLength = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

    }
}
