/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ReferralController;
import model.Referral;

import javax.swing.*;
import java.awt.*;

public class ReferralPanel extends JPanel {

    public ReferralPanel() {
        setLayout(new BorderLayout());

        ReferralController controller = new ReferralController();
        controller.loadReferrals("data/referrals.csv");

        JPanel statusPanel = new JPanel(new GridLayout(0, 1));
        
        for (Referral r : controller.getReferrals()) {
            statusPanel.add(new JLabel(
                    r.getReferralId() + " | " + r.getUrgencyLevel()
            ));
        }

        add(new JLabel("Referral Workflow"), BorderLayout.NORTH);
        add(new JScrollPane(statusPanel), BorderLayout.CENTER);
    }
}
