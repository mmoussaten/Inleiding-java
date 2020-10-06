package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr3 extends Applet {

    Button ok;
    TextField tekstvak;
    double totaal;

    public void init() {
        tekstvak = new TextField("",15);
        ok = new Button("Ok");

        tekstvak.addActionListener(new EventListener());
        ok.addActionListener(new EventListener());

        totaal = 0;

        add(tekstvak);
        add(ok);
    }

    public void paint (Graphics g) {
        g.drawString("Totaal prijs: €" + totaal,20,50);
    }
    class EventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = tekstvak.getText();
            totaal = Double.parseDouble(input) * 1.21;
            repaint();
        }
    }
}
