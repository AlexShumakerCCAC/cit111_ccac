public class WrapperTest {

    public static void main(String[] args) {
        //creating shallow instances
        WrapperShallow ws1 = new WrapperShallow();
        WrapperShallow ws2 = new WrapperShallow(ws1);

        System.out.println("Initial shallow object contains: " + ws1);
        System.out.println("Copy shallow object contains: " + ws2);
        //changing the set of values in the original array
        ws1.setArray();

        System.out.println("Initial shallow object changed to: " + ws1);
        System.out.println("Copy shallow object not changed contains: " + ws2);
        //testing to see if the values in the before and after arrays are different
        testWS(ws1, ws2);

        System.out.println("\nNow testing the instances of deep\n");

        //creating deep instances
        WrapperDeep wd1 = new WrapperDeep();
        WrapperDeep wd2 = new WrapperDeep(wd1);

        System.out.println("Initial deep object contains: " + wd1);
        System.out.println("Copy deep object contains: " + wd2);
        //changing the values in the original array
        wd1.setArray();

        System.out.println("Initial deep object changed to: " + wd1);
        System.out.println("Copy deep object not changed contains: " + wd2);
        //testing to see if the values in the before and after arrays are different
        testWD(wd1, wd2);
    }
    //the method that uses the equals class to determine if the shallow arrays are equal and output accordingly
    public static void testWS(WrapperShallow ws1, WrapperShallow ws2) {
        if (ws1.equals(ws1, ws2)) {
            System.out.println("Uh oh, ws1.equals(ws2) is true");
        }
        else {
            System.out.println("Correct! ws1.equals(ws2) is false");
        }
    }
    //the method that uses the equals class to determine if the deep arrays are equal and output accordingly
    public static void testWD(WrapperDeep wd1, WrapperDeep wd2) {
        if (wd1.equals(wd1, wd2)) {
            System.out.println("Uh oh, wd1.equals(wd2) is true");
        }
        else {
            System.out.println("Correct! wd1.equals(wd2) is false");
        }
    }
}
