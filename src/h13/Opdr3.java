package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr3 extends Applet {

     int breedte;
     int lengte;
     Color kleur;
     Button rodemuur;
     Button grijzemuur;

    public void init() {
        setSize(800,1000);

        rodemuur = new Button("rooie muur !");
        grijzemuur = new Button("grijze muur!");

        rodemuur.addActionListener(new rodeactionlistener());
        grijzemuur.addActionListener(new grijzemuurlistener());

        add(rodemuur);
        add(grijzemuur);
    }


    public void paint(Graphics g) {
        tekenmuur(g,lengte,breedte,kleur);
    }



        class rodeactionlistener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                lengte = 100;
                breedte = 150;
                kleur = Color.red;
                repaint();
            }
        }

        class grijzemuurlistener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                lengte = 150;
                breedte = 200;
                kleur = Color.darkGray;
                repaint();
            }
        }

     void tekenmuur(Graphics g,int x1 , int y1,Color kleur) {

        int x = 25;
        int y = 100;
        int reset = 2;

        for (int i = 0; i < 9; i++) {

            x += x1;
            g.setColor(kleur);
            g.fillRect(x, y, x1, y1);
            g.setColor(Color.black);
            g.drawRect(x, y, x1, y1);

            if (i == reset) {
                y += y1;
                reset += 3;
                x = 25;
            }
        }

    }
}
