package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr1 extends Applet {

    TextField tekstvak;
    Button okKnop;
    double huidigeGetal, nieuwGetal;

    public void init() {
        huidigeGetal = 0;

        tekstvak = new TextField("",10);
        okKnop = new Button("Ok");

        tekstvak.addActionListener(new okListener());
        okKnop.addActionListener(new okListener());

        add(tekstvak);
        add(okKnop);

    }

    public void paint (Graphics g){
        g.drawString("Hoogste getal: " + huidigeGetal, 80,80);
    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nieuwGetal = Double.parseDouble(tekstvak.getText());
            if (nieuwGetal > huidigeGetal) {
                huidigeGetal = nieuwGetal;
                repaint();
            }
        }
    }
}
