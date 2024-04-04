package com.salihpolat;


import net.minidev.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PayrollGenerator {

    public static void calculateSalary(List<Personnel> personnelList) {
        for (Personnel personnel : personnelList) {
            JSONObject payrollJson = new JSONObject();
            payrollJson.put("bordro", "SUBAT 2020");
            JSONObject personnelJson = new JSONObject();
            personnelJson.put("ismi", personnel.getName());
            personnelJson.put("calismaSaati", personnel.getWorkingHour());
            JSONObject payDetail = new JSONObject();
            payDetail.put("anaOdeme", "₺" + personnel.payroll());
            payDetail.put("mesai", "₺0.00");
            payDetail.put("toplamOdeme", "₺" + personnel.payroll());
            personnelJson.put("odemeDetaylari", payDetail);
            payrollJson.put("personel", personnelJson);

            String fileName = personnel.getName() + ".json";

            try (FileWriter file = new FileWriter(fileName)) {
                file.write(payrollJson.toJSONString());
                System.out.println("JSON file created: " + fileName);
            } catch (IOException e) {
                System.out.println("An error occurred while writing JSON file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void reportLowWorkingHours(List<Personnel> personnelList) {
        for (Personnel personnel : personnelList) {
            if (personnel.getWorkingHour() < 150) {
                System.out.println(personnel.getName() + " " + personnel.getSurname() + " works less than 150 hours!");
            }
        }
    }
}
