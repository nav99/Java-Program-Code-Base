/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

/**
 *
 * @author Mahadev
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dindayal on 03/04/17.
 */
public class Anagram {

    public static void main(String[] args) {
        System.out.println("Enter two string ");
        Scanner sc=new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        boolean isAnagram = true;

        int[] arr = new int[26];

        Arrays.fill(arr, 0);

        s1 = s1.replaceAll(" ", "").toLowerCase();
        s2 = s2.replaceAll(" ", "").toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("not anagram");
            System.exit(0);
        }
        
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 97] = arr[s1.charAt(i) - 97] + 1;
        }

        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i) - 97] = arr[s2.charAt(i) - 97] - 1;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram)
            System.out.println("yes, Its anagram");
        else
            System.out.println("no, Its not anagram");

    }
}