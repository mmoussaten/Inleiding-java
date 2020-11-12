package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr4 extends Applet {

    Button okknop;
    TextField tektsvak;
    Boolean gevonden;
    double gezocht;
    double[] salaris = { 100,200,300,400,500};

    public void init() {
         gezocht = 100;
         gevonden = false;


        tektsvak = new TextField("",5);
        add(tektsvak);

        okknop = new Button("OK");
        add(okknop);
        okknop.addActionListener(new okknoplistener());

    }

    public void paint(Graphics g)  {
        g.drawString("de index waarde is 100! ",20,70);

        if(gevonden == true) {
            g.drawString("De waarde is gevonden.", 20, 50);

        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
    }


 class okknoplistener implements ActionListener {
     public void actionPerformed(ActionEvent e) {
         int teller = 0;
         while(teller < salaris.length) {
             if(salaris[teller] == gezocht) {
                 gevonden = true;
             }
             teller ++;
          }
         repaint();
        }
    }
}