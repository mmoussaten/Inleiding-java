package h10;

import javax.swing.*;
import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr5 extends Applet {

    TextField numberTextfield;
    Button addGradeButton, averageButton;
    String status,finalGradeStatus;
    double gradeInput, average,finalGrade;

    public void init() {
        status = "";
        finalGradeStatus = "";
        numberTextfield = new TextField("",10);
        addGradeButton = new Button("+");
        averageButton = new Button("Bereken gemiddelde");

        addGradeButton.addActionListener(new addGradeListener());
        averageButton.addActionListener(new okButtonListener());

        add(numberTextfield);
        add(addGradeButton);
        add(averageButton);
    }

    public void paint (Graphics g){
        g.drawString("Nieuw Cijfer: " + gradeInput,80,80);
        g.drawString(status,80, 95);
        g.drawString("Gemiddelde: " + finalGrade,80, 115);
        g.drawString(finalGradeStatus ,80, 130);
    }

    class addGradeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gradeInput = Double.parseDouble(numberTextfield.getText());
            if (gradeInput >= 5.5 && gradeInput <= 10) {
                status = "Voldoende";
                if (average != 0) {
                    average = (average + gradeInput) / 2;
                } else {
                    average = gradeInput;
                }
            } else if(gradeInput < 5.5 && gradeInput >= 1) {
                status = "Onvoldoende";
                if (average != 0) {
                    average = (average + gradeInput) / 2;
                } else {
                    average = gradeInput;
                }
            } else {
                status = "Incorrect cijfer";
            }
            repaint();
        }
    }
    class okButtonListener implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            finalGrade = average;
            if (finalGrade >= 5.5 && finalGrade <= 10) {
                finalGradeStatus = "Voldoende";
            } else if(finalGrade < 5.5 && finalGrade >= 1) {
                finalGradeStatus = "Onvoldoende";
            } else {
                finalGradeStatus = "Incorrect cijfer";
            }
            repaint();
        }
    }
}
