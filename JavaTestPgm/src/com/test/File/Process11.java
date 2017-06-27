/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.File;

/**
 *
 * @author Mahadev
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Process11 {

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/dindayal/Documents/ordertrackingserv/src/main/java/com/credr/ordertracker/nav/input.csv"));
        String line = "";

        String[] fieldName = new String[]{"addMap", "releaseVersion", "skewId", "productId"};
        while ((line = bufferedReader.readLine()) != null) {
            String[] strings = line.split(",");
            String jsonString = "{" + "\"" + fieldName[0] + "\"" +":" + strings[0] + ","
                    + "\"" + fieldName[1] + "\""+":" + strings[1] + ","
                    + "\""  + fieldName[2] + "\""+":" + strings[2] + ","
                    + "\"" + fieldName[3]+ "\"" +":" + Integer.parseInt(strings[3]) +"}";


            ProcessBuilder pb = new ProcessBuilder(
                    "curl",
                    "-H",
                    "Content-Type: application/json",
                    "-X",
                    "PUT",
                    "-d",
                    jsonString,
                    "http://localhost:8080/api/v1/user/1/order");

            pb.redirectErrorStream(true);
            Process p = pb.start();

            System.out.println(jsonString);

        }

    }
}