/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Prescription {

    private String prescriptionId;
    private String patientId;
    private String clinicianId;
    private String appointmentId;
    private String prescriptionDate;
    private Drug drug;
    private int durationDays;
    private String pharmacyName;
    private String status;

    public Prescription(String prescriptionId, String patientId,
                        String clinicianId, String appointmentId,
                        String prescriptionDate, Drug drug,
                        int durationDays, String pharmacyName,
                        String status) {

        this.prescriptionId = prescriptionId;
        this.patientId = patientId;
        this.clinicianId = clinicianId;
        this.appointmentId = appointmentId;
        this.prescriptionDate = prescriptionDate;
        this.drug = drug;
        this.durationDays = durationDays;
        this.pharmacyName = pharmacyName;
        this.status = status;
    }

    public boolean validateDrugAndDosage() {
        return drug != null &&
               drug.getName() != null &&
               drug.getDosage() != null;
    }
}
