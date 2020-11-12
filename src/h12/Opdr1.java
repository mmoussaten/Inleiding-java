package h12;

import java.applet.Applet;
import java.awt.*;


public class Opdr1 extends Applet {

    int getallen[];
    int gemiddelde = 0;

    public void init() {

        getallen = new int[10];
        getallen[0] = 10;
        getallen[1] = 20;
        getallen[2] = 30;
        getallen[3] = 40;
        getallen[4] = 50;
        getallen[5] = 60;
        getallen[6] = 70;
        getallen[7] = 80;
        getallen[8] = 90;
        getallen[9] = 100;

    }

    public void paint(Graphics g) {


        for (int i = 0; i < getallen.length; i ++) {
            g.drawString("" + getallen[i], 120, 20 * i + 20);
            gemiddelde += getallen[i];
        }

        gemiddelde = gemiddelde / getallen.length;
        g.drawString("Gemiddelde: " + gemiddelde,50,230);
        g.drawLine(50,210,180,210);

    }
}