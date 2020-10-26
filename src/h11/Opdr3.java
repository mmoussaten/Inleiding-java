package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr3 extends Applet {

    int a , b , uitkomst,y;

    public void init() {
        a=0;
        b=0;
        uitkomst=1;
        y=50;
        setSize(100,700);
    }

    public void paint(Graphics g) {

        for (int i = 0; i <30; i++){
            g.drawString(uitkomst + "",50 ,y);
            y+= 20;
            a = b;
            b = uitkomst;
            uitkomst = a + b;
          }
        }
    }


