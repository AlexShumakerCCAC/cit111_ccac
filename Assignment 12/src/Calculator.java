//importing the necessary swing files
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.awt.Font.PLAIN;
//the main class of the program that includes JFrame (PS: this sucked to code because I tried to account for
// almost every possible error or misuse, I now severely regret doing so. Enjoy)
public class Calculator extends JFrame {
    //create the variables to store the default size of the GUI
    public static final int WIDTH = 700;
    public static final int HEIGHT = 700;
    //creating the text field
    public JTextField name = new JTextField("");
    //the final result the calculator will output
    public double result = 0;
    //string value that keeps track of all number prior to a sign input
    public String values = "";
    //a value that is used once the equals sign is called because I am using post evaluation
    public String equalsCatch = "";
    //a boolean value that is used to keep track of if the screen needs cleared or not
    public boolean clearer = false;
    //a boolean value that makes sure that a sign is not inputted first
    public boolean first = false;
    //a value that when true will add the first number to the total regardless
    // of inputted sign because of the post evaluation
    public boolean firstOp = true;
    //a String that stores the previous sign so it can be evaluated
    public String oldOperator = "";

    public static void main(String[] args) {
        //creating an instance of the main class so the program will run
        Calculator c = new Calculator();
    }

    public Calculator() {
        //setting the window as visible
        setVisible(true);
        //setting the size of the window
        setSize(WIDTH, HEIGHT);
        //setting the title of the window
        setTitle("Calculator");
        //creating a new JPanel
        JPanel grid = new JPanel();
        //setting the layout of the JFrame as border
        setLayout(new BorderLayout());
        //making the text field uneditable
        name.setEditable(false);
        //changing the font of the text to make it larger
        name.setFont(new Font("Serif", PLAIN, 40));
        //putting the text field at the top of the window
        add(name, BorderLayout.NORTH);
        //setting the layout of the JPanel to grid
        grid.setLayout(new GridLayout(4, 4));
        //putting the grid in the center of the window
        add(grid, BorderLayout.CENTER);
        //creating instances of the classes
        NumberListener numListen = new NumberListener();
        OperatorListener opListen = new OperatorListener();
        //creating a new button
        JButton button1 = new JButton("1");
        //adding the listener of the button which is the class numListen
        button1.addActionListener(numListen);
        //setting the background of the button to white
        button1.setBackground(Color.WHITE);
        //enlarging the font of the number
        button1.setFont(new Font("Serif", PLAIN, 40));
        //adding the button to the JFrame
        grid.add(button1);
        //the same thing for the rest of these blocks, except the signs use a different listener class
        JButton button2 = new JButton("2");
        button2.addActionListener(numListen);
        button2.setBackground(Color.WHITE);
        button2.setFont(new Font("Serif", PLAIN, 40));
        grid.add(button2);

        JButton button3 = new JButton("3");
        button3.addActionListener(numListen);
        button3.setBackground(Color.WHITE);
        button3.setFont(new Font("Serif", PLAIN, 40));
        grid.add(button3);

        JButton buttonDiv = new JButton("/");
        buttonDiv.addActionListener(opListen);
        buttonDiv.setBackground(Color.WHITE);
        buttonDiv.setFont(new Font("Serif", PLAIN, 40));
        grid.add(buttonDiv);

        JButton button4 = new JButton("4");
        button4.addActionListener(numListen);
        button4.setBackground(Color.WHITE);
        button4.setFont(new Font("Serif", PLAIN, 40));
        grid.add(button4);

        JButton button5 = new JButton("5");
        button5.addActionListener(numListen);
        button5.setBackground(Color.WHITE);
        button5.setFont(new Font("Serif", PLAIN, 40));
        grid.add(button5);

        JButton button6 = new JButton("6");
        button6.addActionListener(numListen);
        button6.setBackground(Color.WHITE);
        button6.setFont(new Font("Serif", PLAIN, 40));
        grid.add(button6);

        JButton buttonMult = new JButton("*");
        buttonMult.addActionListener(opListen);
        buttonMult.setBackground(Color.WHITE);
        buttonMult.setFont(new Font("Serif", PLAIN, 40));
        grid.add(buttonMult);

        JButton button7 = new JButton("7");
        button7.addActionListener(numListen);
        button7.setBackground(Color.WHITE);
        button7.setFont(new Font("Serif", PLAIN, 40));
        grid.add(button7);

        JButton button8 = new JButton("8");
        button8.addActionListener(numListen);
        button8.setBackground(Color.WHITE);
        button8.setFont(new Font("Serif", PLAIN, 40));
        grid.add(button8);

        JButton button9 = new JButton("9");
        button9.addActionListener(numListen);
        button9.setBackground(Color.WHITE);
        button9.setFont(new Font("Serif", PLAIN, 40));
        grid.add(button9);

        JButton buttonSub = new JButton("-");
        buttonSub.addActionListener(opListen);
        buttonSub.setBackground(Color.WHITE);
        buttonSub.setFont(new Font("Serif", PLAIN, 40));
        grid.add(buttonSub);

        JButton buttonC = new JButton("C");
        buttonC.addActionListener(opListen);
        buttonC.setBackground(Color.WHITE);
        buttonC.setFont(new Font("Serif", PLAIN, 40));
        grid.add(buttonC);

        JButton button0 = new JButton("0");
        button0.addActionListener(numListen);
        button0.setBackground(Color.WHITE);
        button0.setFont(new Font("Serif", PLAIN, 40));
        grid.add(button0);

        JButton buttonE = new JButton("=");
        buttonE.addActionListener(opListen);
        buttonE.setBackground(Color.WHITE);
        buttonE.setFont(new Font("Serif", PLAIN, 40));
        grid.add(buttonE);

        JButton buttonAdd = new JButton("+");
        buttonAdd.addActionListener(opListen);
        buttonAdd.setBackground(Color.WHITE);
        buttonAdd.setFont(new Font("Serif", PLAIN, 40));
        grid.add(buttonAdd);

    }



