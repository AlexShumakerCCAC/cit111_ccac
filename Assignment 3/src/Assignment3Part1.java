import java.util.*;
public class Assignment3Part1 {

    public static void main(String[] args) {
        //create scanners, variables, and lists
        Scanner userInput = new Scanner(System.in);
        int max;
        int listCreator;
        int calc;
        int base;
        int multiply = 2;
        int stop = 1;
        int index = 3;
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter the numerical limit you would like to test for primes(Must be higher than 2): ");
        max = userInput.nextInt();
        listCreator = max;
        while(listCreator >= 2) {
            list.add(listCreator);
            listCreator--;
        }
        Collections.sort(list);
        calc = list.get(0);
        base = calc;
        while(stop < index-1) {
            while (calc < max) {
                calc = base * multiply;
                multiply++;
                if (calc <= max)
                    list.remove(Integer.valueOf(calc));
                else
                    break;
            }
            stop += 1;
            calc = list.get(stop);
            base = stop;
            multiply = 2;
            index = list.size();
        }

        System.out.println("The numbers between 2 and " + max + " that are prime are:\n" + list);
    }

}