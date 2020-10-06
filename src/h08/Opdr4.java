package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr4 extends Applet {

    Button multiply,divide,add,substract;
    TextField input1, input2;
    double totaal;

    public void init() {
        multiply = new Button("*");
        divide = new Button("/");
        add = new Button("+");
        substract = new Button("-");

        input1 = new TextField("",10);
        input2 = new TextField("",10);

        multiply.addActionListener(new multiplyListener());
        divide.addActionListener(new divideListener());
        add.addActionListener(new addListener());
        substract.addActionListener(new substractListener());

//        Tekstvakken
        add(input1);
        add(input2);

//        Knoppen
        add(multiply);
        add(divide);
        add(add);
        add(substract);
    }

    public void paint (Graphics g) {
        g.drawString("Antwoord: " + totaal,70,70);
    }

    class multiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double input1value = Double.parseDouble(input1.getText());
            double input2value = Double.parseDouble(input2.getText());
            totaal = input1value * input2value;
            repaint();
        }
    }

    class divideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double input1value = Double.parseDouble(input1.getText());
            double input2value = Double.parseDouble(input2.getText());
            totaal = input1value / input2value;
            repaint();
        }
    }

    class addListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double input1value = Double.parseDouble(input1.getText());
            double input2value = Double.parseDouble(input2.getText());
            totaal = input1value + input2value;
            repaint();
        }
    }

    class substractListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double input1value = Double.parseDouble(input1.getText());
            double input2value = Double.parseDouble(input2.getText());
            totaal = input1value - input2value;
            repaint();
        }
    }
}
