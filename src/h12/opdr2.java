package h12;

import java.applet.Applet;
import java.awt.*;

public class opdr2 extends Applet {

    Button[] knoppen;


    public void init() {

        knoppen = new Button[25];

        for (int teller = 0; teller < knoppen.length; teller ++) {
          knoppen[teller] = new Button("klik hier op");
          add(knoppen[teller]);

        }

    }

    public void paint(Graphics g) {

        }
    }