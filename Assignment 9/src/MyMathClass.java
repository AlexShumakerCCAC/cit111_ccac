import java.util.*;
public class MyMathClass <T extends Number> {

    public static void main(String[] args) {
        //create arrayLists (saving space using this function JDK prompted me with :), which is amazing BTW )
        ArrayList<Double> dub = new ArrayList<>(Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0));
        ArrayList<Integer> inte = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        //calling the stdev using the Double list
        System.out.println("Standard Deviation 0-9 type Double: " + MyMathClass.stdev(dub));
        //calling the stdev using the Integer list
        System.out.println("Standard Deviation 0-9 type Integer: " + MyMathClass.stdev(inte));
    }

    public static <T extends Number> double stdev(ArrayList<T> a) {
        //declare variables
        //count keeps track of the number of elements in the array
        int count = 0;
        //average is used to keep track of the average of the array
        double average = 0;
        //total is used for the final product we get for stdev
        double total = 0;
        //this for each loop takes each element, and adds it to the average. Each time this loop runs, count + 1
        for (T element : a) {
            average += element.doubleValue();
            count++;
        }
        //dividing the total of the added values by the amount of elements in the array
        average /= count;
        //this for each loop takes each element of the array, subtracts it from the Avg,
        //squares that number, and adds it to the total
        for (T element : a) {
            total += Math.pow((element.doubleValue() - average) , 2);
        }
        //dividing the total by the amnt of elements in the array
        total /= (count-1);
        //square rooting the total
        total = Math.sqrt(total);
        //returning the final value
        return total;
    }

}
