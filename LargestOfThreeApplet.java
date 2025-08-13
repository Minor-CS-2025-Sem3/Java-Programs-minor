/*
21. Develop an applet that receives 3 numeric values as inputs from the user and then displays the largest number on the screen.
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// <applet code="LargestOfThreeApplet" width="400" height="200"></applet>
public class LargestOfThreeApplet extends Applet implements ActionListener {
    TextField t1, t2, t3;
    Label result;
    Button btn;
    public void init() {
        setLayout(new FlowLayout());
        add(new Label("Num 1:"));
        t1 = new TextField(5); add(t1);
        add(new Label("Num 2:"));
        t2 = new TextField(5); add(t2);
        add(new Label("Num 3:"));
        t3 = new TextField(5); add(t3);
        btn = new Button("Find Largest"); add(btn);
        result = new Label("Largest: "); add(result);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double c = Double.parseDouble(t3.getText());
            double max = a;
            if (b > max) max = b;
            if (c > max) max = c;
            result.setText("Largest: " + max);
        } catch (NumberFormatException ex) {
            result.setText("Please enter valid numbers.");
        }
    }
}
