/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Referral {

    private String referralId;
    private String referringFacilityId;
    private String referredToFacilityId;
    private String referralDate;
    private String urgencyLevel;
    private String referralReason;
    private String clinicalSummary;
    private String status;
    private String appointmentId;

    public Referral(String referralId, String referringFacilityId,
                    String referredToFacilityId, String referralDate,
                    String urgencyLevel, String referralReason,
                    String clinicalSummary, String status,
                    String appointmentId) {

        this.referralId = referralId;
        this.referringFacilityId = referringFacilityId;
        this.referredToFacilityId = referredToFacilityId;
        this.referralDate = referralDate;
        this.urgencyLevel = urgencyLevel;
        this.referralReason = referralReason;
        this.clinicalSummary = clinicalSummary;
        this.status = status;
        this.appointmentId = appointmentId;
    }

    public String getReferralId() {
        return referralId;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }
}
