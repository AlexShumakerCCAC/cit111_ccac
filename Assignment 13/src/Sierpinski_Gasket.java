import java.awt.*;
import javax.swing.*;
public class Sierpinski_Gasket extends JFrame {
    //create values used for the size of the JFrame
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;
    //the values of the first vertex
    public static final int VERTEX_0_X = 20;
    public static final int VERTEX_0_Y = 700;
    //second vertex
    public static final int VERTEX_1_X = 350;
    public static final int VERTEX_1_Y = 60;
    //third vertex
    public static final int VERTEX_2_X = 700;
    public static final int VERTEX_2_Y = 700;
    //values of the current point
    public static int CURRENT_X = 700;
    public static int CURRENT_Y = 700;
    //values of the target point
    public static int TARGET_X = 0;
    public static int TARGET_Y = 0;
    //values of the midpoint
    public static int MIDPOINT_X = 0;
    public static int MIDPOINT_Y = 0;

    public static void main(String[] args) {
        Sierpinski_Gasket s = new Sierpinski_Gasket();
        //set the JFrame as visible
        s.setVisible(true);
    }

    public Sierpinski_Gasket()
    {
        //setting title
        super("Sierpinski Gasket Demo");
        //set the size of the JFrame
        setSize(WIDTH, HEIGHT);

    }

    public void paint(Graphics g)
    {
        //for loop that loops 50k times
        for(int i=0;i<50000;i++){
            //random number generator to pick a random vertex
            int rand = (int) (Math.random()*3);
            if(rand == 0){
                TARGET_X = VERTEX_0_X;
                TARGET_Y = VERTEX_0_Y;
            } else if(rand == 1){
                TARGET_X = VERTEX_1_X;
                TARGET_Y = VERTEX_1_Y;
            } else if(rand == 2) {
                TARGET_X = VERTEX_2_X;
                TARGET_Y = VERTEX_2_Y;
            }
            //using the getBetween method to get the midpoint of the two inputted points
            MIDPOINT_X=getBetween(TARGET_X, CURRENT_X);
            MIDPOINT_Y=getBetween(TARGET_Y, CURRENT_Y);
            //drawing the pixel at the midpoint
            g.drawLine(MIDPOINT_X,MIDPOINT_Y,MIDPOINT_X,MIDPOINT_Y);
            //setting the current point to the midpoint
            CURRENT_X=MIDPOINT_X;
            CURRENT_Y=MIDPOINT_Y;
        }//end of for loop
    }//end of paint
    //a method that gets the midpoint of 2 inputted points
    public int getBetween(int num, int num2){
        return ((num+num2)/2);
    }
}//end of gasket class
