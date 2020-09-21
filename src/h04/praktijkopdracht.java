package h04;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht extends Applet{



    public void init() {

    }

    public void paint(Graphics g) {

        //lijn//
        g.drawLine(100,50,300,50);
        g.drawString("lijn",190,80);
        //teken rechthoek
        g.drawRect(100, 100, 200, 100);
        g.drawString("rechthoek",170,220);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 225, 200, 100, 30, 30);
        g.drawString("afgeronde rechthoek",140,350);
        //teken gevulde rechthoek
        g.setColor(Color.MAGENTA);
        g.fillRect(315, 100, 200, 100);
        g.setColor(Color.black);
        g.drawString("gevulde rechthoek met ovaal",350,220);
        //teken ovaal
        g.setColor(Color.black);
        g.drawOval(315, 100, 200, 100);
        g.drawString("gevulde ovaal",380,350);
        //teken gevulde ovaal
        g.setColor(Color.MAGENTA);
        g.fillOval(315, 225, 200, 100);
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
