/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Drug;
import model.Prescription;
import util.CSVReader;
import util.CSVWriter;

import java.util.ArrayList;
import java.util.List;

public class PrescriptionController {

    private final List<Prescription> prescriptions = new ArrayList<>();

    public void loadPrescriptions(String filePath) {
        prescriptions.clear();
        List<String[]> rows = CSVReader.readCSV(filePath);

        for (String[] r : rows) {
            Drug drug = new Drug(
                    r[5],  // medication_name
                    r[6],  // dosage
                    r[7]   // frequency
            );

            Prescription p = new Prescription(
                    r[0],  // prescription_id
                    r[1],  // patient_id
                    r[2],  // clinician_id
                    r[3],  // appointment_id
                    r[4],  // date
                    drug,
                    Integer.parseInt(r[8]), // duration_days
                    r[11], // pharmacy
                    r[12]  // status
            );
            prescriptions.add(p);
        }
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void addPrescription(Prescription prescription, String filePath) {
        if (prescription.validateDrugAndDosage()) {
            prescriptions.add(prescription);
            CSVWriter.appendLine(filePath, new String[]{
                    "", "", "", "", "", "", "", "", "", "", "", "", ""
            });
        }
    }
}
