/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class Clinician extends User {

    protected String clinicianId;
    protected String title;
    protected String specialty;
    protected String gmcNumber;
    protected String workplaceId;

    public Clinician(String clinicianId, String firstName, String lastName,
                     String title, String specialty, String gmcNumber,
                     String phoneNumber, String email, String workplaceId) {

        super(clinicianId, firstName, lastName, email, phoneNumber);
        this.clinicianId = clinicianId;
        this.title = title;
        this.specialty = specialty;
        this.gmcNumber = gmcNumber;
        this.workplaceId = workplaceId;
    }

    public String getClinicianId() {
        return clinicianId;
    }

    public String getSpecialty() {
        return specialty;
    }

    public abstract void viewPatientRecord(String patientId);
}
