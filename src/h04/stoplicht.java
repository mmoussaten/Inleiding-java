package h04;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;


      public class stoplicht extends Applet {

          public void init() {
              setSize(700, 700);
          }

          public void paint(Graphics g) {
              setBackground(Color.white);
              {
                  // PAAL
                  g.fillRect(310, 250, 30, 300);
                  g.fillRect(275,150,100,190);
                  // lichten van een stoplicht
                  g.setColor(Color.red);
                  g.fillOval(305,170,40,40);
                  g.setColor(Color.orange);
                  g.fillOval(305,220,40,40);
                  g.setColor(Color.GREEN);
                  g.fillOval(305,270,40,40);
              }







          }
      }

