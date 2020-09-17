package h06;

import java.applet.Applet;
import java.awt.*;

public class opdr1 extends Applet {
    //variabelen declaren
    float karwei;
    float  res;

    public void init() {
        setSize(400, 400);

        // variabelen initialere
        karwei=113;
        res =karwei/4;


    }

    public void paint(Graphics g) {

        //bedrag wat Jan heeft verdient
        g.drawString("Jan =",70,310);
        g.drawString(String.valueOf(res),110,310);
        //bedrag wat Ali heeft verdient
        g.drawString("Ali =",70,330);
        g.drawString(String.valueOf(res),100,330);
        //bedrag wat Jeannette heeft verdient
        g.drawString("Jeannette =",70,350);
        g.drawString(String.valueOf(res),140,350);
        //bedrag wat Marouane heeft verdient
        g.drawString("Marouane =",70,370);
        g.drawString(String.valueOf(res),140,370);

    }
}