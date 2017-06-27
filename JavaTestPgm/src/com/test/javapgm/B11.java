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
public class B11 {

    public static void main(String[] args) {
        int[] arr = new int[26];
        System.out.println("Enter two string ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean flag = true;

        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            System.exit(0);

        }

        Arrays.fill(arr, 0);

        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 97] = arr[str1.charAt(i) - 97] + 1;
        }

        for (int i = 0; i < str2.length(); i++) {
            arr[str2.charAt(i) - 97] = arr[str2.charAt(i) - 97] - 1;
        }

        for (int i = 0; i < 26; i++) {
            if(arr[i]!=0)
            {
            flag=false;
            break;
            }
        }
        
        if(flag)
            System.out.println("Is Anagram");
        else
            System.out.println("Not Anagaram");
        
    }

}
