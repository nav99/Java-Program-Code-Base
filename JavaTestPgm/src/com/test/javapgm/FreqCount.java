/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class FreqCount {

    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        int[] arr = new int[26];
        Arrays.fill(arr, 0);
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 97] = arr[str.charAt(i) - 97] + 1;
        }
        for (int i = 0; i < 26; i++) {
            if(arr[i] != 0)
            {
                System.out.print((char) (i + 97));
                System.out.println(" : " + arr[i]);
            }

        }

    }

}
