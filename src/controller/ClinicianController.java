/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.*;
import util.CSVReader;

import java.util.ArrayList;
import java.util.List;

public class ClinicianController {

    private final List<Clinician> clinicians = new ArrayList<>();

    public void loadClinicians(String filePath) {
        clinicians.clear();
        List<String[]> rows = CSVReader.readCSV(filePath);

        for (String[] r : rows) {
            // All clinicians treated as GPs unless otherwise extended
            Clinician c = new GeneralPractitioner(
                    r[0],  // clinician_id
                    r[1],  // first_name
                    r[2],  // last_name
                    r[3],  // title
                    r[4],  // specialty
                    r[5],  // gmc_number
                    r[6],  // phone
                    r[7],  // email
                    r[8]   // workplace_id
            );
            clinicians.add(c);
        }
    }

    public List<Clinician> getClinicians() {
        return clinicians;
    }

    public Clinician getClinicianById(String clinicianId) {
        for (Clinician c : clinicians) {
            if (c.getClinicianId().equals(clinicianId)) {
                return c;
            }
        }
        return null;
    }
}
