package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr6 extends Applet {



    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int x = 70;
        int y = 70;
        int x1 = 90;
        int y1 = 90;



        for (teller = 0; teller < 5; teller++) {

            g.drawOval(x, y, x1, y1);
            x += 10;
            y += 10;
            x1 -= 20;
            y1 -= 20;


        }
     }
   }
