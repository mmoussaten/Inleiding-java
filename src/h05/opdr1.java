package h05;

import java.applet.Applet;
import java.awt.*;

public class opdr1  extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {

        //lijn//
        g.drawLine(100,50,300,50);
        g.drawString("lijn",190,80);
        //teken rechthoek
        g.drawRect(100, 100, breedte, hoogte);
        g.drawString("rechthoek",170,220);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        g.drawString("afgeronde rechthoek",140,350);
        //teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        g.setColor(Color.black);
        g.drawString("gevulde rechthoek met ovaal",350,220);
        //teken ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        g.drawString("gevulde ovaal",380,350);
        //teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        //taartpunt met ovaal erom heen
        g.fillArc(600,100,200,100,0,45);
        g.setColor(Color.black);
        g.drawOval(600, 100, 200, 100);
        g.drawString("taartpunt met een ovaal erom heen ",630,220);
        // cirkel//
        g.setColor(Color.black);
        g.drawOval(650,230,100,100);
        g.drawString("een cirkel",670,355);


    }

}

