import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class Assignment_2 {

    public static void main(String[] args) {
        //declare variables/scanners
        Scanner userInput = new Scanner(System.in);
        double amount = 0;
        double rate = 0;
        int years = 0;
        //prompt user for input on required values
        System.out.println("Enter the current cost of the item: ");
        amount = userInput.nextInt();

        System.out.println("Enter the current rate of inflation per year (As a percent, without the % sign): ");
        rate = userInput.nextInt();
        rate = (rate / 100) + 1;

        System.out.println("Enter the amount of years of inflation you would like to calculate: ");
        years = userInput.nextInt();
        //establish for loop to calculate inflation
        for (int i = 1; i <= years; i++) {
            amount *= rate;
        }
        //create rounding method to round final value
        DecimalFormat round = new DecimalFormat("#0.00");
        //output final rounded value to the user
        System.out.println("The amount of the item at " + rate + "% inflation after " + years + " year(s) will be $"
                + round.format(amount));

    }

}
