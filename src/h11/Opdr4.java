package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr4 extends Applet {
     int   i , y;

    public void init() {
        i=0;
        y=50;

    }

    public void paint(Graphics g){


            for (int i = 3; i < 33; i+=3) {
                g.drawString("" + i, 50, y);
                y += 20;

            }
        }
    }

