public class HashClass {

    private MyList[] hashArray;
    private static final int SIZE = 365;
    private int people = HashClassTest.people;

    public HashClass() {
        hashArray = new MyList[SIZE];
        for (int i=0; i<SIZE; i++)
            hashArray[i] = new MyList();
    }

    public boolean targetChecker(int target)
    {
        MyList list = hashArray[target];
        //if statement that checks for the target in the hash
        if(list.contains(target))
            return true;
        return false;
    }

    public double bDayChecker() {
        int probability = 0;
        int collisions = 0;
        for(int i=0;i<100000;i++)
        {
            outerLoop:
            for(int b=0;b<people;b++) {

                int a = 1 + (int) ((Math.random() * 365));
                if (targetChecker(a-1) == true) {
                    collisions++;
                    break outerLoop;
                } else
                    add(a-1);
            }
            for (int p=0; p<SIZE; p++)
                hashArray[p] = new MyList();
        }
        probability = collisions;
        people += 10;
        return probability;
    }

    public void add(int a)
    {
        MyList list = hashArray[a];
        if(!list.contains(a))
        {
            hashArray[a].addToStart(a);
        }
    }

}
