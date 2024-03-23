package com.salihpolat;

import java.util.List;

public class Program {

    public static void main(String[] args) {

        String fileName = "src/main/resources/personnel.json";
        List<Personnel> personnelList = ReadFile.readFromJsonFile(fileName);
        PayrollGenerator.calculateSalary(personnelList);
        PayrollGenerator.reportLowWorkingHours(personnelList);
    }
}