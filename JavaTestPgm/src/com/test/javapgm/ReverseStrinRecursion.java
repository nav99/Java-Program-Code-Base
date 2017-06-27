/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class ReverseStrinRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("oUTPUT : " + stringRecursion(str));
    }

    private static String stringRecursion(String str) {
       
        if ((null == str) || (str.length() <= 1)) {

            return str;
        }
        System.out.println(str.substring(1) + str.substring(0, 1));
        return stringRecursion(str.substring(1)) + str.substring(0, 1);
    }

}
