import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Maven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Asks user for input, then outputs it
        System.out.println("Enter something:");
        String userInput = input.nextLine();
        System.out.println("\n You entered: " + userInput);

//        Checks if it is a number
        boolean numOrNot = StringUtils.isNumeric(userInput);
        String answerToNum = numOrNot ? "is a number" : "is not a number";
        System.out.print("\n" + userInput + " " + answerToNum + "\n");

//        Flipped Case

        System.out.println("\n Flipped Case: " +StringUtils.swapCase(userInput));

//        Reversed
        System.out.println("\n Reversed: " + StringUtils.reverse(userInput));


    }
}
