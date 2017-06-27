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
public class PrimeNo {

    public static void main(String[] args) {
        System.out.println("Enter range of no ");
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        for (;no1 <= no2; no1++) {
            if (isPrimeNo(no1)) {
                System.out.println(no1);
            }
        }
    }

    private static boolean isPrimeNo(int no) {
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                return false;
            }

        }
return true;
    }

}
