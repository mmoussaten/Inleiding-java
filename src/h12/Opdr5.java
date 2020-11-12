package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdr5 extends Applet {

    TextField tekstvak;
    Button okknop;
    boolean gevonden;
    boolean klikken;
    int index;

    int[] getallen = {100, 200, 300, 400, 500};


    public void init() {

        tekstvak = new TextField(10);
        add(tekstvak);

        okknop = new Button(" ok");
        okknop.addActionListener(new okknoplistener());
        add(okknop);

        gevonden = false;

    }

    public void paint(Graphics g) {

        if (klikken) {

            if (gevonden) {

                g.drawString(" de index is gevonden " + index, 50, 60);
            } else {
                g.drawString(" de index is niet gevonden ", 50, 60);
            }
        }
    }

    class okknoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            gevonden = false;
            int input = Integer.parseInt(tekstvak.getText());
            klikken = true;

            for (int i = 0; i < getallen.length; i++) {
                if (getallen[i] == input) {
                    gevonden = true;
                    index = 100;
                }
            }

            for (int x : getallen) {
                if (x == 500) {
                    break;

                }
            }
        }
    }
}


