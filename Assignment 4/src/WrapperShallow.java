import java.util.*;
public class WrapperShallow {
    //main instance of shallow
    public WrapperShallow() {
         a = new int[3];
         a[0]=  7;
         a[1] = 17;
         a[2] = 77;
    }
    //creating the a-array as a private
    private int [] a;
    //the constructor that copies shallow incorrectly
    public WrapperShallow(WrapperShallow ws) {
        a = ws.a;
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
    public boolean equals(WrapperShallow a1, WrapperShallow a2 ) {
        if (a1.a[0] != a2.a[0]) {
            return false;
        }
        else if(a1.a[1] != a2.a[1]) {
            return false;
        }
        else if(a1.a[2] != a2.a[2]) {
            return false;
        }
        else
        return true;
    }
}
