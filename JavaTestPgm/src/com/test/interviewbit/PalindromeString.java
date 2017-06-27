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
public class PalindromeString {

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama\"";
        // String str="kan ak";

        System.out.println(isPalindrome(str));

    }

    public static int isPalindrome(String a) {
        char[] ch = a.replaceAll("[.:, \"]", "").toLowerCase().toCharArray();
        int i = 0, j = ch.length - 1;
        for (; j > -1; i++, j--) {
            if (ch[i] != ch[j]) {
                return 0;
            }
        }

        return 1;
    }
}
