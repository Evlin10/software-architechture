/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.AppointmentController;
import model.Appointment;

import javax.swing.*;
import java.awt.*;

public class AppointmentPanel extends JPanel {

    public AppointmentPanel() {
        setLayout(new BorderLayout());

        AppointmentController controller = new AppointmentController();
        controller.loadAppointments("data/appointments.csv");

        JTextArea feed = new JTextArea();
        feed.setEditable(false);

        for (Appointment a : controller.getAppointments()) {
            feed.append(
                    a.getAppointmentId() + " | " +
                    a.getStatus() + "\n"
            );
        }

        add(new JLabel("Appointment Timeline"), BorderLayout.NORTH);
        add(new JScrollPane(feed), BorderLayout.CENTER);
    }
}
