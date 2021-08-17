public class LinkedListTest {

    public static void main(String[] args) {
        //declare variables/lists
        LinkedList3 list = new LinkedList3();
        LinkedList3 list2 = new LinkedList3();
        LinkedList3.List3Iterator i = list.iterator();
        //fill in lists
        list.addToStart("Violet");
        list.addToStart("Blue");
        list.addToStart("Green");
        list.addToStart("Yellow");
        list.addToStart("Orange");
        list.addToStart("Red");
        //printing out list
        System.out.println("List contains: " + list.toString());
        //restarting iterator and going to the spot where we are inserting purple
        i.restart();
        i.next();
        i.next();
        i.next();
        i.next();
        i.next();
        //using peek to show what is in front of where we are inserting purple
        System.out.println("Inserting Purple before " + i.peek());
        //adding purple to current point in iteration
        i.addHere("Purple");
        //restarting iterator
        i.restart();
        System.out.println("List now contains: " + list.toString());
        //restarting iterator
        i.restart();
        //printing list in reverse using outputBackwards
        System.out.println("Now printing list in reverse:");
        list.outputBackwards();
        //using the copy method to make two different lists that are the same
        System.out.println("Here are two lists that are identical to each other:");
        System.out.println("List 1 contains: " + list.toString());
        list2 = list.clone();
        System.out.println("List 2 contains: " + list2.toString());
    }

}
