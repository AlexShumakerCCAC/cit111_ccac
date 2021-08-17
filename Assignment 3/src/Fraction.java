public class Fraction {

    private int num;
    private int den;

    public Fraction()
    {
        num = 0;
        den = 0;
    }

    public Fraction( int user_num, int user_den )
    {
        num = user_num;
        den = user_den;
    }

    public int getDen () {
        return den;
    }
    public int getNum () {
        return num;
    }

    public boolean equals( Fraction f )
    {
        return getNum()*f.getDen() == f.getNum()*getDen();
    }

    public String toString() {
        return Integer.toString(num) + "/" + Integer.toString(den);
    }

}
