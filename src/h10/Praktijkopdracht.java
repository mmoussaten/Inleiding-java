package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht extends Applet {

    String ingevuldeString = "";
    TextField TextField = new TextField("", 3);

    boolean ingevuldeCijfer;
    int ingevuldeCijferInt;


    public void init() {

        this.setSize(500, 300);
        add(TextField);
        TextField.addActionListener(new CheckTextFieldActionListener());
    }


    public void paint(Graphics g) {

        if (ingevuldeCijfer) {
            g.drawString("Uw cijfer is een " + ingevuldeCijferInt + ". Dit is " + ingevuldeString, 50, 60);
        } else {
            g.drawString("Vul een getal in tussen 0-10 buiten deze getallen is niet mogelijk!", 50, 60);
        }
    }

      class CheckTextFieldActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            ingevuldeCijfer = true;
            ingevuldeCijferInt = Integer.parseInt(TextField.getText());
            switch (ingevuldeCijferInt) {
                case 1:
                case 2:
                case 3:
                    ingevuldeString = "slecht.";
                    break;
                case 4:
                    ingevuldeString = "onvoldoende.";
                    break;
                case 5:
                    ingevuldeString = "matig.";
                    break;
                case 6:
                case 7:
                    ingevuldeString = "voldoende.";
                    break;
                case 8:
                case 9:
                case 10:
                    ingevuldeString = "goed.";
                    break;
                default:
                    ingevuldeCijfer = false;
                    break;
            }
            repaint();
        }
    }
}