package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr2 extends Applet {

    TextField tekstvak;
    Button okKnop;
    double hoogsteGetal, laagsteGetal, nieuwGetal;
    int i;

    public void init() {
        i = 0;
        tekstvak = new TextField("",10);
        okKnop = new Button("Ok");

        tekstvak.addActionListener(new okListener());
        okKnop.addActionListener(new okListener());

        add(tekstvak);
        add(okKnop);

    }

    public void paint (Graphics g){
        g.drawString("Hoogste getal: " + hoogsteGetal, 80,80);
        g.drawString("laagste getal: " + laagsteGetal ,80,100);
    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nieuwGetal = Double.parseDouble(tekstvak.getText());
            if(i == 0) {
                laagsteGetal = nieuwGetal;
                hoogsteGetal = nieuwGetal;
                repaint();
                i = 1;
            }
            if (nieuwGetal > hoogsteGetal) {
                hoogsteGetal= nieuwGetal;
                repaint();
            }
            if (nieuwGetal < laagsteGetal){
                laagsteGetal = nieuwGetal;
                repaint();
            }
        }
    }
}
