import java.text.DecimalFormat;

public class LetterSizePaper {

    //Constants
    static final double INCH_TO_MILLIMETER = 25.4;
    static final double HEIGHT = 11.0;
    static final double WIDTH = 8.5;

    public static void main(String[] args) {

        //Inch to Millimeter conversion
        double widthInMillimeter = WIDTH * INCH_TO_MILLIMETER;
        double heightInMillimeter = HEIGHT * INCH_TO_MILLIMETER;
        double perimeterInMillimeter = 2 * (heightInMillimeter + widthInMillimeter);
        double diagonalInMillimeter = Math.sqrt((heightInMillimeter * heightInMillimeter) + (widthInMillimeter + widthInMillimeter));

        //Print
        System.out.printf("Height = %.2f mm \n", heightInMillimeter);
        System.out.printf("Width = %.2f mm \n", widthInMillimeter);
        System.out.printf("Perimeter = %.2f mm \n", perimeterInMillimeter);
        System.out.printf("Diagonal length = %.2f mm \n", diagonalInMillimeter);

    }

}
