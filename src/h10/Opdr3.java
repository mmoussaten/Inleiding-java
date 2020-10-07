package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr3 extends Applet {

    TextField tekstvak;
    Button okKnop;
    int maandNummer, aantalDagen;
    String maandNaam;


    public void init() {
        tekstvak = new TextField("",10);
        okKnop = new Button("Ok");

        tekstvak.addActionListener(new okListener());
        okKnop.addActionListener(new okListener());

        add(tekstvak);
        add(okKnop);

    }

    public void paint (Graphics g){
        g.drawString("Maand: " + maandNaam,80,80);
        g.drawString("Aantal Dagen: " + aantalDagen,80,95);

    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            maandNummer = Integer.parseInt(tekstvak.getText());
            switch(maandNummer) {
                case 1:
                    maandNaam = "Januari";
                    aantalDagen = 31;
                    break;
                case 2:
                    maandNaam = "Februari";
                    aantalDagen = 28;
                    break;
                case 3:
                    maandNaam = "Maart";
                    aantalDagen = 31;
                    break;
                case 4:
                    maandNaam = "April";
                    aantalDagen = 30;
                    break;
                case 5:
                    maandNaam = "Mei";
                    aantalDagen = 31;
                    break;
                case 6:
                    maandNaam = "Juni";
                    aantalDagen = 30;
                    break;
                case 7:
                    maandNaam = "Juli";
                    aantalDagen = 31;
                    break;
                case 8:
                    maandNaam = "Augustus";
                    aantalDagen = 31;
                    break;
                case 9:
                    maandNaam = "September";
                    aantalDagen = 30;
                    break;
                case 10:
                    maandNaam = "Oktober";
                    aantalDagen = 31;
                    break;
                case 11:
                    maandNaam = "November";
                    aantalDagen = 0;
                    break;
                case 12:
                    maandNaam = "December";
                    aantalDagen = 31;
                    break;
                default:
                    maandNaam = "Antwoord is geen maand";
                    aantalDagen = 0;
                    break;
            }

            repaint();
        }
    }

}
