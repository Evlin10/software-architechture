/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Referral;
import singleton.ReferralManager;

import java.util.List;

public class ReferralController {

    private final ReferralManager referralManager = ReferralManager.getInstance();

    public void loadReferrals(String filePath) {
        referralManager.loadReferrals(filePath);
    }

    public void createReferral(Referral referral, String filePath) {
        referralManager.addReferral(referral, filePath);
    }

    public List<Referral> getReferrals() {
        return referralManager.getReferrals();
    }
}
