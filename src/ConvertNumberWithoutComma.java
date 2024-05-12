import java.util.Scanner;

public class ConvertNumberWithoutComma {
    public static void main(String[] args) {

        //Input
        Scanner newInput = new Scanner(System.in);
        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        String withComma = newInput.next();
        String withoutComma = withComma.replaceAll(",","");

        //Output
        System.out.println(withoutComma);

    }
}
