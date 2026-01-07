/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.PatientController;
import model.Patient;

import javax.swing.*;
import java.awt.*;

public class PatientPanel extends JPanel {

    private final PatientController controller = new PatientController();
    private final DefaultListModel<String> listModel = new DefaultListModel<>();
    private final JTextArea detailsArea = new JTextArea();

    public PatientPanel() {
        setLayout(new BorderLayout());

        controller.loadPatients("data/patients.csv");

        JList<String> patientList = new JList<>(listModel);
        for (Patient p : controller.getPatients()) {
            listModel.addElement(p.getPatientId() + " - " + p.getFullName());
        }

        patientList.addListSelectionListener(e -> {
            int index = patientList.getSelectedIndex();
            if (index >= 0) {
                Patient p = controller.getPatients().get(index);
                showPatientDetails(p);
            }
        });

        detailsArea.setEditable(false);

        add(new JScrollPane(patientList), BorderLayout.WEST);
        add(new JScrollPane(detailsArea), BorderLayout.CENTER);
    }

    private void showPatientDetails(Patient p) {
        detailsArea.setText(
                "Patient ID: " + p.getPatientId() + "\n" +
                "Name: " + p.getFullName() + "\n" +
                "GP Surgery: " + p.getGpSurgeryId()
        );
    }
}
