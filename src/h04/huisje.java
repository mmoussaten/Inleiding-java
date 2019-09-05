package h04;


import java.awt.*;
import java.applet.*;

public class huisje extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.drawRect(70, 90, 200, 140);
        g.drawRect(70, 140, 200, 140);
        g.fillRect(70, 140, 200, 140);
        g.fillRect(70, 140, 200, 140);
    }

}