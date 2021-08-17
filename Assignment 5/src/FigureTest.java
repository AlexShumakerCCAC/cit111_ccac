import java.util.*;
public class FigureTest {

    public static void main(String[] args) {

        Rectangle first = new Rectangle("Rect1", 1, 2, 3, 4);
        Circle second = new Circle("Circle2", 5, 6, 7);

        System.out.println(first.toString());

        Figure[] f = new Figure[2];

        f[0] = first;
        f[1] = second;

        for(int i = 0; i < Figure.getNumberOfShapes(); i++){
            f[i].draw();
        }

    }

}
