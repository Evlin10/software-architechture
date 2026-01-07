/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Appointment;
import util.CSVReader;
import util.CSVWriter;

import java.util.ArrayList;
import java.util.List;

public class AppointmentController {

    private final List<Appointment> appointments = new ArrayList<>();

    public void loadAppointments(String filePath) {
        appointments.clear();
        List<String[]> rows = CSVReader.readCSV(filePath);

        for (String[] r : rows) {
            Appointment a = new Appointment(
                    r[0],                  // appointment_id
                    r[1],                  // patient_id
                    r[2],                  // clinician_id
                    r[3],                  // facility_id
                    r[4],                  // date
                    r[5],                  // time
                    Integer.parseInt(r[6]),// duration
                    r[7],                  // type
                    r[8],                  // status
                    r[9],                  // reason
                    r[10]                  // notes
            );
            appointments.add(a);
        }
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment, String filePath) {
        appointments.add(appointment);
        CSVWriter.appendLine(filePath, new String[]{
                appointment.getAppointmentId(),
                "", "", "", "", "", "", "", "", "", ""
        });
    }
}
