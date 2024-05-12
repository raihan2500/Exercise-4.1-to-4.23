import java.util.Scanner;

public class RadiusToAreaAndVolumeOfCircle {
    public static void main(String[] args) {

        //Input
        Scanner newInput = new Scanner(System.in);
        double radius = newInput.nextDouble();

        //Calculation
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        double volume = ((double) 4 / 3) * Math.PI * Math.pow(radius, 3);
        double surface = 4 * Math.PI * Math.pow(radius, 2);
    }
}
