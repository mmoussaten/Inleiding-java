package h04;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class dobbelsteen extends JApplet{
    public void init () {setSize(700,700);}
    public void paint (Graphics g) {
        setBackground(Color.blue);
       // dobbelsteen
        g.drawRect(200,300,250,250);
        // 1/4 punten
        g.fillArc(250, 350, 50, 50, 80, 360);
        g.fillArc(350, 350, 50, 50, 80, 360);
        g.fillArc(250, 450, 50, 50, 80, 360);
        g.fillArc(350, 450, 50, 50, 80, 360);
     }
   }