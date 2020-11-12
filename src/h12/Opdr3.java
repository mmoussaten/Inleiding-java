package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdr3 extends Applet {

    Button okknop;
    TextField[] tekst;
    int[] getallen;

    public void init() {

        okknop = new Button("OK");
        tekst = new TextField[5];
        getallen = new int[5];
        add(okknop);

        for (int i = 0; i < getallen.length; i++) {
            tekst[i] = new TextField();
            add(tekst[i]);
        }
        okknop.addActionListener(new tektsvaklistener());
    }


    public void paint(Graphics g) {

        int x = 50;
        int y = 50;
        for (int i = 0; i < getallen.length; i++) {
            g.drawString("" + getallen[i], x, y);
            y += 20;

        }

    }

    class tektsvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekst.length; i++) {
                String s = tekst[i].getText();
                int getal = Integer.parseInt(s);
                getallen[i] = getal;
            }
            Arrays.sort(getallen);

            for (int i = 0; i < getallen.length; i++) {
                tekst[i].setText("" + getallen[i]);
            }
            repaint();
        }
    }
}