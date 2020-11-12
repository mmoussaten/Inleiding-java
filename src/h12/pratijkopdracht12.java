package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pratijkopdracht12 extends Applet {

    boolean gevonden =false;
    int teller = 0;
    int[] telefoon ;
    TextField tektsvaknaam;
    TextField tektsvaknummer;
    Button okknop;
    String[] namen;

    public void init() {
        setSize(500,500);

        Label naam = new Label("naam");
        tektsvaknaam = new TextField(15);
        Label nummer = new Label("Telefoonnummer");
        tektsvaknummer = new TextField(15);

        okknop = new Button("OK");


         tektsvaknaam.addActionListener(new tekstvakListener());
         tektsvaknummer.addActionListener(new tekstvakListener());
         okknop.addActionListener(new tekstvakListener());

         add(naam);
         add(tektsvaknaam);
         add(nummer);
         add(tektsvaknummer);
         add(okknop);

         namen = new String[10];
         telefoon = new int[10];
    }


    public void paint(Graphics g) {

        g.drawString("(Naam)",90,80);
        g.drawString("(Nummer)",220,80);
        if (gevonden) {
            for (int teller = 0; teller < namen.length; teller++) {
                g.drawString(namen[teller], 100, 100 + (teller * 20));
                g.drawString("" +telefoon[teller], 230,100 + (teller * 20));
            }
        }
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            gevonden = true;
            String naam = tektsvaknaam.getText();
            String cijfers = tektsvaknummer.getText();
            int tel = Integer.parseInt(cijfers);

            namen[teller] = naam;
            telefoon[teller] = tel;

            if (teller == 10) {
                gevonden = true;
            }

            teller += 1;
            repaint();
        }
    }
}
