import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
enum Operator {
    ADD,SUBTRACT,MULTIPLY,DIVIDE
}

public class Calculator extends JFrame {
    private JButton nums[];
    private JButton add, subtract, multiply, divide, compute, clear;
    private JTextField resultTextField;
    private Operator o;
    private int first, second;
    private String num1 ="", num2 = "";
    private Font font;
    private boolean firstDigit = true;

    public Calculator() {
        createComponents();
        setLayout();
        addComponent();
        addBehavior();
        display();
    }

    private void createComponents() {
        font = new Font("TimesRoman", Font.PLAIN, 36);

        nums = new JButton[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = new JButton(i + "");
            nums[i].setFont(font);
        }

        add = new JButton("+");
        add.setFont(font);
        subtract = new JButton("-");
        subtract.setFont(font);
        multiply = new JButton("×");
        multiply.setFont(font);
        divide = new JButton("÷");
        divide.setFont(font);
        compute = new JButton("=");
        compute.setFont(font);
        resultTextField = new JTextField(10);
        resultTextField.setFont(font);
        clear = new JButton("c");
        clear.setFont(font);
    }

    private void setLayout() {
        GridLayout gl = new GridLayout(6, 1);
        Container c = this.getContentPane();
        c.setLayout(gl);
    }

    private void addComponent() {
        Container c = getContentPane();
        
        JPanel p = new JPanel();
        p.add(resultTextField);
        c.add(p);
        
        p = new JPanel();
        for (int i = 7; i < 10; i++) {
            p.add(nums[i]);
        }
        c.add(p);

        p = new JPanel();
        for (int i = 4; i < 7; i++) {
            p.add(nums[i]);
        }
        c.add(p);
       
        p = new JPanel();
        for (int i = 1; i < 4; i++) {
            p.add(nums[i]);
        }
        c.add(p);

        p = new JPanel();
        p.add(add);
        p.add(subtract);
        p.add(divide);
        p.add(multiply);
        p.add(compute);
        c.add(p);
        
        p.add(clear);
        c.add(p);
    }

    class NumberListener implements ActionListener {
     
        public void actionPerformed(ActionEvent e) {
            if (firstDigit) {
                num1 += ((JButton) e.getSource()).getText();
                first = Integer.parseInt(num1);
                resultTextField.setText(num1);
            } else {
                num2 += ((JButton) e.getSource()).getText();
                second = Integer.parseInt(num2);
                resultTextField.setText(num2);
                
            }
        }
    }

    class OperatorListener implements ActionListener {
       
        public void actionPerformed(ActionEvent e) {
            firstDigit = false;
            if (e.getSource() == add) {
                o = Operator.ADD;
            }
            if (e.getSource() == subtract) {
                o = Operator.SUBTRACT;
            }
            if (e.getSource() == multiply) {
                o = Operator.MULTIPLY;
            }
            if (e.getSource() == divide) {
                o = Operator.DIVIDE;
            }
            if (e.getSource() == clear) {
                resultTextField.setText("");
                firstDigit = true;
                num1="";
                num2="";
            }
        }
    }

    class CalculateListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            int result;
            if (o == Operator.ADD) {
                result = first + second;
                resultTextField.setText(result+"");
            }
            if (o == Operator.SUBTRACT) {
                result = first - second;
                resultTextField.setText(result+"");
            }
            if (o == Operator.MULTIPLY) {
                result = first * second;
                resultTextField.setText(result+"");
            }
            if (o == Operator.DIVIDE) {
                result = first / second;
                resultTextField.setText(result+"");
            }
        }
    }


    private void addBehavior() {
        NumberListener nl = new NumberListener();
        for (int i = 0; i < 10; i++) {
            nums[i].addActionListener(nl);
        }

        OperatorListener ol = new OperatorListener();
        add.addActionListener(ol);
        subtract.addActionListener(ol);
        multiply.addActionListener(ol);
        divide.addActionListener(ol);
        clear.addActionListener(ol);

        CalculateListener cl = new CalculateListener();
        compute.addActionListener(cl);

    }

    private void display() {
        setSize(600, 600);
        setVisible(true);
    }

    public static void main(String args[]) {
        Calculator c = new Calculator();
    }
}