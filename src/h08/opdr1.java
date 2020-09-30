package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdr1 extends Applet {

    TextField tekstvak;
    Button verzendknop;
    Button resetknop;
    String message;

    public void init() {
        setSize(400,400);
     tekstvak = new TextField(20);
     add(tekstvak);

     verzendknop = new Button("verzenden");
     verzendknop.addActionListener(new KnopverzendListener());
     add(verzendknop);

     resetknop = new Button("reset");
     resetknop.addActionListener(new KnopresetListener());
     add(resetknop);

     message="er is nog niets getypt";
    }

    public void paint (Graphics g){
        g.drawString(message,20,150);
    }
   class KnopverzendListener implements ActionListener {

       public void actionPerformed(ActionEvent e) {
         message = tekstvak.getText();
        repaint();
       }
    }
    class KnopresetListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
          tekstvak.setText(" ");
        }
    }
}
