/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Drug {

    private String name;
    private String dosage;
    private String frequency;

    public Drug(String name, String dosage, String frequency) {
        this.name = name;
        this.dosage = dosage;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public String getDosage() {
        return dosage;
    }

    public String getFrequency() {
        return frequency;
    }
}
