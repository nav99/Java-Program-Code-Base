/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class FileDataFind {

    public static void main(String[] args) throws IOException {
        File sourceFile = new File("F:\\IBM_Pgm\\Read-from this file.txt");
        File destFile = new File("F:\\IBM_Pgm\\destination.txt");
        Scanner in = null;
        boolean flag = true;
        InputStream input = null;
        OutputStream output = null;

        try {

            /* FileInputStream to read streams */
            input = new FileInputStream("F:\\IBM_Pgm\\Read-from this file.txt");

            /* FileOutputStream to write streams */
            output = new FileOutputStream(destFile);

            byte[] buf = new byte[1024];

            in = new Scanner(sourceFile);
            while (in.hasNext()) {
                String line = in.nextLine();

                if (line.contains("WMB Projects")) {

                    if (flag) {
                        output.write("WMB Projects --".getBytes());
                        
                        

                        System.out.println("WMB Projects -- \n");
                        flag = false;
                    }

                    if (line.contains("A_LBGStartAPSSe")) {

                        output.write("A_LBGStartAPSSe \n".getBytes());

                        System.out.println("A_LBGStartAPSSe");
                    }
                    if (line.contains("A_LBGCreateCCEA")) {
                        output.write("A_LBGCreateCCEA \n".getBytes());
                        System.out.println("A_LBGCreateCCEA");
                    }
                    if (line.contains("FTMLBGFCMAction")) {
                        output.write("FTMLBGFCMAction \n".getBytes());
                        System.out.println("FTMLBGFCMAction");
                    }

                }
            }
        } catch (FileNotFoundException e) {

        }
    }

}
