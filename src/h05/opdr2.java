package h05;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class opdr2 extends Applet {
    //variabelen Declaren
    int gewichtvalerie;
    int gewichtjeroen;
    int gewichthans;
    int hoogtexas;

    public void init() {
        setSize(400, 400);
        hoogtexas = 350;
        gewichtvalerie = 45;
        gewichtjeroen = 100;
        gewichthans = 80;
    }
    public void paint (Graphics g ) {

        //verticale as
        g.drawLine(50, 50, 50, hoogtexas);
        //horizontale as
        g.drawLine(50, hoogtexas, hoogtexas, hoogtexas);

        // getalen aan de zijkant in kg
        g.drawString("0kg",25,350);
        g.drawString("20kg",20,330);
        g.drawString("40kg",20,310);
        g.drawString("60kg",20,290);
        g.drawString("80kg",20,270);
        g.drawString("100kg",15,250);

        // namen van de personen onder de staven
        g.drawString("Valerie",70,370);
        g.drawString("jeroen",150,370);
        g.drawString("hans",240,370);

        //Tekenen van de staven
        // 1. Valerie
        g.setColor(Color.blue);
        g.fillRect(50, hoogtexas - gewichtvalerie, 80, gewichtvalerie);

        //2.Jeroen
        g.setColor(Color.red);
        g.fillRect(130 , hoogtexas - gewichtjeroen ,80 ,gewichtjeroen);

        //3.Hans
        g.setColor(Color.green);
        g.fillRect(210 , hoogtexas - gewichthans ,80 ,gewichthans);


    }
}
