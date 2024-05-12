import java.util.Scanner;

public class ConversionFromMeter {

    //Constants
    static final double METER_TO_FEET = 3.28084;
    static final double METER_TO_INCH = 39.3701;
    static final double METER_TO_MILES = 0.000621371;

    public static void main(String[] args) {

        //Input
        Scanner newInput = new Scanner(System.in);
        double meter = newInput.nextDouble();

        //Calculation
        double feet = meter * METER_TO_FEET;
        double inch = meter * METER_TO_INCH;
        double miles = meter * METER_TO_MILES;
    }
}
