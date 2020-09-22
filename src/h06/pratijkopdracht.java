package h06;

import java.applet.Applet;
import java.awt.*;

public class pratijkopdracht extends Applet {
    double getal;
    double getal2;
    double getal3;

    double res;


    public void init() {
        setSize(400, 400);

        getal =5.9;
        getal2 = 6.3;
        getal3 = 6.9;

        res = (getal + getal2 + getal3)/3;
        res =res * 10;
        res=(int)res;
        res=res/10;

    }


    public void paint(Graphics g) {

        //de rekensom laten aan te tonen op de applet
        g.drawString(String.valueOf(res),110,310);

    }
}