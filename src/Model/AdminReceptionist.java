/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class AdminReceptionist extends User {

    private String staffId;
    private String role;
    private String facilityId;

    public AdminReceptionist(String staffId, String firstName, String lastName,
                             String role, String facilityId,
                             String phoneNumber, String email) {

        super(staffId, firstName, lastName, email, phoneNumber);
        this.staffId = staffId;
        this.role = role;
        this.facilityId = facilityId;
    }

    public void registerPatient(Patient patient) {
        // Registration handled via controller
    }
}
