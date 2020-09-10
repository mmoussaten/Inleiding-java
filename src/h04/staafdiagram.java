package h04;

    import javax.swing.*;
    import java.applet.Applet;
    import java.awt.*;

    public class staafdiagram extends Applet {
        public void init() {
            setSize(700, 700);
        }
        public void paint (Graphics g ) {
            setBackground(Color.white);
            // grijze rechthoek
            g.setColor(Color.DARK_GRAY);
            g.fillRect(290, 200, 310, 10);
            g.fillRect(290,50,10,150);
            // eerste kleur
            g.setColor(Color.red);
            g.fillRect(300,150,100,50);
            g.drawString("Valerie", 310, 250);
            g.setColor(Color.darkGray);
            g.drawString("40 kg",235,150);

            // tweede kleur,
            g.setColor(Color.green);
            g.fillRect(400,100,100,100);
            g.drawString("jeroen",420,250);
            g.setColor(Color.darkGray);
            g.drawString("100 kg",230 ,110);

            //derde kleur
            g.setColor(Color.blue);
            g.fillRect(500,130,100,70);
            g.setColor(Color.blue);
            g.drawString("Hans",520,250);
            g.setColor(Color.darkGray);
            g.drawString("80 kg",235,130);




        }
    }
