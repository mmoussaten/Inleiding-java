package h06;

import java.applet.Applet;
import java.awt.*;

public class opdr3 extends Applet {
    int getal;
    int getal2;
    int res;


    public void init() {
        setSize(400, 400);

        getal=80;
        getal2 =100;

        res= getal * 100 / getal2;


    }


    public void paint(Graphics g) {

        //de rekensom laten aan te tonen op de applet
        g.drawString(String.valueOf(res),110,310);



    }
}