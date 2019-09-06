package h04;

import java.applet.Applet;
import java.awt.*;

       public class NederlandseVlag extends Applet {
           public void init() {
               setSize(700, 700);
           }

           public void paint(Graphics g) {
               setBackground(Color.white);
               // paal
               g.setColor(Color.DARK_GRAY);
               g.fillRect(20, 350, 20, 250);
               g.fillOval(10,590,40,20);
               // vlag
               g.setColor(Color.red);
               g.fillRect(40, 350, 100, 30);
               g.setColor(Color.white);
               g.fillRect(40, 380, 100, 30);
               g.setColor(Color.blue);
               g.fillRect(40, 410, 100, 30);

           }
       }