package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr4 extends Applet {

    TextField tekstvak, tekstvakJaartal;
    Label maandLabel, jaarLabel;
    Button okKnop;
    int maandNummer, aantalDagen, jaartal;
    String maandNaam;


    public void init() {
        maandLabel = new Label("Maand nummer: ");
        jaarLabel = new Label("Jaartal: ");
        tekstvak = new TextField("",10);
        tekstvakJaartal = new TextField("",10);
        okKnop = new Button("Ok");

        okKnop.addActionListener(new okListener());

        add(maandLabel);
        add(tekstvak);
        add(jaarLabel);
        add(tekstvakJaartal);
        add(okKnop);

    }

    public void paint (Graphics g){
        g.drawString("Maand: " + maandNaam,80,80);
        g.drawString("Aantal Dagen: " + aantalDagen,80,95);

    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            maandNummer = Integer.parseInt(tekstvak.getText());
            jaartal = Integer.parseInt(tekstvakJaartal.getText());
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

//            Kijk of jaar een schrikkeljaar is
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0) {
                if(maandNummer == 2) {
                    aantalDagen = aantalDagen + 1;
                }
            }

            repaint();
        }
    }

}
