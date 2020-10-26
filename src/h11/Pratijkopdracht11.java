package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pratijkopdracht11 extends Applet {
    TextField tekstvak;
    Button okknop;
    Button volgendeknop;
    int invoer = 0;

    public void init() {


        this.setSize(500,500);
        tekstvak = new TextField("", 5);
        okknop = new Button("Ok");
        okknop.addActionListener( new okknopListener());
        volgendeknop = new Button("Volgende tafel");
        volgendeknop.addActionListener( new volgendeknopListener() );



        add(tekstvak);
        add(okknop);
        add(volgendeknop);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 60;


        if (invoer >0){
            while(teller <= 10) {

                g.drawString(""+ teller + "x" + invoer + "=" + (teller*invoer),70,y);

                y += 20;
                teller++;
            }
        }
        tekstvak.setText("");
    }

    class okknopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            invoer = Integer.parseInt(tekstvak.getText());
            repaint();
        }
    }

    class volgendeknopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            invoer = invoer+1;
            repaint();
        }
    }
}
