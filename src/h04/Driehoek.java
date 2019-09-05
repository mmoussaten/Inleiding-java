package h04;


import java.applet.Applet;
import java.awt.*;

public class Driehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50,100,100,100);
        g.drawLine(50,100,75,75);
        g.drawLine(100,100,75,75);
    }

}