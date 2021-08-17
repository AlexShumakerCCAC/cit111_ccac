public class Counter {
    private int internal_count;

    public Counter()
    {
        internal_count = 0;
    }

    public Counter( int initial_value )
    {
        internal_count = initial_value;
    }

    public void increment () {
        internal_count++;
    }
    public void decrement () {
        internal_count--;
    }

    public int value(){
        return internal_count;
    }

    public boolean equals( Counter a )
    {
        if( this.internal_count == a.value()) {
            return true;
        }
        return false;
    }

    public String toString() {
       return Integer.toString( internal_count );
    }
}
