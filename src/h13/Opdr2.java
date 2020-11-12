package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdr2 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        tekenrooiemuur (g,75,50);
    }

    void tekenrooiemuur ( Graphics g, int x2, int y2) {

        int x1 = 25;
        int y1 = 100;
        int reset = 2;

        for (int i = 0; i < 9; i++) {

            x1 += x2;
            g.setColor(Color.red);
            g.fillRect(x1,y1,x2,y2);
            g.setColor(Color.black);
            g.drawRect(x1,y1,x2,y2);

            if ( i == reset){
                y1 += y2;
                reset += 3;
                x1 = 25;
            }
        }
    }
}