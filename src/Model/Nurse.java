/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Nurse extends Clinician {

    public Nurse(String clinicianId, String firstName, String lastName,
                 String title, String specialty, String gmcNumber,
                 String phoneNumber, String email, String workplaceId) {

        super(clinicianId, firstName, lastName, title,
              specialty, gmcNumber, phoneNumber, email, workplaceId);
    }

    public void provideClinicalSupport(String patientId) {
        // Clinical support logic placeholder
    }

    @Override
    public void viewPatientRecord(String patientId) {
        // Placeholder
    }
}
