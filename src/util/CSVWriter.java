/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.FileWriter;
import java.io.PrintWriter;

public class CSVWriter {

    public static void appendLine(String filePath, String[] values) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath, true))) {
            pw.println(String.join(",", values));
        } catch (Exception e) {
            System.out.println("CSV write error: " + e.getMessage());
        }
    }

    public static void writeTextFile(String filePath, String content) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath))) {
            pw.print(content);
        } catch (Exception e) {
            System.out.println("Text file write error: " + e.getMessage());
        }
    }
}
