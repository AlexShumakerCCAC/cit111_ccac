import java.util.Hashtable;
public class HashClassTest {

    public static int people = 10;
    public static void main(String[] args) {

        double probability = 0;
        HashClass h = new HashClass();
        for(int i=1;i<11;i++) {
            probability = h.bDayChecker();
            System.out.println("After 100,000 tests, there were " + probability + " occurrences of shared birthdays" +
                    " in a set of " + (i*10) + " people.");
            //calculate and return the probability
            probability /= 100000;
            System.out.println("Probability: " + probability);
            people+=10;
        }
    }

}
