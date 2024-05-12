import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertNumberWithComma {
    public static void main(String[] args) {

        //Input
        Scanner newInput = new Scanner(System.in);
        System.out.print("Please enter an integer between 1000 and 999999: ");
        int withoutComma = newInput.nextInt();

        //Adding comma using Decimal Format
        DecimalFormat formatter = new DecimalFormat("#,###");
        String withComma = formatter.format(withoutComma);

        //Output
        System.out.println(withComma);
    }
}
