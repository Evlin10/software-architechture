/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import model.Referral;
import util.CSVReader;
import util.CSVWriter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReferralManager {

    private static ReferralManager instance;
    private final List<Referral> referrals;

    private ReferralManager() {
        referrals = new ArrayList<>();
    }

    // Singleton access point
    public static ReferralManager getInstance() {
        if (instance == null) {
            instance = new ReferralManager();
        }
        return instance;
    }

    // Load existing referrals from CSV
    public void loadReferrals(String filePath) {
        referrals.clear();
        List<String[]> rows = CSVReader.readCSV(filePath);

        for (String[] r : rows) {
            Referral referral = new Referral(
                    generateReferralId(),
                    r[0],   // referring_facility_id
                    r[1],   // referred_to_facility_id
                    getTodayDate(),
                    r[2],   // urgency_level
                    r[3],   // referral_reason
                    r[4],   // clinical_summary
                    r[5],   // status
                    ""      // appointment_id (optional)
            );
            referrals.add(referral);
        }
    }

    // Add a new referral and persist it
    public void addReferral(Referral referral, String filePath) {
        referrals.add(referral);

        CSVWriter.appendLine(filePath, new String[]{
                referral.getReferralId(),
                referral.getUrgencyLevel()
        });

        generateReferralText(referral);
    }

    public List<Referral> getReferrals() {
        return referrals;
    }

    // Generate human-readable referral "email"
    private void generateReferralText(Referral referral) {
        String content =
                "REFERRAL NOTICE\n" +
                "-------------------------\n" +
                "Referral ID: " + referral.getReferralId() + "\n" +
                "Urgency: " + referral.getUrgencyLevel() + "\n" +
                "Status: Sent\n\n" +
                "This referral has been generated electronically.\n";

        CSVWriter.writeTextFile(
                "data/referral_" + referral.getReferralId() + ".txt",
                content
        );
    }

    private String generateReferralId() {
        return "REF-" + System.currentTimeMillis();
    }

    private String getTodayDate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
}
