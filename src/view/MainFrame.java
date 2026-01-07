/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JPanel contentPanel;

    public MainFrame() {
        setTitle("Healthcare Management System");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(createNavigationPanel(), BorderLayout.WEST);
        contentPanel = new JPanel(new BorderLayout());
        add(contentPanel, BorderLayout.CENTER);

        showPanel(new PatientPanel());
    }

    private JPanel createNavigationPanel() {
        JPanel nav = new JPanel();
        nav.setLayout(new GridLayout(4, 1, 5, 5));
        nav.setPreferredSize(new Dimension(200, 0));

        JButton patientsBtn = new JButton("Patients");
        JButton appointmentsBtn = new JButton("Appointments");
        JButton prescriptionsBtn = new JButton("Prescriptions");
        JButton referralsBtn = new JButton("Referrals");

        patientsBtn.addActionListener(e -> showPanel(new PatientPanel()));
        appointmentsBtn.addActionListener(e -> showPanel(new AppointmentPanel()));
        prescriptionsBtn.addActionListener(e -> showPanel(new PrescriptionPanel()));
        referralsBtn.addActionListener(e -> showPanel(new ReferralPanel()));

        nav.add(patientsBtn);
        nav.add(appointmentsBtn);
        nav.add(prescriptionsBtn);
        nav.add(referralsBtn);

        return nav;
    }

    private void showPanel(JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
}
