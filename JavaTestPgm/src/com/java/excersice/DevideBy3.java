/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class DevideBy3 {

    public static void main(String[] args) {
        System.out.println("Enter no");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int rem = 0, sum = 0, sumOdd = 0, sumEven = 0;
        String binaryNo = "";
        while (no != 0) {
            rem = no % 2;
            binaryNo = binaryNo + rem + "";
            no = no / 2;

        }

        for (int i = binaryNo.length()-1; i > -1; i--) {
            char ch = binaryNo.charAt(i);
            if (i % 2 == 1) {
                if (ch == 49) {
                    sumOdd = sumOdd +ch;
                 }
            }
            else if(i%2==0)
                {
                if (ch == 49) {
                    sumEven = sumEven +ch;
                 }
                } 
            

            System.out.print(ch);
        }
        sum=sumOdd-sumEven;
        if(sum==0)
            System.out.println("Devisble by 3");
        else
            System.out.println("Not Devisible by 3");
    }

}
