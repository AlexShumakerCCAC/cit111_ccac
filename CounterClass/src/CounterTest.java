
import java.util.Scanner;

public class CounterTest {

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter(1);

        test(counter1, counter2);

        counter2.decrement();

        test(counter1, counter2);

        counter1.increment();

        test(counter1, counter2);

    }

    public static void test(Counter c1, Counter c2) {
        if (c1.equals(c2)) {
            System.out.println(c1.toString() + " equals " + c2.toString());
        }
        else {
            System.out.println(c1.toString() + " does not equal " + c2.toString());
        }
    }

}
