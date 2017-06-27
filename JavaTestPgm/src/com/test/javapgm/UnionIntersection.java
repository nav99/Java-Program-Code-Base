/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class UnionIntersection {

    public static void main(String[] args) {
        System.out.println("Enter two string ");

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        ArrayList<Character> output1 = new ArrayList<Character>();
        ArrayList<Character> output2 = new ArrayList<Character>();
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            if (str2.indexOf(ch1) == -1) {
                output1.add(ch1);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch2 = str2.charAt(i);
            if (str1.indexOf(ch2) == -1) {
                output2.add(ch2);
            }

        }

        System.out.println("Output" + output1);
        System.out.println("Output" + output2);
    }

}