    //start of Number class, used as the listener for all number keys
    public class NumberListener implements ActionListener{
        //the void method that takes in the button activation as a letter e
        public void actionPerformed(ActionEvent e) {
            //setting a string "num" equal to the action command (the text value of the button pressed)
            String num = e.getActionCommand();
            //a chain of if's that determine the key inputted
            if(num.equals("0")){
                //a nested if statement that clears the text field if it is entered after an equal sign
                if(clearer == true) {
                    name.setText("");
                    clearer = false;
                }
                //updating the text field with the inputted value
                name.setText(name.getText() + num);
                //adding the inputted number to the values String so it can be computed later
                values += num;
                //updating the first value to the program knows that a sign can be inputted now
                first = true;
            }
            else if(num.equals("1")){
                if(clearer == true) {
                    name.setText("");
                    clearer = false;
                }
                name.setText(name.getText() + num);
                values += num;
                first = true;
            }
            else if(num.equals("2")){
                if(clearer == true) {
                    name.setText("");
                    clearer = false;
                }
                name.setText(name.getText() + num);
                values += num;
                first = true;
            }
            else if(num.equals("3")){
                if(clearer == true) {
                    name.setText("");
                    clearer = false;
                }
                name.setText(name.getText() + num);
                values += num;
                first = true;
            }
            else if(num.equals("4")){
                if(clearer == true) {
                    name.setText("");
                    clearer = false;
                }
                name.setText(name.getText() + num);
                values += num;
                first = true;
            }
            else if(num.equals("5")){
                if(clearer == true) {
                    name.setText("");
                    clearer = false;
                }
                name.setText(name.getText() + num);
                values += num;
                first = true;
            }
            else if(num.equals("6")){
                if(clearer == true) {
                    name.setText("");
                    clearer = false;
                }
                name.setText(name.getText() + num);
                values += num;
                first = true;
            }
            else if(num.equals("7")){
                if(clearer == true) {
                    name.setText("");
                    clearer = false;
                }
                name.setText(name.getText() + num);
                values += num;
                first = true;
            }
            else if(num.equals("8")){
                if(clearer == true) {
                    name.setText("");
                    clearer = false;
                }
                name.setText(name.getText() + num);
                values += num;
                first = true;
            }
            else if(num.equals("9")){
                if(clearer == true) {
                    name.setText("");
                    clearer = false;
                }
                name.setText(name.getText() + num);
                values += num;
                first = true;
            }
            else {
                //this should never happen
                System.out.println("Error");
                System.exit(0);
            }
        }

    }//end of Listener class

//start of operator class, this is the listener for all non number buttons
    public class OperatorListener implements ActionListener{
        //the main action event again classified as e
        public void actionPerformed(ActionEvent e) {
            //the action command is put into a String named operator
            String operator = e.getActionCommand();
            //making sure that the first key entered is not a sign, the clear key is an exception however
            if (first == false && !operator.equals("C")) {
                name.setText("You cannot do that.");
                clearer = true;
            }
            else {
                //an if statement that adds the first number to the total regardless of the sign due to the post eval
                if(firstOp == true) {
                    //adding to text field
                    name.setText(name.getText() + operator);
                    //parsing the String into an int so it can be added to result
                    result += Integer.parseInt(values);
                    firstOp = false;
                    //making values empty again as the values have already been computed
                    values = "";
                    //setting the equals catch to the sign inputted
                    equalsCatch = operator;
                }
                else{
                    //a chain of if statements to determine the sign inputted
                    if (operator.equals("+")) {
                        //adds the sign to the text field
                        name.setText(name.getText() + "+");
                        //calling the getResult method and passing in the old operator
                        getResult(oldOperator);
                        //resetting the values after computation
                        values = "";
                        //setting catch = sign
                        equalsCatch = "+";
                        //rinse and repeat for all mathmatical signs
                    } else if (operator.equals("-")) {
                        name.setText(name.getText() + "-");
                        getResult(oldOperator);
                        values = "";
                        equalsCatch = "-";
                    } else if (operator.equals("*")) {
                        name.setText(name.getText() + "*");
                        getResult(oldOperator);
                        values = "";
                        equalsCatch = "*";
                    } else if (operator.equals("/")) {
                        name.setText(name.getText() + "/");
                        getResult(oldOperator);
                        values = "";
                        equalsCatch = "/";
                    } else if (operator.equals("=")) {
                        //getting the final result by passing in the equalsCatch sign
                        getResult(equalsCatch);
                        //adding the "=" and result to text field
                        name.setText(name.getText() + "=" + result);
                        //resetting all things that need to be
                        result = 0;
                        values = "";
                        clearer = true;
                        first = false;
                        firstOp = true;
                    } else if (operator.equals("C")) {
                        //clearing and resetting all variables that need to be
                        name.setText("");
                        values = "";
                        result = 0;
                        equalsCatch = "";
                        first = true;
                        firstOp = true;
                    } else {
                        //this should also never happen
                        System.out.println("Error");
                        System.exit(0);
                    }
                }
            }
        //a way to keep track of the previous inputted operator as I am post-calculating all of the values
        oldOperator = operator;
        }

        //a method that takes in a given sign and calculates a correct result based off of that sign
        public void getResult(String op) {
            if(op.equals("+")) {
                result += Integer.parseInt(values);
            }
            else if(op.equals("-")) {
                result -= Integer.parseInt(values);
            }
            else if(op.equals("*")) {
                result *= Integer.parseInt(values);
            }
            else if(op.equals("/")){
                result /= Integer.parseInt(values);
            }

        }

    }//end of action class

}//end of main class