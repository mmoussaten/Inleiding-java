package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdr6 extends Applet {

    Button okknop;
    TextField tekstvak;
    boolean gevonden;
    boolean klikken;
    int index;
    int[] Tabel = {100, 200, 300, 400, 500};

    public void init() {

        tekstvak = new TextField(10);
        add(tekstvak);
        okknop = new Button("ok");
        add(okknop);
        okknop.addActionListener(new okknoplistener());


    }


    public void paint(Graphics g) {

        if (gevonden) {
            g.drawString("index is gevonden " + Integer.parseInt(tekstvak.getText()), 50, 50);
        } else {
            g.drawString("index is niet gevonden", 50, 50);
        }
    }

    class okknoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            gevonden = false;
            int input = Integer.parseInt(tekstvak.getText());
            klikken = true;

            for (int i = 0; i < Tabel.length; i++) {
                if (Tabel[i] == input) {
                    gevonden = true;
                    index = 100;
                }
            }
            {
                for (int x : Tabel) {
                    if (x == 500) {
                        break;

                    }
                }

                repaint();
            }

        }
    }
}

