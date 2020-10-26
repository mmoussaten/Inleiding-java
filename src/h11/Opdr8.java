package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr8 extends Applet {



    public void init() {
    setSize(2000,2000);
    }

    public void paint(Graphics g) {
        int teller;
        int x = 100;
        int y = 10;
        int x1 = 1000;
        int y1 = 1000;



        for (teller = 0; teller < 150; teller++) {

            g.drawOval(x, y, x1, y1);
            x += 10;
            y += 10;
            x1 -= 20;
            y1 -= 20;


        }
    }
}
