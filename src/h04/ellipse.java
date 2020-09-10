package h04;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

       public class ellipse extends JApplet{
           public void init () {setSize(700,700);}
           public void paint (Graphics g) {
               setBackground(Color.blue);
               g.setColor(Color.yellow);
               g.fillArc(150, 150, 200, 150, 180, 360);

           }
       }
