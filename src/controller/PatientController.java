/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Patient;
import util.CSVReader;
import util.CSVWriter;

import java.util.ArrayList;
import java.util.List;

public class PatientController {

    private final List<Patient> patients = new ArrayList<>();

    public void loadPatients(String filePath) {
        patients.clear();
        List<String[]> rows = CSVReader.readCSV(filePath);

        for (String[] r : rows) {
            Patient p = new Patient(
                    r[0],   // patient_id
                    r[1],   // first_name
                    r[2],   // last_name
                    r[3],   // date_of_birth
                    r[4],   // nhs_number
                    r[5],   // gender
                    r[6],   // phone
                    r[7],   // email
                    r[8],   // address
                    r[9],   // postcode
                    r[12]   // gp_surgery_id
            );
            patients.add(p);
        }
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void addPatient(Patient patient, String filePath) {
        patients.add(patient);
        CSVWriter.appendLine(filePath, new String[]{
                patient.getPatientId(),
                patient.getFullName().split(" ")[0],
                patient.getFullName().split(" ")[1],
                "", "", "", patient.getPhoneNumber(),
                patient.getEmail(), "", "", "", "", ""
        });
    }
}
