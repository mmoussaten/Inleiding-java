package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdr2 extends Applet {

    Button Mannen,Vrouwen,Jongens,Meisjes;
    int AantalMannen,AantalVrouwen,AantalJongens,AantalMeisjes;

    public void init() {
        Mannen = new Button("Mannen +1");
        Vrouwen = new Button("Vrouwen +1");
        Jongens = new Button("Jongens +1");
        Meisjes = new Button("Meisjes +1");

//        Voeg listeners toe aan knoppen
        Mannen.addActionListener(new ManButtonListener());
        Vrouwen.addActionListener(new VrouwButtonListener());
        Jongens.addActionListener(new JongensButtonListener());
        Meisjes.addActionListener(new MeisjesButtonListener());

//        Voeg buttons toe aan applet
        add(Mannen);
        add(Vrouwen);
        add(Jongens);
        add(Meisjes);
    }

    public void paint (Graphics g) {
        g.drawString("Mannen: " + AantalMannen,50,50);
        g.drawString("Vrouwen: " + AantalVrouwen,50,70);
        g.drawString("Jongens: " + AantalJongens,50,90);
        g.drawString("Meisjes: " + AantalMeisjes,50,110);
        g.drawString("Totaal: " + (AantalMannen + AantalVrouwen + AantalJongens + AantalMeisjes),50,130);
    }


//    Knop listeners
    class ManButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            AantalMannen = AantalMannen + 1;
            repaint();
        }
    }
    class VrouwButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            AantalVrouwen = AantalVrouwen + 1;
            repaint();
        }
    }
    class JongensButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            AantalJongens = AantalJongens + 1;
            repaint();
        }
    }
    class MeisjesButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            AantalMeisjes = AantalMeisjes + 1;
            repaint();
        }
    }
}
