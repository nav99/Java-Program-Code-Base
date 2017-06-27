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
public class WordReverse {

    private static String reverse(String string) {
    if (string.isEmpty()) {
        return string;
    }
    int last = string.length();
    StringBuilder sb = new StringBuilder(string.length());
    boolean contextspace = ' ' == string.charAt(string.length() - 1);
    for (int i = string.length() - 1; i >= 0; i--) {
        if (contextspace != (string.charAt(i) == ' ')) {
            sb.append(string.substring(i + 1, last));
            last = i + 1;
            contextspace = !contextspace;
        }
    }
    sb.append(string.substring(0, last));
    return sb.toString();
}
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Reverse strin : "+reverse(str));
       
    }
}
