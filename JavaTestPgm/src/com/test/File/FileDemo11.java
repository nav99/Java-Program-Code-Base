
package com.test.File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.in;
import java.util.Scanner;

public class FileDemo11 {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("F:\\IBM_Pgm\\destination.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        File sourceFile = new File("F:\\IBM_Pgm\\Read-from this file.txt");
        boolean flag = true;
        Scanner in = new Scanner(sourceFile);

        while (in.hasNext()) {
            String line = in.nextLine();

            if (line.contains("WMB Projects")) {

                if (flag) {
                    bufferedWriter.write("WMB Projects --");
                    bufferedWriter.newLine();
                    System.out.println("WMB Projects -- \n");
                    flag = false;
                }

                if (line.contains("A_LBGStartAPSSe")) {
                    bufferedWriter.write("A_LBGStartAPSSe \n");
                    bufferedWriter.newLine();
                    System.out.println("A_LBGStartAPSSe");
                }
                if (line.contains("A_LBGCreateCCEA")) {
                    bufferedWriter.write("A_LBGCreateCCEA");
                    bufferedWriter.newLine();
                    System.out.println("A_LBGCreateCCEA");
                }
                if (line.contains("FTMLBGFCMAction")) {
                    bufferedWriter.write("FTMLBGFCMAction \n");
                    bufferedWriter.newLine();

                    System.out.println("FTMLBGFCMAction");
                }

            }// If Closed

            if (line.contains("WTX Projects")) {
                
                if (!flag) {
                    bufferedWriter.newLine();
                    bufferedWriter.write("WTX Projects --");
                    bufferedWriter.newLine();
                    System.out.println("WTX Projects -- \n");
                    flag = true;
                }
                if (line.contains("ISFToAPSRequest.mms")) {
                    bufferedWriter.write("ISFToAPSRequest.mms");
                    bufferedWriter.newLine();
                    flag = true;
                    System.out.println("FTMLBGFCMAction");
                }
                if (line.contains("IPSLPostRequestToISF.mms")) {
                    bufferedWriter.write("IPSLPostRequestToISF.mms");
                    bufferedWriter.newLine();
                    flag = true;
                    System.out.println("IPSLPostRequestToISF.mms");
                }

            }

        }
        bufferedWriter.close();

    }

}
