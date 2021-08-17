import java.util.NoSuchElementException;
public class LinkedList3<T> implements Cloneable
{
    private class Node<T>
    {
        //variable that holds data in the node
        private T data;
        //previous node link
        private Node<T> previous;
        //next node ling
        private Node<T> next;
        //creates default node with null values
        public Node( )
        {
            data = null;
            previous = null;
            next = null;
        }
        //creates node with inputted values
        public Node(T newData, Node<T> previousNode, Node<T> nextNode)
        {
            data = newData;
            next = nextNode;
            previous = previousNode;
        }
    }//End of Node<T> inner class

    //declaring the "head" value to be used as placeholder for start of list
    private Node<T> head;

    public LinkedList3( )
    {
        head = null;
    }

    //start of iterator inner class
    public class List3Iterator
    {
        //current position of node
        private Node position;
        //previous position of "position"
        private Node previous;
        //method that starts the iterator
        public List3Iterator()
        {
            //sets current position to be the start
            position = head;
            //defines that the previous position is now null
            previous = null;
        }
        //method that restarts the iterator
        public void restart()
        {
            //sets current position to be the start
            position = head;
            //defines that the previous position is now null
            previous = null;
        }
        //method that iterates to the next Node
        public String next()
        {
            //if statement that throws an error if there is no next Node, returns the data of current Node as String,
            //and iterates to the next Node
            if (!hasNext())
                throw new NoSuchElementException();
            String toReturn = position.data.toString();
            previous = position;
            position = position.next;
            return toReturn;
        }

        //boolean method to make sure that the next position is not null, if null, next will throw the error for that
        public boolean hasNext()
        {
            return (position != null);
        }
        //method that checks what the next value that will be returned by the method "next", and returns that value
        public String peek()
        {
            //checks to make sure there is actually a value to be returned
            if (!hasNext())
                throw new IllegalStateException();
            //returns the data as String
            return position.data.toString();
        }
        //addHere method that adds a new piece of data into a new Node
        public void addHere(String newData)
        {
            //if current position is null AND the prev list is not null, creates new node with the data
            if(position == null && previous != null)
                previous.next = new Node(newData, null, null);
            //else if position is null OR the prev list is null, adds the new piece of data to the start of the list
            //as the head node
            else if (position == null || previous == null)
                LinkedList3.this.addToStart((T) newData);
            //else creates a temporary node with which to store the inputted data
            else
            {
                Node temp = new Node(newData, null, position);
                previous.next = temp;
                previous = temp;
            }
        }
    }//end of iterator inner class

    public List3Iterator iterator()
    {
        return new List3Iterator();
    }

    public LinkedList3(LinkedList3<T> otherList)
    {
        if (otherList == null)
            throw new NullPointerException();
        if (otherList.head == null)
            head = null;
        else
            head = copyOf(otherList.head);
    }

    public LinkedList3<T> clone()
    {
        try
        {
            LinkedList3<T> copy = (LinkedList3<T>)super.clone();
            if (head == null)
                copy.head = null;
            else
                copy.head = copyOf(head);
            return copy;
        }
        catch (CloneNotSupportedException e)
        {
            return null;
        }
    }

    private Node<T> copyOf(Node<T> otherHead)
    {
        //starts at top of original list
        Node<T> position = otherHead;
        //used as the start of the new list
        Node<T> newHead;
        //used as the end of the new list
        Node<T> end = null;
        //create head node
        newHead = new Node<T> (position.data, null, null);
        //makes new head node end of list, then works back up list
        end = newHead;
        position = position.next;

        while(position != null)
        {
            //copies node at (position) to the end of the new list
            end.next = new Node<T> (position.data, null, null);
            end = end.next;
            position = position.next;
        }

        return newHead;
    }

    /**
     Adds a node at the start of the list with the specified data.
     The added node will be the first node in the list.
     */
    public void addToStart(T itemData)
    {
        Node<T> newHead = new Node<T>(itemData, null, head);
        if (head != null)
        {
            head.previous = newHead;
        }
        head=newHead;
    }

    /**
     Removes the head node and returns true if the list contains at least
     one node. Returns false if the list is empty.
     */
    public boolean deleteHeadNode( )
    {
        if (head != null)
        {
            head = head.next;
            return true;
        }
        else
            return false;
    }

    /**
     Returns the number of nodes in the list.
     */
    public int size( )
    {
        int count = 0;
        Node<T> position = head;
        while (position != null)
        {
            count++;
            position = position.next;
        }
        return count;
    }

    public boolean contains(T item)
    {
        return (find((String) item) != null);
    }

    /**
     Finds the first node containing the target item, and returns a
     reference to that node. If target is not in the list, null is returned.
     */
    private Node<T> find(String target)
    {
        Node<T> position = head;
        T itemAtPosition;
        while (position != null)
        {
            itemAtPosition = position.data;
            if (itemAtPosition.equals(target))
                return position;
            position = position.next;
        }
        return null; //target was not found
    }

    /**
     Finds the first node containing the target and returns a reference
     to the data in that node. If target is not in the list, null is returned.
     */
    public T findData(String target)
    {
        return find(target).data;
    }

    public String toString( )
    {
        String a = "";
        Node<T> position = head;
        while (position != null)
        {
            a = a + (position.data.toString()) + " ";
            position = position.next;
        }
        return a;
    }

    public boolean isEmpty( )
    {
        return (head == null);
    }

    public void clear( )
    {
        head = null;
    }

    /**
     For two lists to be equal they must contain the same data items in
     the same order. The equals method of T is used to compare data items.
    */
    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (getClass( ) != otherObject.getClass( ))
            return false;
        else
        {
            LinkedList3<T> otherList = (LinkedList3<T>)otherObject;
            if (size( ) != otherList.size( ))
                return false;
            Node<T> position = head;
            Node<T> otherPosition = otherList.head;
            while (position != null)
            {
                if (!(position.data.equals(otherPosition.data)))
                    return false;
                position = position.next;
                otherPosition = otherPosition.next;
            }
            return true; //no mismatch was not found
        }
    }

    public void outputBackwards()
    {
        Node<T> position = null;
        Node<T> headOutput = head;
        while (headOutput.next != null) {
            position = headOutput.next;
            headOutput = headOutput.next;
        }

        while(position != null)
        {
            System.out.println(position.data.toString());
            position = position.previous;
        }

    }

}