public class PrintingGrid {
    public static void main(String[] args) {

        //Two String declared at first
        String combShapedPattern = "+--+--+--+";
        String bottomLine = "|  |  |  |";

        //Print the strings in desired format with for loop
        for(int i = 0; i < 3 ;i++){
            System.out.println(combShapedPattern + "\n" + bottomLine);
        }
        System.out.println(combShapedPattern);
    }
}
