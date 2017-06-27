/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

import java.util.StringTokenizer;

/**
 *
 * @author Mahadev
 */
public class StringReverse {

    public static void main(String[] args) {
        String str="the sky    is   blue";
        
        System.out.println(str.length());
        System.out.println(reverseWords(str));

    }

    public static String reverseWords(String a) {

        StringTokenizer st = new StringTokenizer(a, " ");
        String strReversedLine = "";
        if (a.length() != 1) {
            while (st.hasMoreElements()) {
                strReversedLine = st.nextToken() + " " + strReversedLine;
            }
            return strReversedLine.trim();
        }
        else
            return a;
    }
}
