package h02;

import java.applet.Applet;
import java.awt.*;

public class Op1 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Marwan ", 50, 60);
    }
}