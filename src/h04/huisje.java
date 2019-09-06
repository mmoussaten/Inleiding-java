package h04;


import java.awt.*;
import java.applet.*;

public class huisje extends Applet {

    public void init() {
        setSize(700,700);
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        // Gebouw
        g.drawRect(300, 350, 300, 250);
        // Dak
        g.drawLine(300, 350, 350, 250);
        g.drawLine(600, 350, 550, 250);
        g.drawLine(350, 250, 550, 250);
        //dak 2
        g.drawLine(350,100,450,50);
        g.drawLine(550,100,450,50);
        // Schoorsteen
        g.drawRect(450, 100, 50, 150);
        g.drawRect(400, 100, 50, 150);
        g.drawRect(350, 100, 50, 150);
        g.drawRect(500, 100, 50, 150);
        // Raam
        g.drawRect(350, 400, 100, 100);
        g.drawRect(500, 450,  60,  150);
    }
}