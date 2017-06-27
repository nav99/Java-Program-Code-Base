/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Mahadev
 */
public class FileDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\IBM_Pgm\\Read-from this file.txt"));
        String line = "";
        boolean flag = true;
        File destFile = new File("F:\\IBM_Pgm\\destination.txt");
        FileWriter fw = null;
        fw = new FileWriter("F:\\IBM_Pgm\\destination.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        while ((line = bufferedReader.readLine()) != null) {

            if (line.contains("WMB Projects")) {

                if (flag) {
                    // output.write("WMB Projects --".getBytes());
                    fw.write("WMB Projects --");
                    fw.write("\n");
                    bw.write("WMB Projects --");
                    bw.newLine();
                       // output.write("".getBytes());

                    System.out.println("WMB Projects --");
                    flag = false;
                }

                if (line.contains("A_LBGStartAPSSe")) {
                           // Byte b=Byte.valueOf("A_LBGStartAPSSe");

                    //output.write("A_LBGStartAPSSe".getBytes());
                    bw.write("A_LBGStartAPSSe");
                    bw.newLine();

                    System.out.println("A_LBGStartAPSSe");
                }
                if (line.contains("A_LBGCreateCCEA")) {
                    //output.write("A_LBGCreateCCEA".getBytes());
                    bw.write("A_LBGCreateCCEA");
                    bw.newLine();
                    System.out.println("A_LBGCreateCCEA");
                }
                if (line.contains("FTMLBGFCMAction")) {

                    //output.write("FTMLBGFCMAction".getBytes());
                    bw.write("FTMLBGFCMAction");
                    bw.newLine();
                    System.out.println("FTMLBGFCMAction");
                }

            }

        }
    }

}
