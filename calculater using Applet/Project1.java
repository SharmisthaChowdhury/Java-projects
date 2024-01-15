import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Project1 extends Applet implements ActionListener {
    TextField t1;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button add, sub, mul, div, eq;
    String input = "", operator = "";
    int num1, num2;

    public void init() {
        t1 = new TextField(20);
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        eq = new Button("=");

        add(t1);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(eq);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        eq.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (Character.isDigit(str.charAt(0))) {
            input += str;
            t1.setText(input);
        } else if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
            num1 = Integer.parseInt(input);
            operator = str;
            input = "";
        } else if (str.equals("=")) {
            num2 = Integer.parseInt(input);
            int result = 0;
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) { 
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    t1.setText("Error: Division by zero");
                    return;
                }
            }
            t1.setText(Integer.toString(result));
            input = Integer.toString(result);
        }
    }
}
