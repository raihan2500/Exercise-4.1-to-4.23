import java.util.Scanner;

public class GasCost {
    public static void main(String[] args) {

        //Input
        Scanner newInput = new Scanner(System.in);
        double numberOfGallons = newInput.nextDouble();
        double fuelEfficiencyMilesPerGallon = newInput.nextDouble();
        double priceOfGasPerGallon = newInput.nextDouble();

        //Calculation
        double costPer100Miles = fuelEfficiencyMilesPerGallon * 100 *priceOfGasPerGallon;
        double distance = numberOfGallons * fuelEfficiencyMilesPerGallon;

        //Output
        System.out.printf("Cost per 100 miles: %.3f", costPer100Miles);
        System.out.printf("Car can go with the gas: %.3f", distance);
    }
}
