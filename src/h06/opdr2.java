package h06;

import java.applet.Applet;
import java.awt.*;

  public class opdr2 extends Applet {
    int sec;
    int min;
    int uur;
    int daggen;
    int jaar;
    int res;

  public void init(){
    setSize(400, 400);
    sec = 1;
    min = 60;
    uur = 60;
    daggen = 24;
    jaar = 365;

 res = 60 * 60 * 24 *365;
}


    public void paint(Graphics g) {
        g.drawString("De opdracht van vandaag hoeveel seconde zit er in een jaar ?",50,190);
        g.drawString("In een minuut zit 60 sec",50,220);
        g.drawString("In een uur zit 3600 sec",50,240);
        g.drawString("In een dag zit 86400 ",50,260);

        g.drawString("In een jaar zit ",50,300);
        g.drawString("sec",190,300);
        g.drawString(String.valueOf(res),125,300);






    }
}