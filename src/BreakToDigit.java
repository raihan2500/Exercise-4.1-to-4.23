import java.util.Scanner;

public class BreakToDigit {
    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String str = Integer.toString(number);

        //Output
        for(int i = 0; i < str.length(); i++){
            System.out.printf("%c ", str.charAt(i));
        }

    }
}
