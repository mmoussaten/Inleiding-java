package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr7 extends Applet {



    public void init() {
     setSize(2000,2000);
    }

    public void paint(Graphics g) {
        int teller;
        int x = 300;
        int y = 50;
        int x1 = 900;
        int y1 = 900;



        for (teller = 0; teller < 60; teller++) {

            g.drawOval(x, y, x1, y1);
            x += 10;
            y += 10;
            x1 -= 20;
            y1 -= 20;


        }
    }
}
