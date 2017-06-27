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
public class LengthOfLastWord {

    public static void main(String[] args) {
        String str = "Hell world India Delhi abcdefgh";

        System.out.println(lengthOfLastWord(str));

    }

    public static int lengthOfLastWord(final String a) {
        String aNew= a.trim();
        int lastIndex = aNew.lastIndexOf(" ");
        if(lastIndex == -1) return aNew.length();
        int lenghtWord = 0;
        for (int i = lastIndex; i < aNew.length() - 1; i++) {
            lenghtWord++;
        }
        return lenghtWord;
    }
}
