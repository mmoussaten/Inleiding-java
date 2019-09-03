package h02;

        import java.awt.*;
        import java.applet.*;

public class h2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color. blue );
        g.drawString("Marwan ", 50, 60);
        g.setColor(Color. red );
        g.drawString("Moussaten", 50, 80);
    }
}
