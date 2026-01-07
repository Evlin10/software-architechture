/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class GeneralPractitioner extends Clinician {

    public GeneralPractitioner(String clinicianId, String firstName, String lastName,
                               String title, String specialty, String gmcNumber,
                               String phoneNumber, String email, String workplaceId) {

        super(clinicianId, firstName, lastName, title,
              specialty, gmcNumber, phoneNumber, email, workplaceId);
    }

    public void createReferral(String patientId, String reason) {
        // Handled via ReferralManager (Singleton)
    }

    @Override
    public void viewPatientRecord(String patientId) {
        // Placeholder for viewing patient details
    }
}
