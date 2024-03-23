package com.salihpolat;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static List<Personnel> readFromJsonFile(String fileName) {
        List<Personnel> personnelList = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try (FileReader fileReader = new FileReader(fileName)) {
            Object obj = parser.parse(fileReader);
            JSONArray personnelArray = (JSONArray) obj;
            for (Object o : personnelArray) {
                JSONObject personnelJson = (JSONObject) o;
                ERole role = ERole.valueOf((String) personnelJson.get("role"));
                if (role == ERole.MANAGER) {
                    Manager manager = new Manager();
                    personnelList.add(manager);
                } else if (role == ERole.OFFICER) {
                    Officer officer = new Officer();
                    personnelList.add(officer);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personnelList;
    }
}
