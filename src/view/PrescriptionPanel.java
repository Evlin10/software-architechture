/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.PrescriptionController;
import model.Prescription;

import javax.swing.*;
import java.awt.*;

public class PrescriptionPanel extends JPanel {

    public PrescriptionPanel() {
        setLayout(new BorderLayout());

        PrescriptionController controller = new PrescriptionController();
        controller.loadPrescriptions("data/prescriptions.csv");

        JTextArea area = new JTextArea();
        area.setEditable(false);

        for (Prescription p : controller.getPrescriptions()) {
            area.append(
                    "Prescription: " + p.validateDrugAndDosage() +
                    " | Status: OK\n"
            );
        }

        add(new JLabel("Prescription Review"), BorderLayout.NORTH);
        add(new JScrollPane(area), BorderLayout.CENTER);
    }
}
