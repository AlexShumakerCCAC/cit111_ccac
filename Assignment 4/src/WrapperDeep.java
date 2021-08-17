import java.util.*;
public class WrapperDeep {
    //main instance of deep
    public WrapperDeep() {
        a = new int[3];
        a[0]=  7;
        a[1] = 17;
        a[2] = 77;
    }
    //declaring the array-a as private
    private int [] a;
    //the method that correctly copies deep
    public WrapperDeep(WrapperDeep wd) {
        a = new int[3];
        for(int i = 0; i < 3; i++)
        a[i]=wd.a[i];
    }
    //the toString method
    public String toString() {
        return Arrays.toString(a);
    }
    //the method that changes the array values
    public int[] setArray() {
        a[0]=  13;
        a[1] = 14;
        a[2] = 15;
        return a;
    }
    //tests if the two arrays are the same
    public boolean equals(WrapperDeep wd1, WrapperDeep wd2 ) {
        if (wd1.a[0] != wd2.a[0]) {
            return false;
        }
        else if(wd1.a[1] != wd2.a[1]) {
            return false;
        }
        else if(wd1.a[2] != wd2.a[2]) {
            return false;
        }
        else
            return true;
    }
}
