import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Changing_Face extends JFrame{
    //create the variables to store the default size of the GUI
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;

    public static final int FACE_DIAMETER = 200;
    public static final int X_FACE = 100;
    public static final int Y_FACE = 100;
    public static final int EYE_WIDTH = 20;
    public static final int EYE_HEIGHT = 10;
    public static final int X_RIGHT_EYE = X_FACE + 55;
    public static final int Y_RIGHT_EYE = Y_FACE + 60;
    public static final int X_LEFT_EYE = X_FACE + 130;
    public static final int Y_LEFT_EYE = Y_FACE + 60;
    public static final int MOUTH_WIDTH = 100;
    public static final int MOUTH_HEIGHT = 50;
    public static final int X_MOUTH = X_FACE + 50;
    public static final int Y_MOUTH = Y_FACE + 100;
    public static final int MOUTH_START_ANGLE = 180;
    public static final int MOUTH_ARC_SWEEP = 180;
    public static final int MOUTH_FROWN_START_ANGLE = 0;
    public static final int MOUTH_FROWN_ARC_SWEEP = 180;
    public boolean smile = true;


    public static void main(String[] args) {
        Changing_Face c = new Changing_Face();
    }

    public Changing_Face(){
        //setting the window as visible
        setVisible(true);
        //setting the size of the window
        setSize(WIDTH, HEIGHT);
        //setting the title of the window
        setTitle("Changing Face Demo");
        //setting the layout as border
        setLayout(new BorderLayout());
        //creating an instance of the listener
        ButtonListener butListen = new ButtonListener();
        //creating the changer button
        JButton changer = new JButton("Change");
        changer.addActionListener(butListen);
        add(changer, BorderLayout.SOUTH);

    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
        //draw eyes
        g.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
        g.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);
        //Draw Mouth
        if(smile == true) {
            g.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT, MOUTH_START_ANGLE, MOUTH_ARC_SWEEP);
        } else {
            g.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT, MOUTH_FROWN_START_ANGLE, MOUTH_FROWN_ARC_SWEEP);
        }
    }

    public class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            if(smile == true) {
                smile = false;
            } else{
                smile = true;
            }
            repaint();
        }
    }//end of button class
}//end of face class
