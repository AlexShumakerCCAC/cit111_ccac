import java.util.*;
public class FractionTest {

    public static void main(String[] args) {
        //declare variables/Scanners
        Scanner userInput = new Scanner(System.in);
        int b_num;
        int b_den;
        int n_num;
        int n_den;
        boolean cont = true;
        String ans;

        while(cont == true) {

            System.out.print("Enter the numerator for the base fraction: ");
            b_num = userInput.nextInt();
            System.out.print("Enter the denominator for the base fraction: ");
            b_den = userInput.nextInt();

            Fraction f1 = new Fraction(b_num, b_den);

            System.out.print("\nEnter the numerator for the next fraction: ");
            n_num = userInput.nextInt();
            System.out.print("Enter the denominator for the next fraction: ");
            n_den = userInput.nextInt();

            Fraction f2 = new Fraction(n_num, n_den);

            test(f1, f2);

            System.out.println("Would you like to continue? (y/n): ");
            ans = userInput.next();
            if(ans.equals("y")) {
                cont = true;
            }
            else {
                cont = false;
            }

        }

    }

    public static void test(Fraction f1, Fraction f2) {

        if(f1.equals(f2)) {
            System.out.println("The fraction you entered equals the base fraction of " + f1.toString());
        }
        else {
            System.out.println("The fraction you entered does not equal the base fraction of " + f1.toString());
        }

    }

}
